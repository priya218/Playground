import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      if(n>10000)
      {
        int s1=(n/1000)%10;
        System.out.println(s1);
      }
      else if(n<100)
      {
        int s=(n%10);
        System.out.println(s);
      }
      else
      {
        System.out.println("error");
      }
	}
}