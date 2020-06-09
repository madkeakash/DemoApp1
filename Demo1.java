package Test;

public class ArmstrongNumber {
	public static void main(String[] args) {
		 int num=153;
		 int temp=num;
		 int rem=0;
		 int sum=0;
		   while(num>0) {
			   rem=num%10;
			   num=num/10;
			   sum=sum+(rem*rem*rem);
			   }
		   if (sum==temp) {
			   System.out.println("Armstrog number");
		}
		   else {
			System.out.println("Not Armstrog number");
		}
	}
}
