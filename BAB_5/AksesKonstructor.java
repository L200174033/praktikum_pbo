
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-RPL
 */
public class AksesKonstructor {
    public static void main(String[] args) throws ParseException{
        Konstructor konstructor = new Konstructor();
        
        System.out.println("\n");
        
        Buku buku1 = new Buku("J.K. Rowling", "Harry Potter", 2000, 3, 100000.00);
        Buku buku2 = new Buku("Naimah", "INGOY", 2018, 3, 65000.00);
        Buku buku3 = new Buku("AB", "Buku3", 2007, 3, 87000.00);
        Buku buku4 = new Buku("BC", "Buku4", 2006, 4, 55000.00);
        Buku buku5 = new Buku("DE", "Buku4", 2005, 5, 89000.00);
        Buku buku6 = new Buku("FG", "Buku4", 2004, 6, 33000.00);
        Buku buku7 = new Buku("HI", "Buku4", 2003, 7, 78000.00);
        Buku buku8 = new Buku("JK", "Buku4", 2002, 8, 35000.00);
        Buku buku9 = new Buku("LM", "Buku4", 2001, 9, 89000.00);
        Buku buku10 = new Buku("NO", "Buku4", 2000, 2, 35000.00);
        
        buku1.infoBuku();
        buku2.infoBuku();
        buku3.infoBuku();
        buku4.infoBuku();
        buku5.infoBuku();
        buku6.infoBuku();
        buku7.infoBuku();
        buku8.infoBuku();
        buku9.infoBuku();
        buku10.infoBuku();
        
        OverloadingCons over1 = new OverloadingCons();
        OverloadingCons over2 = new OverloadingCons(123, "salsasasmita");
        OverloadingCons over3 = new OverloadingCons(190, 3);
        OverloadingCons over4 = new OverloadingCons(111, new Date());
        OverloadingCons over5 = new OverloadingCons(65, "salsasasmita", 4, new Date());
        
        CustomerData cd1 = new CustomerData("Salsa", "Madiun", new SimpleDateFormat("dd/mm/yyyy").parse("28/06/1999"), "Pelajar", 1500000);
        CustomerData cd2 = new CustomerData("Pelajar", 1500000);
        CustomerData cd3 = new CustomerData("Pelajar", 1500000);
        CustomerData cd4 = new CustomerData("Kun", "Karanganyar", new SimpleDateFormat("dd/mm/yyyy").parse("17/03/1997"), "Pelajar", 1500000);
        CustomerData cd5 = new CustomerData("Reza", "Solo", new SimpleDateFormat("dd/mm/yyyy").parse("30/03/1999"), "Pelajar", 1500000);
        CustomerData cd6 = new CustomerData("Ayasha", "Solo", new SimpleDateFormat("dd/mm/yyyy").parse("28/05/1999"), "Pelajar", 1500000);
        CustomerData cd7 = new CustomerData("Tino", "Solo", new SimpleDateFormat("dd/mm/yyyy").parse("28/05/1999"), "Pelajar", 1500000);
        CustomerData cd8 = new CustomerData("Alvian", "Wonogiri", new SimpleDateFormat("dd/mm/yyyy").parse("28/05/1999"), "Pelajar", 1500000);
        CustomerData cd9 = new CustomerData("Pelajar", 1500000);
        CustomerData cd10 = new CustomerData("Pelajar", 1500000);
        
    }
}
