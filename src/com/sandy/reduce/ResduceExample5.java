package com.sandy.reduce;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ResduceExample5 {
	public static void main(String[] args) {
		// create list of invoices by using wrapper class

		List<Invoice> listOfInvoices = Arrays.asList(
				new Invoice("productA31", BigDecimal.valueOf(131), BigDecimal.valueOf(5)),
				new Invoice("productA32", BigDecimal.valueOf(121), BigDecimal.valueOf(3)),
				new Invoice("productA33", BigDecimal.valueOf(99), BigDecimal.valueOf(1.5))

		);
		
		BigDecimal sum = listOfInvoices.stream().map(prod->prod.getQTY().multiply(prod.getPrice())).reduce(BigDecimal.ZERO,BigDecimal::add);
		// show the result returned by the reduce method  
        System.out.println(sum);  
	}

}

//create wrapper class  
class Invoice {
	String invoiceNo;
	BigDecimal price;
	BigDecimal qty;

	public Invoice(String invoiceNo, BigDecimal price, BigDecimal qty) {
		this.invoiceNo = invoiceNo;
		this.price = price;
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public BigDecimal getQTY() {
		return qty;
	}
}