package com.java.solid.singleresponsibility;

import java.util.Arrays;
import java.util.List;

public class MainSales {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
            new Sale("Laptop", 1, 2500),
            new Sale("Smartphone", 3, 750.90),
            new Sale("Headphone", 15, 345.80),
            new Sale("Monitor", 5, 1230.50)
        );

        SalesReport report = new SalesReport(sales);
        String reportContent = report.generateReport();

        System.out.println(reportContent);
    }
}
