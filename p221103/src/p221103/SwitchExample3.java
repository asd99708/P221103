package p221103;

import java.util.Scanner;

public class SwitchExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부장, 과장, 대리 중 입력해주세요.");
		String position = sc.nextLine();
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		case "대리" :
			System.out.println("300만원");
			break;
		default :
			System.out.println("직급을 입력해주세요.");
			break;
		}
	}
}
