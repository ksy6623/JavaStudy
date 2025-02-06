package ch05_conditiona;

import java.util.Iterator;

public class ConditionalEx3 {
	public static void main(String[] args) {
		/* 거꾸로 트리를 5층 만들어 주세요
		 * 실행 결과
		  
		   *****
		   ****
		   ***
		   **
		   * 
		
		 * */
		// ex) 중첩 for문 or 문자열자르기 
		
		// 1. 문자열자르기 함수사용
		String star = "*****";
		for(int i = 5; i >0; i--) {
			String subStr = star.substring(0,i);
			System.out.println(subStr);
		}
		// 2. 중첩 for문
			for(int i = 5; i > 0; i--) {
			for(int j =0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
