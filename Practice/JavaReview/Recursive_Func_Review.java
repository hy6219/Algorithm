package Class_Recursive;

public class Class_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintRp('=',5);
	}
	
	static void PrintRp(char c,int trial)
	{
		if(trial>0)
		{
			System.out.print(c);
			PrintRp(c,trial-1);
		}
		else
		{
			return;
		}
	}

}
