package javaExcercises;

public class Program17
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) //rows
		{
			for(int j=1;j<=i;j++) //columns
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
for i in range(1,6):
for j in range(1,i+1):
    print(j,end="")
print()
*/