import java.util.Scanner;
class Main
{
  public static int squ(int n)
  {
    n*=n;
    return n;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int m= squ(n);
    
  System.out.print(m);
    }
      
	
}