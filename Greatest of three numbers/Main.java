import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner a=new Scanner(System.in);
      int num1=a.nextInt();
      int num2=a.nextInt();
      int num3=a.nextInt();
      if(num1>num2)
      {
        if(num1>num3)
        {System.out.println(num1);
        }
        else
        { System.out.println(num2);
        }
      }
      else
      {
        System.out.println(num3);
      }
}
}