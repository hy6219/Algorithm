#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>

void Hanoi(int move_num,int* origin,int* temp,int* dest)
{
	int i = 0;
	while (i < move_num - 1)
	{
		temp[move_num - 2 - i] = origin[move_num - 2 - i];
		i++;
	}
	dest[move_num - 1] = origin[move_num - 1];
	i = 0;
	while (i < move_num - 1)
	{
		dest[i] = temp[i];
		i++;
	}
	i = 0;
	printf("비재귀 방식의 하노이탑 destination 출력\n");
	while (i < move_num)
	{
		printf("%d ", dest[i]);
		i++;
	}
	printf("\n");
}

int main()
{
	int tower[5] = { 1,2,3,4,5 };
	int temp[5];
	int dest[5];
	Hanoi(5, tower, temp, tower);
}
