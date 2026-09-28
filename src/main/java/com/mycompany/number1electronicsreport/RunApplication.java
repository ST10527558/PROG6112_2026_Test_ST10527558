/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.number1electronicsreport;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author emeris
 */
//Question 2 Run application class
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String consoleType = "";
        String storeName = "";
        int TotalSales = 0;
        int option = 0;

        System.out.println("Select the console type");
        System.out.println("""
                           1) PS5
                           2) XBOX
                           3) SWITCH
                           """);
        option = sc.nextInt();
        sc.nextLine();


         if (option == 1) {
            consoleType = "PS5";
        }
        else if (option == 2) {
            consoleType = "XBOX";
        }
        else if (option == 3) {
            consoleType = "SWITCH";
        }
         
        System.out.println("Enter the store:");
        storeName = sc.nextLine();
        
        System.out.println("Enter the total sales of " + consoleType + " consoles for " + storeName + ":");
        TotalSales = sc.nextInt();
        
        System.out.println();
        
        ConsoleSales cs = new ConsoleSales(consoleType, storeName, TotalSales);
        cs.printReport();

    }

}
