
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 && i<(3*(n-3))/4 || j==n-1 && i<(3*(n-3))/4 || i>=j && j<=(n-1)/2 && i<(3*(n-3))/4 || i+j>=n-1 && j>=(n-1)/2 && i<(3*(n-3))/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
