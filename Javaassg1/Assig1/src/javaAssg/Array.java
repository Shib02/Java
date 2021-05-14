package javaAssg;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numberr");
		int no=sc.nextInt();
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			
			if(no==arr[i])
			{
				break;
			}
			
		}
		
		
		System.out.println("the number "+no+"is contained in arry");
		
		
		

	}


	}


