package pck1;

import java.util.Scanner;

public class TwoDimArray {
	
	  

	
	  

	
	public static void main(String[] args) { 

	int[][] arr=new int[4][3]; 

	for(int i=0;i<4;i++) { 

	for(int j=0;j<3;j++) { 

	System.out.println("Enter "+"a["+i +"]"+"["+j+"]" +" value :"); 

	Scanner sc=new Scanner(System.in); 

	int val=sc.nextInt(); 

	arr[i][j]=val; 

	} 

	  

	} 

	for(int a=0;a<4;a++) { 

	System.out.println(); 

	for(int b=0;b<3;b++) { 

	//System.out.println("Enter "+"a["+arr[a] +"]"+"["+arr[b]+"]" ); 

	System.out.print(arr[a][b]); 

	} 

	  

	} 

	  

	} 

	} 

	 

	 

	 
	
	
	
	
	


//	public static void main(String[] args) {
//		int[][] ar=new int[4][3];
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println("Enter "+"a["+i+"]"+"["+j+"]"+"value:");
//				Scanner s=new Scanner(System.in);
//				int r=s.nextInt();
//				ar[i][j]=r; 
//			}
//		}
//		for(int a=0;a<4;a++) {
//			for(int b=0;b<3;b++) {
//				System.out.println("Enter "+"a["+ar[a]+"]"+"["+ar[b]+"]"+"value:");
//				System.out.println(ar[a][b]);
//			}
//		}
//
//	}
//
//}
//public static void main(String[] args) { 
//
//int[][] arr=new int[4][3]; 
//
//for(int i=0;i<4;i++) { 
//
//for(int j=0;j<3;j++) { 
//
//System.out.println("Enter "+"a["+i +"]"+"["+j+"]" +" value :"); 
//
//Scanner sc=new Scanner(System.in); 
//
//int val=sc.nextInt(); 
//
//arr[i][j]=val; 
//
//} 
//
//  
//
//} 
//
//for(int a=0;a<4;a++) { 
//
//System.out.println(); 
//
//for(int b=0;b<3;b++) { 
//
////System.out.println("Enter "+"a["+arr[a] +"]"+"["+arr[b]+"]" ); 
//
//System.out.print(arr[a][b]); 
//
//} 
//
//  
//
//} 
//
//  
//
//} 
//
//} 

 

 

 

 