#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>

int GCD(int a, int b)
{
	/*
	유클리드 알고리즘 참고
	1.b>a인 경우->gcd(a,b)=gcd(b,a)
	2.a=a-b
	3.a=0->gcd=b

	유클리드 호제법
	https://mathbees2.blogspot.com/2014/09/4_24.html
	-->gcd(a,b)=gcd(b,r)
	r=a%b
	*/
	if (b==0)
	{
		//나누는 수가 0이면 a가 최대공약수
		return a;
	}
	else
	{
		return GCD(b, a % b);
	}
	
}

int main()
{
	int a, b;
	scanf("%d %d", &a, &b);
	int g = 0;
	g = GCD(a, b);
	printf("%d\n", g);
}
