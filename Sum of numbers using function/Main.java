import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int summ=0;
    for(int i=1;i<=n;i++)
    {
      summ+=i;
    }
    return summ;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m;
     m= sum(n);
      System.out.print(m);
    
	}
}