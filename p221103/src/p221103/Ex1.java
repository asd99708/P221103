package p221103;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.println(a);
		if(a < 0) {
			System.out.println("minus");
		}
	} 
}