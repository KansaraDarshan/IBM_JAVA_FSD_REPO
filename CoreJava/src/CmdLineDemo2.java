
public class CmdLineDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(String num:args)
		{
			sum+=Integer.parseInt(num);
		}
			System.out.println("sum is "+sum);
	}

}
