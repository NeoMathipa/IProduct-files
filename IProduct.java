/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iproduct;
//package productsalesapp;

/**
 *
 * @author PC
 */

/**
 * Interface defining the required calculation methods for product sales.
 */
public interface IProduct {
    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSale(int[][] productSales);
    int MinSale(int[][] productSales);
}