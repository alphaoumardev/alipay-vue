package com.alpha.alipay.javaclass;

class Enumeration
{
  enum Level
  {
    LOW,
    MEDIUM,
    HIGHDEGREE,
    MAX,
    FINAL
  }

    public static void main(String[] args)
    {
        Level my_level = Level.MAX;
        System.out.println("My enum level is "+my_level);
        // Using switch to choose one element
        switch(my_level)
        {
          case LOW:
          System.out.println("The level is low at this stage");
          break;
          case MEDIUM:
          System.out.println("The level is at the middle");
          break;
          case HIGHDEGREE:
          System.out.println("The level is high as well");
          break;
          case MAX:
          System.out.println("The max level");
          break;
          case FINAL:
          System.out.println("The final level");
          default:
            System.out.println("The system is under loading");
        }
        for(Level le_niveau : Level.values())
        {
          System.out.println("My enum level is "+le_niveau);
        }
    }
}
