package e.library;

import java.util.Scanner;

public class Books extends art {
public String book1;
public String book2;
public String book3;



public void allBooks(){
    Scanner input = new Scanner(System.in);
    this.book1 = "Rami";
    this.book2 = "Rami";
    this.book3 = "Rami";
     System.out.println("\nWelcome to books selcetion" +"\n"+"please select book\n"+ book1 + "\n" + book2+ "\n"+ book3);
     String  select = input.next();
     if(select.equalsIgnoreCase(book1))
     {
         book1();
     }else if(select.equalsIgnoreCase(book2)){
         book2();
     }else if (select.equalsIgnoreCase(book3))
     {
        book3();
     }else{
         erorr();
     }
}
    public void book1()
    {   
    }
    public void book2()
    {
    }
    public void book3()
    {
        
    }
    public void erorr()
    {
    System.out.println("\nError in select\n");
    Scanner input = new Scanner(System.in);
    this.book1 = "Rami";
    this.book2 = "Rami";
    this.book3 = "Rami";
     System.out.println("\nWelcome to books selcetion" +"\n"+"please select book\n"+ book1 + "\n" +book2+ "\n"+ book3);
     String  select = input.next();
     if(select.equalsIgnoreCase(book1))
     {
         book1();
     }else if(select.equalsIgnoreCase(book2)){
         book2();
     }else if (select.equalsIgnoreCase(book3))
     {
        book3();
     }else{
         erorr();
     }   
    }
}
