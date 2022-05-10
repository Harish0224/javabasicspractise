package com.qa.practise;

import java.util.Scanner;

public class practise {


	public static void main(String[] args) {
		practise c=new practise();
		c.tests();

	}

	public void tests() {
   Scanner a=new Scanner(System.in);
   System.out.println("Enter the name");
   String b=a.next();
   System.out.println("Entered name is "+b);
   }
	} 
