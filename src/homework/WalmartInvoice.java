package homework;

public class WalmartInvoice {

	public static void main(String[]args) {	
	
	String shopName ="Walmart";
	String shopAddress ="123 Kissena Bulevaard";
	String shopPhone ="7185649876";
	String invoiceName ="INVOICE";
	//String itemName1 = "Cucumber";
	//String itemName2 ="Onion";
	//String itemNum1 ="1001";
	//String itemNum2="1010";
	double itemName1Price=14.50;
	double itemName2Price=32.87;
	double item1Weight =5;
	double item2Weight =6;
	double salesTaxPercentage =8.85;
	double item1Amount= itemName1Price * item1Weight;
	double item2Amount =itemName2Price * item2Weight;
	double totalAmount =item1Amount + item2Amount;
	double salesTaxAmount = totalAmount*salesTaxPercentage/100;
	

	System.out.println("======================="+shopName+"========+=======================");
	System.out.println("======================="+shopAddress+"==================");
	System.out.println("======================="+shopPhone+"=============================");
	System.out.println("**************************************************************");
	System.out.println();
    System.out.println("==========================="+invoiceName+"============================");
    System.out.println();
    System.out.println("**************************************************************");
    System.out.println();
    System.out.println ("Item Number \t Item Name \t Item Weight in Lb \t Item Price \t Item Amount");
    System.out.println ("1001 \t \t Cucumber \t 5 \t \t \t 14.5 \t\t "+item1Amount);
    System.out.println ("1010 \t \t Onion \t \t 6 \t \t \t 32.87\t \t "+item2Amount);
    System.out.println("Total amount \t \t \t \t \t \t \t \t "+totalAmount);                                                              	
    System.out.println("Sales Tax Percentage 8.85% \t \t \t \t \t \t "+salesTaxPercentage);
    System.out.println("Sales Tax Amount \t \t \t \t \t \t \t "+salesTaxAmount);
    System.out.println();
    System.out.println();
    System.out.println("\t \t \t Thank you for shopping with us");
	}
}