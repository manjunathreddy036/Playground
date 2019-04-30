import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int temp=n,fact,sum=0,rem;
      while(temp>0)
      {
        rem=temp%10;
        fact=1;
        for(int i=1;i<=rem;i++)
        {
        fact=fact*i;
        }
        
        sum=sum+fact;
        temp=temp/10;
	}
      if(sum==n)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}