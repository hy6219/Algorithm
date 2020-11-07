#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void isitCorr(int* arr, int size)
{
	//idx array
	int idx_arr[15];
	for (int i = 0; i < 15; i++)
	{
		//인덱스 플래그 배열 -1로 초기화
		idx_arr[i] = -1;
	}
	int i = 0;
	while (arr[i]&&i<size)
	{
		if (arr[i] >= 0 && arr[i] <= size - 1)
		{
			//arr[1]값이 조건을 만족하는데 예를 들어서
		//arr[1]=2이면 idx_arr[2]에 플래그 세우기
			idx_arr[arr[i]]++;
		}
		i++;
		
	}


	int m = 0;
	while (m<size)
	{
		if (idx_arr[m] != -1)
		{
			printf("%d\t", m);
			
		}
		else
		{
			printf("-1\t");
		}
		m++;
	}
	printf("\n");
}

int main()
{
	int a[10] = {8,-1,6,1,9,3,2,7,4,-1};
	int b[5] = { 6,-2,-3,2,1 };
	isitCorr(a, 10);
	isitCorr(b, 5);
}
