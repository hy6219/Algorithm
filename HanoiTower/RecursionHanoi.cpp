#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>

void Hanoi(int num, char from, char temp, char dest)
{
	if (num < 1)
	{
		return;
	}
	Hanoi(num - 1, from, temp, dest);//n-1개 원반을 from에서 temp로 이동시키기
	printf("\n move disc %d from group %c to group %c\n",num,from,dest);
	Hanoi(num - 1, temp, dest, from);//n-1개 원반을 temp에서 dest로 이동시키기
}


int main()
{
	int num = 5;
	printf("하노이의 탑 알고리즘 확인\n");
	Hanoi(num, 'A', 'B', 'C');

}
