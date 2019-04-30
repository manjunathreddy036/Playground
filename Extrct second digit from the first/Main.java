import java.util.Scanner;
class Main
{
  public static void main( String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int reverse=0;
    while(n>0)
    {
    reverse= reverse*10+ n%10;
    n=n/10;
    }
    int m=reverse%100;
    m=m/10;
    System.out.println(m);
  }
}