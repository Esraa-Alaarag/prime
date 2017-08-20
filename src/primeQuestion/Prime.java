package primeQuestion;


public class Prime {
	int max;
	int min;
	
	public Prime(int min , int max )
	{
		this.max=max;
		this.min=min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime isprime = new Prime(1,150);
		isprime.primerange();
	}
	
	public void primerange() {
		String allnumbers=" ";
		for(int i = this.min ; i<= this.max ; i++)
		{	
			boolean prime=true;
			int division =(int) Math.ceil(Math.sqrt(i));
			for (int j=2;j<=division;j++) {
				if(i%j==0 && i!=2)
				{
					prime=false;
				}
				
			}
			if(prime==true && i!=0 && i!=1) {
				allnumbers=allnumbers+i+",";
			}
		}
		System.out.println(allnumbers);
		}

}
