package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        commodity c1=new commodity();

	// write your code here
        Scanner myScanner = new Scanner(System.in);
        int profit=myScanner.nextInt();

        System.out.println ("The buying price :"+c1.buying_price);
        System.out.println ("The buying price :"+c1.transport_cost);
        System.out.println("The buy profit is >"+c1.get_out(profit));



    }

}
