import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int c=n%100;
      int b=c/10;
      System.out.println(b);
	}
}