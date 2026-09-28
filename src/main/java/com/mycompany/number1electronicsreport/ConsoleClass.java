/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronicsreport;

/**
 *
 * @author emeris
 */
//Question 2 abstract class
public abstract class ConsoleClass implements IConsoles{
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    public ConsoleClass(String inconsoleType, String instoreName, int intotalSales) {
        consoleType = inconsoleType;
        storeName = instoreName;
        totalSales = intotalSales;
    }


    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    
    
    
}
