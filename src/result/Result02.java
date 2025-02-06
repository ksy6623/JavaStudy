package result;

import java.util.Random;
import java.util.Scanner;

public class Result02 {
	public static void main(String[] args) {
	// 1 ~ 50 사이의 랜덤한 수를 5번 안에 맞춰야하는 업다운 게임
		int randInt =  (int) (Math.random() * 50 + 1);  // 1 ~ 50 사이 정수
//		System.out.println(randInt);
		
		Scanner scan = new Scanner(System.in);
		int chance = 4;
		
		for (int i = 4; i >= 0; i--) {
  			System.out.println("숫자를 입력해주세요: ");
  			int num = scan.nextInt();
  			if (num == randInt) {
  				System.out.println("정답입니다.");
  				break;
  			}
  			if (i <= 0) {
  				System.out.println("실패하였습니다. 정답은 " + randInt + "입니다.");
  				break;
  			}
  			if (num > randInt) {
  				System.out.println("다운!! 기회가 " + chance + "번 남았습니다.");
  			} else if (num < randInt) {
  				System.out.println("업!! 기회가 " + chance + "번 남았습니다.");  			
  				}
  			chance--;
		
			}
//		int chance = 5;
//		while (true) {
//			System.out.println("숫자를 입력해주세요 : ");
//			int userPick = Integer.parseInt(scan.nextLine());
//			if(userPick == randInt) {
//				System.out.println("정답입니다.!!");
//				break;
//			}
//			chance --;
//			if (chance == 0) {
//				System.out.println("실패하였습니다... 정답은" + randInt + "입니다.");
//				break;
//			}
//		}
	}
}
