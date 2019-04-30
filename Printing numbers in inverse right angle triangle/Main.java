import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,num=n;
      for(i=0;i<n;i++)
      {
        for(j=num;j>0;j--)
        {
          System.out.print(j);
          
        }
        num--;
        System.out.print("\n");
      }
	}
}