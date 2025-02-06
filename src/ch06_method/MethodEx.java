package ch06_method;

public class MethodEx {
	public static void main(String[] args) {
		
		// 이름, 국어점수, 수학점수, 영어점수를 입력받아
		// 평균과 등급을 출력하는 메소드를 작성하시오
		
		// input : string, int, int, int
		// output : 없음
		// method name : makeCard
		// 등급은 90이상 : A, 80이상 : B, 나머지 C
		// 출력) xxx님의 평균은 95.0으로 A등급 입니다.
		makeCard("김길동", 100, 95, 100);
	}
	//1.메소드 정의
	public static void makeCard(String nm, int kor, int eng, int math ) {
		//2. 점수 계산
		double avg = (kor + eng + math) / 3.0;
		//3. 등급 조건식
		String grade = "C";
		if(avg >= 90) {
			grade = "A";
		}else if (avg >= 80) {
			grade = "B";
		}
		//4. 출력
		System.out.printf("%s 님의 평균은 %.2f 으로 %s 등급입니다.", nm, avg, grade);
	}
}

