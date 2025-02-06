package ch09_class.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentMain {
	public static void main(String[] args) {
		Student stu1 = new Student("팽수"); // new 클래스를 사용하기 위해 인스턴스화 // 출력: 팽수 등록됨
		Student stu2 = new Student("팽순"); // new 클래스를 사용하기 위해 인스턴스화 // 출력: 팽순 등록됨
		Student stu = new Student();
		System.out.println(stu1); // Student [name=팽수, kor=0, eng=0, math=0, avg=0.0]
		System.out.println(stu1.getName()); // 팽수
		stu1.setName("김팽수");
		System.out.println(stu1.getName()); // 김팽수  
		System.out.println(stu2.getName()); // 팽순
		
		stu1.setKor(90);
		System.out.println(stu1); //Student [name=김팽수, kor=90, eng=0, math=0, avg=30.0]
		stu1.setEng(75);
		System.out.println(stu1); //Student [name=김팽수, kor=90, eng=75, math=0, avg=55.0]
		stu1.nm(); // 김팽수입니다.
		Student.check(); // 정적메소드 호출 // static 정적 메소드는 .으로 호출 가능, 개별적으로 사용 가능
//		Student.nm(); // class의 기본 메소드는 인스턴스 메소드임(인스턴스화 이후 사용가능)
		
		ArrayList<Student> classMate = new ArrayList<>();
		classMate.add(stu1);
		classMate.add(stu2);
		classMate.add(new Student("닉",100,90,80));
		classMate.add(new Student("주디",80,90,80));
		for(Student st : classMate) {
			System.out.println(st); // 김팽수, 팽순
		}
		// 버블정렬
		for(int k = 0; k < classMate.size() -1; k++) {
			for(int i =0; i < classMate.size() -1; i++) {
				// i < i+1 내림
				// i > i+1 오름
				if(classMate.get(i).getAvg() < classMate.get(i+1).getAvg()) {
				Student temp = classMate.get(i); // 임시 공간에
				classMate.set(i, classMate.get(i+1)); // i번째와 순서 바꾸기
				classMate.set(i+1, temp);
				}
			}
		}
		System.out.println(classMate);
		// collections.sort 객체 사용
		// -1 : 두 객체의 순서를 바꾸지 않음
		// 1 : 두 객체의 순서를 바꿈
		// 0 : 유지
		Collections.sort(classMate, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				double diff =o2.getAvg() - o1.getAvg();
				if(diff < 0) {
					return -1;
				}
				return 1; // 차이가 0보다 크면 o2가 더 크기 때문에 순서를 바꿈
			}
			
		});
		System.out.println(classMate);
	}
}
