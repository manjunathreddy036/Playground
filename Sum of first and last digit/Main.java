import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int m=n%10;
      int reverse=0;
     
      while(n>0)
      {
      reverse=reverse*10+n%10;
      n=n/10;
      }
      int r1=reverse%10;
      int sum=m+r1;
      System.out.println(sum);
      
	}
}