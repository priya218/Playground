import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      if(n>10000)
      {
        int n1=n/10000;
        int n2=n%10;
        System.out.println(n1+n2);
      }
      else if(n<10000)
      {
        int s1=n/1000;
        int s2=n%10;
        System.out.println(s1+s2);
      }
      else
      {
        System.out.println("error");
      }
	}
}