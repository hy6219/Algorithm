package Class_Arr_Ref_Param_second;
/**
 * 
 * 
 * @author 
 * 퀵소트
 * https://m.blog.naver.com/ndb796/221226813382
 * 꼭 복습!
 * 참조형 매개변수와 퀵소트 복습!
 */
public class Class_Arr_Ref_Param_second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr.length-i;
		}
		System.out.println("정렬 전");
		PrintArr(arr);
		QuickSort(arr,0,arr.length-1);
		System.out.println("정렬 후");
		PrintArr(arr);
		System.out.println("누적합 적용후");
		accum(arr);
		PrintArr(arr);
	}
	//배열 출력
	static void PrintArr(int[] arr)
	{
		
		for(int i:arr)
		{
			System.out.print("[");
			System.out.print(i);
			System.out.print("] ");
		}
		System.out.println();
	}
	//누적합
	static void accum(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp+=arr[i];
			arr[i]=temp;
		}
	}
	//오름차순 정렬
	//https://m.blog.naver.com/PostView.nhn?blogId=kimkwon429&logNo=220752710777&proxyReferer=https:%2F%2Fwww.google.com%2F
	//int[] 리턴 메서드
	static void QuickSort(int[] arr, int start, int end)
	{
		int left=0;
		int right=0;
		left=start+1;
		right=end;//low가 high보다 앞서갈때까지 반복
		int pivot=start;
		int temp=0;
		//원소가 1개만 있는 경우 그냥 두기
		if(start>=end)
		{
			return;
		}
		while(left<=right)
		{
			//인덱스 조절
			//왼쪽부터 오른쪽으로 가는 left의 경우,
			//pivot 값보다 작으면 그냥 left 인덱스 키워나가기(통과!)
			while(left<=end && arr[left]<arr[pivot])
			{
				left++;
			}
			//오른쪽부터 왼쪽으로 가는 right의 경우,
			//pivot 값보다 크면 무사통과로 그냥 right 인덱스 줄여나가기
			while(right>start && arr[right]>arr[pivot])
			{
				right--;
			}
			/**
			* 위의 두 while loop를 벗어났음을 의미
            * 이 시점에서는 arr[left]>pivot 인 값과 arr[right]<pivot 인
				 * 값을 바꿔줌
				 */
				if(left>right)
				{
					//엇갈린 상태라면, 피벗값과 교체
					/**
					 * 피벗값을 인덱스로 기억시키고 접근하는 것이 중요!
					 * 그이유는, 지금 x번째 위치에 있는 그 피벗값을 교환해주는 것이지
					 * 메모리를 바꾸어주려 하는 것이 아니기 때문에
					 * 피벗을 인덱스로 기억시키고 접근해야 스왑에도 유리!
					 */
					temp=arr[right];
					arr[right]=arr[pivot];
					arr[pivot]=temp;
				}
				else
				{
					//아니라면, left와 right 교체
					temp=arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
				}
				
			
			}
			
		//right가 피벗
		QuickSort(arr,start,right-1);//앞부분
		QuickSort(arr,right+1,end);
	}
}
