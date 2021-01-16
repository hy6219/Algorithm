package Arr_MatrixMultiply;
import java.util.*;
public class Arr_MatrixMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m1=new int[3][2];
		int[][] m2=new int[2][3];
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("m1 행렬 값을 채워봅시다");
		for(int i=0;i<m1.length;i++)
		{
			System.out.printf("m1의  %d번째 행부터 입력해주세요\n", i);
			for(int j=0;j<m1[i].length;j++)
			{
				m1[i][j]=s.nextInt();
			}
		}
		System.out.println("m2 행렬 값을 채워봅시다");
		for(int i=0;i<m2.length;i++)
		{
			System.out.printf("m2의  %d번째 행부터 입력해주세요\n", i);
			for(int j=0;j<m2[i].length;j++)
			{
				m2[i][j]=s.nextInt();
			}
		}
		System.out.println("m1 * m2를 해붑시다!");
		int[][] res=new int[3][3];
		
		//3행
		for(int i=0;i<m1.length;i++)
		{
			//3열
			for(int j=0;j<m2[0].length;j++)
			{
				//res[i][j]는 고정시켜야! &&m2의 열단위를 움직이기!
				for(int k=0;k<m2.length;k++)
				{
					res[i][j]+=m1[i][k]*m2[k][j];
				}
			}
		}
		for(int[] tmp:res)
		{
			for(int i:tmp)
			{
				System.out.printf("%8d", i);
			}
			System.out.println();
		}
		System.out.println();
	}

}
