/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronicsreport;

/**
 *
 * @author emeris
 */
//Question 2 inheritance class
public class ConsoleSales extends ConsoleClass{
    
    public ConsoleSales(String inconsoleType, String instoreName, int intotalSales) {
        super(inconsoleType, instoreName, intotalSales);
    }
    
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType() + "\nSTORE: " + getStore() + "\nTOTAL SALES: " + getTotalSales());
    }
}
