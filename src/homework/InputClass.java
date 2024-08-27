package homework;

import java.util.Scanner;

public class InputClass {
	private String top1= ("================== Walmart Supercenter ==================");
	private String phn= ("============== Phone Number: 347-323-6567 =============== ");
	private double sales_Tax=6.5;
	private double milktotl;
	private double eggstotl;
	private double ricetol;
	private double daltotl;
	private double salttotl;
	
	//create block and using /n,/t
	{
		System.out.println("\tMilk Price is - $5.30 \n\tEggs is -       $8.30\n\tRice Price is - $5.30\n\tDal Price is -  $5.30\n\tSalt Price is - $5.30");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(top1);
		System.out.println(phn);
		
	}
	
	public InputClass () {
		
			Scanner scan= new Scanner(System.in);

			System.out.println();
			//milk price
			System.out.print("Please Enter the Milk Price- ");
			double mp=scan.nextDouble ();
			//Milk Quantity
			System.out.print("Please Enter the Milk Quantity- ");
			int mq=scan.nextInt ();
			//Eggs price
			System.out.print("Please Enter the Eggs Price- ");
			double ep=scan.nextDouble();
			//Egg Quantity
			System.out.print("Please Enter the Eggs Quantity- ");
			int eq=scan.nextInt ();
			System.out.print("Please Enter the Rice Price- ");
			double rp=scan.nextDouble();
			//Rice Quantity
			System.out.print("Please Enter the Rice Quantity- ");
			int rq=scan.nextInt ();
			System.out.print("Please Enter the Dal Price- ");
			double dp=scan.nextDouble();
			//Dal Quantity
			System.out.print("Please Enter the Dal Quantity- ");
			int dq=scan.nextInt ();
			System.out.print("Please Enter the Salt Price- ");
			double sp=scan.nextDouble();
			//Salt Quantity
			System.out.print("Please Enter the Salt Quantity- ");
			int sq=scan.nextInt ();
		//Create object for Prices Class
			Prices pr= new Prices(mp, ep, rp, dp, sp);
			// //Create object for product Class
			Products_Quantity pq= new Products_Quantity (mq, eq, rq, dq, sq);
			
			//print a gloable variable
			System.out.println(top1);
			System.out.println(phn);
			
			//calculation
			milktotl=mp*mq*mp*mq*sales_Tax/100;
			System.out.println("Total Milk price- "+milktotl);

}
}

