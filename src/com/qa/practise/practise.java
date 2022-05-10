package com.qa.practise;

import java.util.Scanner;

public class practise  extends  Harish{


	public static void main(String[] args) {
		practise a=new practise();
		a.tests();
		Dog();

	}

	public void tests() {
   Scanner a=new Scanner(System.in);
   System.out.println("Enter the number");
   int b=a.nextInt();
   System.out.println("Entered number is "+b);
   int b1=20;
   int a1=20;
   int d=a1+b1;
   System.out.println(d);
   }
	} 
