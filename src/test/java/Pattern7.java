
public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)                     //i=1        i=2      i=3   4    5
		{
			for(int j=5;j>i;j--)                   //j=5432   j=543     54   5     0
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)           
			{
				System.out.print(k);      
			}
			for(int m=i;m>1;m--)
			{
				System.out.print(m-1);   //0   1   
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)                     //i=1        i=2      i=3   4    5
		{
			for(int j=5;j>i;j--)                   //j=5432   j=543     54   5     0
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)           
			{
				System.out.print(k);      
			}
			for(int m=i;m>1;m--)
			{
				System.out.print(m-1);   //0   1   
			}
			System.out.println();
		}
	}

}
