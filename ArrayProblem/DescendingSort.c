#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void desc(int* arr, int size)
{
	/*
	반절 쪼개서, 이분탐색처럼 왼쪽부분, 오른쪽 부분 정렬시키기
	*/
	int low = 0;
	int high,mid;
	high = size - 1;
	int j = 0; int temp = 0;
	mid = low + (high - low) / 2;
	for (int i = 0; i < size; i++)
	{
		j = low;
		while (j < mid-1)
		{
			if (arr[j] < arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			j++;
		}
		while (j < size - 1)
		{
			if (arr[j] < arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			j++;
		}

	}
}

int main()
{
	int a[7] = { 1,5,2,4,6,7,3 };
	desc(a, 7);
	for (int i = 0; i < 7; i++) { printf("%d\t", a[i]); }printf("\n");
}
