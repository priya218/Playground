import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner a=new Scanner(System.in);
      int n1=a.nextInt();
      int n2=a.nextInt();
      if(n1>n2)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}