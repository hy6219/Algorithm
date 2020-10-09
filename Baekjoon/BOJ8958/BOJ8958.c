#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdbool.h>

/*
1.OOXXOXXOOO에서 0는 숫자1으로, X는 숫자 0으로 인식하기
   1,1,0,0,1,0,0,1,1,1
2.배열1:1,2,0,0,1,0,0,1,2,3 (3 이용해서 이전 인덱스의 값 이용)
3.배열2:t,t,f,f,t,f,f,t,t,t
*/
int main()
{
	int T;
	
	scanf("%d%*c", &T);
	
	
	for (int i = 0; i < T; i++)
	{
		int j = 0;
		char c[81] = { ' ' };
		int trans[81] = { 0 };
		int temp[81] = { 0 };//점수 임시 저장
		bool check[81] = { false };//3번
		int size = 0;

		scanf("%s%*c", &c);
		//변환시키기
		while (c[j] != NULL)
		{
			if (c[j] == 'O')
			{
				trans[j] = 1;
				check[j] = true;//3번
				
			}
			if (c[j] == 'X')
			{
				trans[j] = 0;
				
			}
			size++;
			j++;
		}
		/*
		1번 확인
		for (int k = 0; k < size; k++)
		{
			printf("%d\t", trans[k]);
		}
		*/
		int k = 1;
		temp[0] = trans[0];
		int hap = 0;
		hap = hap + temp[0];
		while (k < size) 
		{
			if (check[k] == true)
			{
				//O인 경우, X0든 OO든 그 이전값에 1더하면 됨
				temp[k]=temp[k-1]+1;
			}
			else
			{
				temp[k] = 0;
			}
			hap += temp[k];
			k++;
		}
		/*
		2번 확인
		for (int l = 0; l < size; l++)
		{
			printf("%d\t", temp[l]);
		}*/
		printf("%d\n", hap);
		
	}
	
	

}
