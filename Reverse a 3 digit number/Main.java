import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int b=n%10;
      int c=(n%100)/10;
      int d=n/100;
    int rev=(b*100)+(c*10)+d;
    System.out.println(rev);
  }
}