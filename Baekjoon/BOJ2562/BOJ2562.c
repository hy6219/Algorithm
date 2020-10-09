#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int max = 0;
	int input=0;
	int idx = 0;
	for (int i = 0; i < 9; i++)
	{
		scanf("%d%*c", &input);
		if (input > max)
		{
			max = input;
			idx = i;
		}
	}
	printf("%d\n", max);
	printf("%d\n", (idx + 1));
}
