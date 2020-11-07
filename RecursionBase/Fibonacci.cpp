#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>

int fib(int n)
{
	/*
	피보나치 수(영어: Fibonacci numbers)는 첫째 및 둘째 항이 1이며 
	그 뒤의 모든 항은 바로 앞 두 항의 합인 수열
	F(n)=F(n-1)+F(n-2)(n>2)
	*/
	if (n<=2)
	{
		return 1;
	}
	else
	{
		return fib(n - 1) + fib(n - 2);
	}
}
int main()
{
	int k = 0;
	scanf("%d", &k);
	int res = 0;
	res = fib(k);
	printf("%d\n", res);
}
