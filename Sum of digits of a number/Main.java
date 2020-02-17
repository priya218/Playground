import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      if(n>10000)
      {
        int n1=n/10000;
          int n2=(n/1000)%10;
          int n3=(n/100)%10;
          int n4=(n%100)/10;
          int n5=n%10;
        int sum=(n1+n2+n3+n4+n5);
        System.out.println(sum);
      }
      else if(n<1000)
      {
        int s1=n/100;
        int s2=n%100;
        int s3=s2/10;
        int s4=s2%10;
        int sum1=(s1+s3+s4);
        System.out.println(sum1);
      }
      else
      {
        System.out.println("error");
      }
	}
}