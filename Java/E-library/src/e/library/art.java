
package e.library;

import java.util.Scanner;

public class art {
public String art1;
public String art2;
public String art3;

public void allart(){
    Scanner input = new Scanner(System.in);
    this.art1 = "1- Rami";
    this.art2 = "2- Rami";
    this.art3 = "3- Rami";
     System.out.println("Welcome to art selcetion" +"\n"+"please select art\n "+ art1 + "\n" + art2+ "\n"+ art3);
    String select = input.next();
     if(select.equalsIgnoreCase(art1))
     {
         art1();
     }else if(select.equalsIgnoreCase(art2)){
         art2();
     }else if (select.equalsIgnoreCase(art3))
     {
        art3();
     }else{
         erorr();
     }
}
    public void art1()
    {   
    }
    public void art2()
    {
    }
    public void art3()
    {
        
    }
    public void erorr()
    {
       System.out.println("\nError in select\n");
     Scanner input = new Scanner(System.in);
    this.art1 = "1- Rami";
    this.art2 = "2- Rami";
    this.art3 = "3- Rami";
     System.out.println("\nWelcome to books selcetion" +"\n"+"please select book \n"+ art1+ "\n" + art2+ "\n"+ art3);
     String  select = input.next();
     if(select.equalsIgnoreCase(art1))
     {
         art1();
     }else if(select.equalsIgnoreCase(art2)){
         art2();
     }else if (select.equalsIgnoreCase(art3))
     {
        art3();
     }else{
         erorr();
     }   
    }
}
