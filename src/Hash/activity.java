package Hash;

import java.util.Scanner;

public class activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("first num");
Scanner sc =new Scanner(System.in);
int first= sc.nextInt();
System.out.println("sec num");
int sec = sc.nextInt();
if(first%sec == 0) {
	int c = first/sec;
	System.out.println(c);
}
else
{
	System.out.println("wrng");
	}
}
}
