package ch05_conditiona;

/**
 * class Name 	: ConditionalMain
 * Author 	  	: 202-15
 * Created Date : 2025. 1. 24.
 * Version 		: 1.0
 * Purpose 		: java 기초
 * Description  : 조건문 if
 */
public class ConditionalMain {

	public static void main(String[] args) {
		int score = 85;
		String grade ="";
		// if 문은 해당 조건이 true 이면 {}해당 영역으로 진입
		if (score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(score + "는" + grade);
	}

}
