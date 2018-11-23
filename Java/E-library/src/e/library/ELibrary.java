package e.library;

import java.util.Scanner;

public class ELibrary  {

    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    Books books =new Books();
    art arts = new art();
    return_e re = new return_e();
    
    
    System.out.println("welcome to our library " + "\n" +"********************************");
    System.out.println("please select: " +"\n"+"books"+"\n"+"arts" +"\n" +"Exit");
    String select = input.next();
    if(select.equalsIgnoreCase("books"))
    {
        books.allBooks();
        
    }else if(select.equalsIgnoreCase("art"))
    {
        arts.allart();
    }else if (select.equalsIgnoreCase("exit"))
    {
        System.out.println("Thanks");
    }
    else {
        re.erorr();
    }
}
}
