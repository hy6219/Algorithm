package Arr_Bingo;

import java.util.Scanner;

public class Arr_Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=5;//macro const.
		int[][] bingo=new int[SIZE][SIZE];
		//bingo initialization
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				bingo[i][j]=(int)(Math.random()*SIZE*SIZE)+1;//random number 1~25
			}
		}
		//check bingo board
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				System.out.printf("%5d", bingo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		Scanner s=new Scanner(System.in);
		

		int check=0;//total bingo checker
		
		outer:
		while(true)
		{
			//get input per loop(outer)
			System.out.println("1~25의 숫자를 입력해주세요(종료:0)>");
			int inp=0;
			inp=s.nextInt();
			//whenever get input of zero, get out!
			if(inp==0)
			{
				System.out.printf("입력값: %d, 종료!\n",inp);
				break outer;
			}
			//whenever get input>25, request re-write input from user
			if(inp>25)
			{
				System.out.printf("입력값: %d, 다시!\n",inp);
				continue outer;//go to outer loop
			}
			//bingo values(horizontal, vertical, diagonal line)
			int h=0;//horizontal
			int v=0;//vertical
			/***
			 * digonal line
			 * from 'Top Left' to 'Bottom Right'(digonal line1)
			 * 1)l_r: count 0 values(user input==bingo board value) on this line
			 * 2)l: check all values on line -->check digonal line bingo
			 * 
			 * from 'Top Right' to 'Bottom Left'(digonal line2)
			 * 1)r_l: count 0 values(user input==bingo board value) on this line
			 * 2)r: check all values on line -->check digonal line bingo
			 * 
			 * +IN digonal line,
			 * don't need to re-initialize count value(like temp variable) for check bingo!
			 * 
			 * JUST UPDATE COUNT STATUS ON GLOBAL VARIABLE!
			 */
			int l_r=0;//↘
			int l=0;
			int r_l=0;//↙
			int r=0;
			/**
			 * mark user input on bingo board &&
			 * 
			 * check bingo values(horizontal, vertical, diagonal line) using 
			 * bingo value variables
			 */
			while(true)
			{
				for(int i=0;i<SIZE;i++)
				{
					int temp=0;//count bingo trial of horizontal direction(per row)
					int v_t=0;//count bingo trial of vertical direction(per col)
					for(int j=0;j<SIZE;j++)
					{
						bingo[i][j]=(bingo[i][j]==inp)?0:bingo[i][j];
						if(bingo[i][j]==0)
						{
							temp++;
						}
						if(bingo[j][i]==0)
						{
							v_t++;
						}
					}
					if(temp==5)
					{
						h++;
					}
					if(v_t==5)
					{
						v++;
					}
					if(bingo[i][i]==0)
					{
						l_r++; //count for digonal line1
					}
					if(bingo[i][SIZE-1-i]==0)
					{
						r_l++;//count for digonal line2
					}
					if(l_r==5)
					{
						l++;//bingo for digonal line1
					}
					if(r_l==5)
					{
						r++;//bingo for digonal line2
					}
				}
				check=h+v+l+r;//total bingo
				for(int i=0;i<SIZE;i++)
				{
					for(int j=0;j<SIZE;j++)
					{
						System.out.printf("%5d", bingo[i][j]);
					}
					
					System.out.println();
				}
				System.out.println();
				if(check<3)
				{
					continue outer;
				}
				else
				{
					break outer;
				}
			}
			
			
			}
			
			if(check==3)
			{
				System.out.printf("%d 빙고!\n",check);
			}
			
		}
	}


