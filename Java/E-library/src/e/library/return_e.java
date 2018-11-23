/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.library;

import java.util.Scanner;

class return_e {
    public void erorr()
    {
        System.out.println("\nerror select \n");
            // all constructor
    //user values
    Scanner input = new Scanner(System.in);
    //import all books
    Books books =new Books();
    // import all artcals
    art arts = new art();
    //backup paln
    return_e re = new return_e();
    // greting 
    System.out.println("please select: " +"\n"+"books"+"\n"+"arts"+"\n" +"Exit");
    String select = input.next();
    if(select.equalsIgnoreCase("books"))
    {
        books.allBooks();
    }else if(select.equalsIgnoreCase("art"))
    {
        arts.allart();
    }else if (select.equalsIgnoreCase("exit"))
    {
    }else{
        re.erorr();
    }
        
    }
}
