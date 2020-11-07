#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>

int factorial(int n)
{
	int result = 1;
	while (n > 1)
	{
		result *= n;
		n--;
	}
	return result;
}

int main()
{
	int val;
	int res = 0;
	scanf("%d%*c", &val);
	res=factorial(val);
	printf("%d\n", res);
}
