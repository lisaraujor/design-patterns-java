package com.java.solid.SingleResponsibility;

import java.util.List;

public class SalesReport {
    private List<Sale> sales;

    public SalesReport(List<Sale> sales){
        this.sales = sales;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("\nSALES REPORT\n");
        report.append("====================\n");

        for (Sale sale : sales) {
            report.append("Product: ").append(sale.getProductName())
                .append("\nQuantity: ").append(sale.getQuantity())
                .append("\nPrice: ").append(sale.getPrice())
                .append("\n\n");
        }

        return report.toString();
    }
}
