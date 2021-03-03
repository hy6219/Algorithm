package com.test01;

import java.util.Scanner;


public class StarInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution();
	}

	public static void Solution()
	{
		/**
		 * 한줄에 별표 문자를 입력된 줄수와 칸수만큼 출력
		 1****
		 *2***
		 **3**
		 ***4*
		 ****5
		 
		 내 생각->줄수 row 열수 col
		 0행-0열에 1출력, 1~4열에 *출력
		 1행-1열에 2출력, 
		 --> i행 i열에 (i+1)출력
		 	 i행 0~i-1 (i>=1)&& i+1~col-1 : *출력 
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("몇 줄 ?");
		int row=s.nextInt();
		System.out.println("몇 열 ?");
		int col=s.nextInt();
		
		if(col < row)
		{
			//col==row까지만 아래처럼 동작
			int i = 0;
			
			for(i = 0; i < col ; i++)
			{
				int j = 0;
				for(j = 0; j < i; j++)
				{
					System.out.print("*");
				}
				if(j == i)
				{
					System.out.print((i+1));
				}
				for(j = (i+1) ; j < col; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(; i < row; i++)
			{
				int j = 0;
				for(j = 0; j < col; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
		{
			for(int i = 0; i < row; i++)
			{
				int j = 0;
				for(j = 0; j < i; j++)
				{
					System.out.print("*");
				}
				if(j == i)
				{
					System.out.print((i+1));
				}
				for(j = (i+1) ; j < col; j++)
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
			}
		}
	}

