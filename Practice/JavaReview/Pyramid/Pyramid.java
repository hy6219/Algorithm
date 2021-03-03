package com.pyramid;

/**
 * 
 * @author gs813
 *
 *피라미드 형태의 별 찍기
 */
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution(3);
		Solution(5);
	}
	

	/*
	 
	   	*	 
	   ***
	  *****
	출력하기
	
	나의 생각) 열 갯수col=2*line-1
	
	0행) col/2부터~col/2까지
	1행) col/2-1부터~col/2+1까지
	2행) col/2-2부터~col/2+2까지
	-->col/2-xth_row~col/2+xth_row
	 */
	public static void Solution(int line)
	{
		int col_num=2*line - 1;
		for(int i =0 ; i < line; i++)
		{
			//빈칸
			for(int j = 0; j <((col_num/2) - i); j++)
			{
				System.out.print(" ");
			}
			//*
			for(int j =((col_num/2) - i); j <= ((col_num/2) + i); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
