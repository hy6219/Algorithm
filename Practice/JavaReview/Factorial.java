package Class_Recur_Factorial;

public class Class_Recur_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<21;i++)
		{
			long temp=0;
			temp=Factorial(i);
			
			System.out.printf("%3d ! : %20d, 유효성검사 결과: %s\n", i, temp,(temp>0)?"P":"F");
		}
	}
	//int는 13!부터는 범위가 넘어감 따라서 반환값이 long인 것이 좋음
	static long Factorial(int num)
	{
		long res=1;
		if(num<0)
		{
			return -1;
		}
		if(num==0 || num==1)
		{
			return 1;
		}
		res=num*Factorial(num-1);
		return res;
		
		/**
		 * if(n==1) return 1;
		 * if(n<=0) return -1;
		 * return n*factorial(n-1);
		 */
	}
}
