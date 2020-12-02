package oops.learning;

public class Calculator {


	public static void main(String[] args) {
		int[] a  = {5,10,8,3,2,22}; 

		int[] b = {4,7,6}; 
		
		int cLength = a.length + b.length; 

		int[] c = new int[cLength]; 
		int j = 0; 
		for(int i =0;i<c.length;i++)
			{
			if(i<a.length)
			{
			c[i] = a[i];
			}
			else{
			c[i] = b[j]; 
			j++; 
		
			}
			}
		System.out.println("After merging ");
		System.out.println("----------------------------------");
		for(int i =0;i<c.length;i++)
		{
			System.out.print(c[i] + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------");
			}
		
		}


	
	

