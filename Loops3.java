
public class Loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				/*if((i==0&&j!=0&&j!=(3*n)/4)||
						(j==0&&i!=0&&i<(n-1))||
						(i==(n-1)/2&&j>=(n-1)/2&&j<=(3*n)/4)||
						(j==(3*n)/4&&i>=(n-1)/2)||
						 (i==n-1&&j<(n-1)/2)||
						 (j==(n-1)/2&&i>=(n-1)/2))*/
				//H if(j==0||j==(3*n)/4||i==(n-1)/2&&j<=(3*n)/4)
				//P if(j==0||(i==0&&j!=(3*n)/4&&j<=(3*n)/4)||
				//(j==(3*n)/4)&&i>0&&i<(n-1)/2||
				//i==(n-1)/2&&(j!=(3*n)/4)&&j<=(3*n)/4)
				//A	if((j==0&&i!=0)||(i==0&&j!=0&&j<=(3*n)/4&&j!=(3*n)/4||(j==(3*n)/4&&i!=0)||i==(n-1)/2&&j<=(3*n)/4))
//					if(i==j||i+j==n-1||i==0||j==0||i==n-1||j==n-1)
				//B if((i==0&&j<(n-1)/2)||(j==0)||(i==(n-1)/2)&&j<(n-1)/2||(i==n-1&&j<(n-1)/2)||(j==(n-1)/2&&i!=0&&i!=(n-1)/2&&i!=(n-1)))                  
					if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2)
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
