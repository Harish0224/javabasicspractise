package com.qa.practise;

import java.util.Scanner;

public class practise {


	public static void main(String[] args) {
		practise c=new practise();
		c.tests();

	}

	public void tests() {
   Scanner a=new Scanner(System.in);
   System.out.println("Enter the number");
   int b=a.nextInt();
   System.out.println("Entered number is "+b);
   }
	} 
