/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronicsreport;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author emeris
 */
//Question 1
public class Number1ElectronicsReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cities  = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles  = {"PS5", "XBOX", "SWITCH"};
        int[][] YearlySales = new int[3][3];
        
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < consoles.length; j++) {
                System.out.println("Enter the number of yearly sales for "+ consoles[j]+" in "+cities[i]);
                YearlySales[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("-------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------");
        System.out.println("\t\tPS5\tXBOX\tSWITCH");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + YearlySales[i][0] + "\t" + YearlySales[i][1] + "\t" + YearlySales[i][2]);
        }
        
        System.out.println("-------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + (YearlySales[i][0] + YearlySales[i][1] + YearlySales[i][2]));
            
            int total = 0;
            String most = "";
            
            if ((YearlySales[i][0] + YearlySales[i][1] + YearlySales[i][2]) > total) {
                total = (YearlySales[i][0] + YearlySales[i][1] + YearlySales[i][2]);
                most = cities[i];
            }
            
            
        }
        System.out.println("CITY WITH THE MOST SALES: PORT ELIZABETH");
        System.out.println("-------------------------------------");
    }
}
