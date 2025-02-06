package ch05_conditiona;

import java.util.Scanner;

public class conditionalEx {
	
	public static void main(String[] args) {
	/*
	 *  사용자부터 숫자를 입력 받아 짝수인지 홀수인지 판별하시오.
	 *  조건1: 정수만 입력받음
	 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.println(">>>");
		
		// if문을 사용하여 짝수면 "짝수", 홀수면 "홀수"를 출력하시오.
		// 1. 입력받음 (형변환 int로)
		int number = scan.nextInt();
		// 2. 조건식 if, 연산자 operator 사용
		if (number % 2 == 0) {
			System.out.printf("%d눈 %s 입니다.", number, "짝수!");
		}
		else {
			System.out.printf("%d눈 %s 입니다.", number, "홀수!");
		}
}
}
