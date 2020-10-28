#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int ReverseMax(int* arr, int size)
{
	//배열 회전
	int temp = 0;


	for (int i = 0, j=size-1; i<j;i++,j--)
	{
		arr[i] ^= arr[j] ^= arr[i] ^= arr[j];
	}
	int pSum[12] = {NULL};
	pSum[0] = arr[0];
	for (int i = 1; i < size,arr[i]>0; i++)
	{
		pSum[i] = pSum[i - 1] + arr[i]*(i+1);
	}
	int max=0;
	for (int i = 0; i < size; i++)
	{
		if (pSum[i] > max)
		{
			max = pSum[i];
		}
	}

	return max;
	
}
int main()
{
	int a[5] = { -1,3,2,4,-5 };
	int res = 0;
	res = ReverseMax(a, 5);
	printf("%d\n", res);
}
