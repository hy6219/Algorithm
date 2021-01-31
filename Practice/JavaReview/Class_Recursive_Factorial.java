package Class_Recursive_Factorial;
/**
 * 
 * @author
 *팩토리얼 재귀함수로 구현 다시 만들어보기!
 */
public class Class_Recursive_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<21;i++)
		{
			System.out.printf("%d!=%d\n", i,Factorial(i));
		}
	}
	static long Factorial(long n)
	{
		//int는 factorial 값을 담기에 공간이 적을 수 있음
		long res=0;
		/**
		 * 0!=1
		 * 1!=1=1*1=1*0!
		 * 2!=2*1=2*1!
		 * 3!=3*2*1=3*2!==>f(n)=n*f(n-1)(단, n>=1)
		 */
		if(n==0)
		{
			res=1;
		}
		else
		{
			res=n*Factorial(n-1);
		}
		return res;
	}
}
