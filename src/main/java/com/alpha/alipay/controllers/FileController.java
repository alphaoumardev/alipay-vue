package com.alpha.alipay.controllers;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import com.alpha.alipay.response.Result;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.google.gson.JsonObject;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/files")
@Api(tags = "upload", value = "File controller")
public class FileController
{
    @Value("${server.port}")
    private String port;
    @Value("${file.ip}")
    private String ip;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException
    {
        String original= file.getOriginalFilename();
        String flag = IdUtil.simpleUUID();
        String fileRoot= System.getProperty("user.dir")+"/src/main/resources/files/"+flag+"-"+original;
        FileUtil.writeBytes(file.getBytes(),fileRoot);
        return Result.success("http://"+ip +":"+port+"/files/"+flag);
    }
    @PostMapping("/editor/upload")
    public JSON editorUpload(MultipartFile file) throws IOException
    {
        String original= file.getOriginalFilename();
        String flag = IdUtil.simpleUUID();
        String fileRoot= System.getProperty("user.dir")+"/src/main/resources/files/"+flag+"-"+original;
        FileUtil.writeBytes(file.getBytes(),fileRoot);
        String url="http://"+ip +":"+port+"/files/"+flag;

        JSONObject json = new JSONObject();
        json.set("errno", 0);
        JSONArray arr = new JSONArray();
        JSONObject data = new JSONObject();
        arr.add(data);
        data.set("url", url);
        json.set("data", arr);
        return json;  // 返回结果 url
    }

    @GetMapping("/{flag}")
    public void download(HttpServletResponse response, @PathVariable String flag)
    {
        OutputStream os;
        String fileRoot= System.getProperty("user.dir")+"/src/main/resources/files/";
        List<String> root = FileUtil.listFileNames(fileRoot);
        String fileName = root.stream().filter(name->name.contains(flag)).findAny().orElse("Failed");
        try
        {
            if(StrUtil.isNotBlank(fileName))
            {
                response.addHeader("Content-Disposition", "attachement;filename="+ URLEncoder.encode(fileName, StandardCharsets.UTF_8));
                response.setContentType("application/octet-stream");
                byte[] bytes = FileUtil.readBytes(root+fileName);
                os=response.getOutputStream();
                os.write(bytes);
                os.flush();
                os.close();
            }

        } catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("downloading the file has failed " + e);
        }

    }

}
