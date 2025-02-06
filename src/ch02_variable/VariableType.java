package ch02_variable;


/**
 * class Name : VariableType
 * Author : 202-15
 * Created Date : 2025. 1. 22.
 * Version : 1.0
 * Purpose : java 기초
 * Description : 변수 타입
 */
public class VariableType {

	public static void main(String[] args) {
		
		//변수의 타입
		//정수타입
		byte byteVar = 1;
		short shortVar = 2;
		int intVar = 3;
		long longVar = 300000000000L;
		
		//정수이면서 문자
		char charVar = 44032; // '가'와 같음
		
		//소수 타입
		float floatVar = 3.14f;
		double dubleVar = 3.14;
		
		//불리언 타입(참/거짓)
		boolean booVar = false;
		
		//문자열 타입
		String strToday = "오늘은 1월 22일";
		
		System.out.println(strToday);
		
		// ctrl + d 라인삭제
		// ctrl + alt + 아래방향키 라인복사
		// 정렬 영역선택 후 ctrl + Shift + f
		// ait + 위 아래 (라인 이동)
	}

}
