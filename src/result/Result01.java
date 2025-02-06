package result;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Result01 {
public static void main(String[] args) {
	/*
	 * Q.1 사용자로부터 국어, 영어, 수학 점수를 각각 입력받아,,
	 */
	
	int kor =0, eng =0, math = 0;
	double avg = 0.0;
	String grade = "";
	
	Scanner scan = new Scanner(System.in);
	System.out.println("국어 점수를 입력해 주세요 \n >>>");
	kor = scan.nextInt();
	System.out.println("영어 점수를 입력해 주세요 \n >>>");
	eng = scan.nextInt();
	System.out.println("수학 점수를 입력해 주세요 \n >>>");
	math = scan.nextInt();
	
	int sum = kor + eng + math;
	avg = sum / 3.0;
	System.out.println("평균 : " + avg);
	if(avg >= 90) {
		System.out.println("등급 : A 등급");
	}else if (avg >= 80) {
		System.out.println("등급 : B 등급");
	}else {
		System.out.println("등급 : C 등급");
	}
	
	/*
	 * Q. 2 for문을 사용해서 10팩토리얼의 값을 출력 / 15팩토리얼의 값을 출력 
	 */
	int fac = 1;
	for(int i = 1; i <=10; i++ ) {
		fac *= i;
	}
	System.out.println("for문을 사용해서 10팩토리얼의 값을 출력해주세요");
	System.out.println("결과 : " + fac);
	
	long fac2 = 1;
	for(int i = 1; i <=15; i++ ) {
		fac2 *= i;
	}
	System.out.println("15팩토리얼의 값을 출력해주세요");
	System.out.println("결과 : " + fac2);
	
	
	
//	int a = 7;
//	int b = 3;
//	int intResult = a/b;
//	System.out.println("정수 나눗셈 : " + intResult);
//	
//	double c = 7;
//	double d =3;
//	double diubleResult = c/d;
//	System.out.println("double 나눗셈" + diubleResult);
//	
//	// 정수 나눗셈을 캐스팅
//	double mixedReulst = (double)a/b;
//	System.out.println("캐스팅된 나눗셈" + mixedReulst);
//	
//	//ex
//	System.out.println(4 /3);
//	System.out.println(4 /3.0);
//	
//	int intResult2 = (int)(c/d);
	
	
	
 }
}
