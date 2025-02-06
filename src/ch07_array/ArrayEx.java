package ch07_array;

public class ArrayEx {
	public static void main(String[] args) {
		// 1. 우리반 학생들의 이름이 담긴 String [] 선언
		// shift + alt + a
		// ctrl + shift + f 정렬
		String[] students = { "강지석", "김도래", "김병준", "김서영", "김소연", "김원진", "박정단", "박종욱", "송은호", "신미정", "이예성", "이예은",
				"정지나", "최보석", "한수정" };
		// 학생 출력
		for(int i =0; i <students.length; i++) {
			System.out.print(students[i]);
		}
		// 학생들 이름에 출석부 순번을 붙여주세요. 1.강지석, 2.김도래 ...
		for(int i =0; i <students.length; i++) {
			System.out.print((i+1)+ "." + students[i]);
		}
		// 같은 성 찾기 메소드를 작성해주세요!
		// input : String, String []
		// output : 없음
		// 호출 : searchNm("이", students);
		// 출력 : '이'씨 성을 가진 학생은 총 2명 있습니다.
		//			이예성씨, 이예은씨
		searchName("이", students);
		searchName("김", students);
	}
	// 1. 메소드 비어있는 메소드 만들기
	public static void searchName(String nm, String[] stu) {
		int count = 0;
		String name = "";
		// 2. 반복문
		for(int i = 0; i < stu.length; i++ ) {
			// 3. 각 이름의 첫자리가 찾고자하는 성과 같은 지  (문자열도 인덱스로 접근 가능) or substring
			//		같으면 카운트 증가 (증가시킬 변수가 선언되어 있어야함.)
//			if(stu[i].contains(nm)) {
//				count += 1;
			if(stu[i].substring(0,1).equals(nm)) {
				if(stu[i].substring(0,1).equals(nm)) {
					count ++;
					name += stu[i] + "씨 ";
				}
				
			}
		}
		// 4. 반복이 종료되고 성과 카운트 출력
		System.out.println("==================================================");
		System.out.printf("%s씨 성을 가진 동기분은 총 %d명 있습니다 \n", nm,count);
		System.out.println(name);
		
	} 
}
