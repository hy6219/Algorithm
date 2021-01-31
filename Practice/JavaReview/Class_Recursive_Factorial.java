package Class_Recursive_Factorial;
/**
 * 
 * @author
 *팩토리얼 재귀함수로 구현 다시 만들어보기!
 *
 *실행시간 측정하기: https://hijuworld.tistory.com/2
 *
 */
public class Class_Recursive_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		for(int i=0;i<21;i++)
		{
			System.out.printf("%d!=%d\n", i,Factorial(i));
		}
		System.out.printf("Elapsed Time: %.2fs\n", (System.currentTimeMillis()-start)/1000.00);
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
		if(n<0)
		{
			//validation evaluation
			return -1;
		}
		else if(n==0)
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
