package Class_Recursive_Power;
/**
 * 
 * 
 * @author
 *거듭제곱 함수를 재귀함수로 구현하기
 *(유효성 검사를 넣어 걸러낼 수 있는 것은 사전에 빨리 걸러내기)
 */
public class Class_Recursive_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		for(int i=0;i<5;i++)
		{
			System.out.printf("(-1)^%d=%d\n",i,power(-1,i));
		}
		System.out.println();
		System.out.printf("Elapsed Time: %.2fs\n", (System.currentTimeMillis()-start)/1000.00);
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d^%d=%d\n",i,i,power(i,i));
		}
		System.out.println();
		System.out.printf("Elapsed Time: %.2fs\n", (System.currentTimeMillis()-start)/1000.00);
	}
	static int power(int val, int n)
	{
		/**
		 * make method return val^(n)
		 * (-1)^3=(-1)*(-1)*(-1)
		 * (-1)^2=(-1)*(-1)
		 * ==>(-1)^n=(-1)*(-1)^(n-1)
		 * ==>p(val,n)=val*p(val,n-1)
		 */
		
		if(n<0)
		{
			return -1;
		}
		if(val==0||val==1 ||n==0 ||n==1)
		{
			return val;
		}
		return val*power(val,n-1);
		
	}
}
