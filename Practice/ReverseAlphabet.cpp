#define _CRT_SECURE_NO_WARNINGS
#include <cstdio>
#include <cstring>
/*
A B C D E 
->Z Y ...

1.char ch[i]='a'
2.int temp=0;
temp=ch[i]//아스키 코드에 해당
3.int base=0;
base=z;
4.int diff=0;
diff=ch[i]-base;
5.이를 %c로 출력
*/
void RevPrt(char* str, int size)
{
	//각 문자의 아스키코드를 저장
	int temp = 0;
	//소문자인지 대문자인지 판정 후 기준틀 잡기
	int base = 0;
	//기준에서 얼마나 멀리 떨어져있는지 잡기
	int diff = 0;

	temp = str[0];
	/*
	25차이
	65~90: 대문자
	97~122: 소문자
	*/
	if (temp >= 65 && temp <=90)
	{
		base = 90;//Z
	}
	if (temp >= 97 && temp <= 122)
	{
		base = 122;//z
	}

	for (int i = 0; i < size; i++)
	{
		if (str[i] != ' ')
		{
			//대문자
			if (base == 90)
			{
				diff = 65 + base - str[i];
			}
			//소문자
			if (base == 122)
			{
				diff = 97 + base - str[i];
			}
			printf("%c ", diff);
		}
	}
	printf("\n");
}
int main()
{
	char str[100] = { ' ' };
	gets_s(str);
	int arr_size = 0;
	arr_size = strlen(str);//입력받은 배열 크기

	RevPrt(str, arr_size);
}
