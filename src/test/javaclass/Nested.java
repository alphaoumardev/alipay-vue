package com.alpha.alipay.javaclass;

import java.util.Scanner;

class Nested
{
    double price;
    Scanner prompt = new Scanner(System.in);

    class The_cercle_area
    {
        public double cercle()
        {
            final double pi = 3.14;
            double radius = 5.23;
            double area = pi * radius * radius;
            System.out.println("How much is the area of the cercle ?");
            return area;
        }
    }

    class Pc
    {
        public String band(String name)
        {
            return name;
        }
    }

    public class Battery
    {
        public class BatteryForm
        {
            public class BatteryCapacity
            {
                int the_battery_capcity()
                {
                    System.out.println("Please prompt the actual charge of the battery");

                    int charge = prompt.nextInt();
                    final int time = 24;
                    int capacity = (charge * time) / 100;
                    if (capacity < 10) {
                        System.out.println("The battery is low Please put in capacity");
                    } else if (capacity >= 100) {
                        System.out.println("The battery is charged ");
                    } else {
                        System.out.println("The battery is over charged");
                    }
                    return capacity;
                }

            }

            double The_batterysform()
            {
                System.out.println("The battery's form is a small boxof cartoon");
                return 0;
            }
        }

        double duree(double power)
        {
            return power;
        }
    }


    public static void main(String[] args)
    {

        Nested the_inner = new Nested();
        Pc outreObjet = the_inner.new Pc();
        The_cercle_area air = the_inner.new The_cercle_area();
        Battery la_duree = the_inner.new Battery();
        Battery.BatteryForm la_forme = la_duree.new BatteryForm();
        Battery.BatteryForm.BatteryCapacity la_capacite = la_forme.new BatteryCapacity();

        System.out.println("The area of the cercle is " + air.cercle());
        System.out.println("my Inner is " + outreObjet.band("Tesla"));

        System.out.println("The lifetime of the battery is " + la_duree.duree(43.43));
        System.out.println("The area of the cercle is " + la_forme.The_batterysform());
        System.out.println("The capacity of the battery is " + la_capacite.the_battery_capcity() + " Amperes");

    }
}
