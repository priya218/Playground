import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int n1, remainder, result = 0;
        n1 = n;
        while (n1 != 0)
        {
            remainder = n1 % 10;
            result += Math.pow(remainder, 3);
            n1 /= 10;
        }
        if(result == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}