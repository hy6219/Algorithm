#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

/*
나머지 위치의 값을 발견할때마다 증가하기로!
*/
int main()
{
	int a_n[42] = { 0 };
	int a = 0;

	for (int i = 0; i < 10; i++)
	{
		scanf("%d%*c", &a);
		a_n[a % 42]++;//같은 값이 발견되면 0이 아닌 다른 값일것을 이용
	}
	int cnt = 0;
	for (int i = 0; i < 42; i++)
	{
		if (a_n[i] !=0)
		{
			cnt++;
		}
	}
	printf("%d\n", cnt);

	
}
