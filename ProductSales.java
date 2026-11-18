
import com.mycompany.iproduct.IProduct;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author PC
 */

/**
 * Implements IProduct to calculate total, average, maximum, and minimum
 * sales from a two-dimensional array of quarterly sales data.
 */
public class ProductSales implements IProduct {

    /**
     * Calculates the sum of all sales across all years and quarters.
     *
     * @param productSales 2D array containing sales data [years][quarters]
     * @return total sales as an integer
     */
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] yearSales : productSales) {
            for (int sale : yearSales) {
                total += sale;
            }
        }
        return total;
    }

    /**
     * Calculates the average sale value across all recorded quarters.
     *
     * @param productSales 2D array containing sales data [years][quarters]
     * @return average sales as a double
     */
    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = 0;

        for (int[] yearSales : productSales) {
            count += yearSales.length;
        }

        // Avoid division by zero if array is empty
        return count > 0 ? (double) total / count : 0.0;
    }

    /**
     * Finds the highest single quarterly sale figure.
     *
     * @param productSales 2D array containing sales data [years][quarters]
     * @return maximum sale value
     */
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int[] yearSales : productSales) {
            for (int sale : yearSales) {
                if (sale > max) {
                    max = sale;
                }
            }
        }
        return max;
    }

    /**
     * Finds the lowest single quarterly sale figure.
     *
     * @param productSales 2D array containing sales data [years][quarters]
     * @return minimum sale value
     */
    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int[] yearSales : productSales) {
            for (int sale : yearSales) {
                if (sale < min) {
                    min = sale;
                }
            }
        }
        return min;
    }
}