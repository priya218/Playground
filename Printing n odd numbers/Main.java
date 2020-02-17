import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner a=new Scanner(System.in);
      int i;
      int n=a.nextInt();
      for(i=1;i<=n;i++)
      {
        int s=(2*i-1);
        System.out.println(s);
      }
    }
}