class factorial
{
	public static void main(string args[])
	{
		System.out.println("Enter the number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=interger.parseInt(br.readLine());
		int b=a;
		for(int i=a-1;i!=0;i--)
		{
			b=b*i;
		}
		System.out.println("factorial is:"+b);
	}
}

			
