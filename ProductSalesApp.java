/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
//package productsalesapp;

/**
 * Main application class that generates and displays the Product Sales Report
 * using single and two-dimensional arrays.
 */
public class ProductSalesApp {

    public static void main(String[] args) {
        // Single-dimensional arrays for row and column headers
        String[] years = {"YEAR 1", "YEAR 2"};
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};

        // Two-dimensional array storing the supplied product sales data
        int[][] salesData = {
            {300, 150, 700}, // Year 1: Q1, Q2, Q3
            {250, 200, 600}  // Year 2: Q1, Q2, Q3
        };

        // Print rows and columns of the sales data (Required by marking rubric)
        System.out.printf("%-10s %-12s %-12s %-12s%n", "", quarters[0], quarters[1], quarters[2]);
        for (int i = 0; i < salesData.length; i++) {
            System.out.printf("%-10s ", years[i]);
            for (int j = 0; j < salesData[i].length; j++) {
                System.out.printf("%-12d ", salesData[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // Instantiate ProductSales calculator
        ProductSales salesCalculator = new ProductSales();

        // Perform calculations
        int totalSales = salesCalculator.TotalSales(salesData);
        double averageSales = salesCalculator.AverageSales(salesData);
        int maxSale = salesCalculator.MaxSale(salesData);
        int minSale = salesCalculator.MinSale(salesData);

        // Display formatted Product Sales Report matching the sample output
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------------------");
        System.out.println("Total sales:    " + totalSales);
        System.out.println("Average sales:  " + Math.round(averageSales));
        System.out.println("Maximum sale:   " + maxSale);
        System.out.println("Minimum sale:   " + minSale);
        System.out.println("---------------------------------------");
    }
}