package ch03_system;

import java.util.Scanner;

public class SystemEx {

	public static void main(String[] args) {
		/* 1. 사용자의 이름:나이를 입력받아
		 * 이름 출력
		 * 나이 출력 하세요
		 * 
		 * 2. 사용자의 이름:나이를 입력받아
		 *  변수에 각각 할당 후 
		 *  해당 변수로 사용자의 이름, 나이를 출력하시오
		 *  
		 *  단) 이름의 길이가 달라질 수 있음.
		 *  hint (:) 콜론을 기준으로 앞이 이름, 뒤가 나이
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름:나이를 입력하세요 =");
//		String userInput = scan.nextLine();
//		System.out.println(userInput.indexOf(0));
//		System.out.println(userInput.substring(5));
//		
//		String name = userInput.substring(0,5);
//		String age = userInput.substring(5);
//		System.out.println("입력하신 이름은 :" + name + "나이는 :" + 100);
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름:나이를 입력하세요 =");
		String userInput = scan.nextLine();
		int idx = userInput.indexOf(":");
		System.out.println("=== 1번 문제 ===");
		System.out.println(userInput.substring(0,idx));
		System.out.println(userInput.substring(idx+1));
		
		System.out.println("=== 2번 문제 ===");
		String name = userInput.substring(0,idx);
		String age = userInput.substring(idx+1);
		// 콘솔 입력은 String 타입
		// 숫자형태로 사용하려면 casting 형변환 해야함.
		int userAge = Integer.parseInt(age);
		System.out.println("입력하신 이름은 :" + name + "나이는 :" + age);
		System.out.println("입력하신 이름은 :" + name + "나이는 :" + userAge);
		
		
		
	}
}
