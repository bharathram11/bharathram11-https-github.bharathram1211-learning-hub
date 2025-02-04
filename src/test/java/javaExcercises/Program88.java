package javaExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program88
{
	public static void main(String[] args)
	{
		//List with example values
		List<Integer> l=Arrays.asList(12,56,78,90,-8);
		//Display squares of list values  in different ways
		//way-1: using "for" loop
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)*l.get(i)+" ");
		}
		System.out.println();
		
		//way-2: using "for each" loop
		for(int x:l)
		{
			System.out.print(x*x+" ");
		}
		System.out.println();
		
		//way-3 using "while" loop
		int i=0;
		while(i<l.size())
		{
			System.out.print(l.get(i)*l.get(i)+" ");
			i++;
		}
		System.out.println();
		
		//way-4 using do-while loop
		int j=0;
		do
		{
			System.out.print(l.get(j)*l.get(j)+" ");
			j++;
		}while(j<l.size());
		System.out.println();
		
		//way-5 using streams
		System.out.println(l.stream().map(x->x*x).collect(Collectors.toList()));
		
		//way-6 using recursion
		printArray(l, 0, l.size()-1); //call a method
	}
	
	public static void printArray(List<Integer> l, int i, int n)
	{
		if(i<=n)
		{
			System.out.print(l.get(i)*l.get(i)+" ");
			printArray(l,i+1,n); //calling itself
		}
	}
}






