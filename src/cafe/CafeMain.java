package cafe;

import java.util.Scanner;

public class CafeMain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // 스타벅스 카페 생성 및 메뉴 추가
	        Cafe starbucks = new Cafe("스타벅스");
	        starbucks.addCoffee(new Coffee("아메리카노", "Americano", 5000));
	        starbucks.addCoffee(new Coffee("카푸치노", "Cappuccino", 6000));
	        starbucks.addCoffee(new Coffee("오곡라떼", "Five Grain Latte", 7000));
	        
	        // 아카 카페 생성 및 메뉴 추가
	        Cafe akaCafe = new Cafe("아카");
	        akaCafe.addCoffee(new Coffee("아메리카노", "Americano", 2500));
	        akaCafe.addCoffee(new Coffee("바닐라라떼", "Vanilla Latte", 3000));
	        akaCafe.addCoffee(new Coffee("아이스티", "Ice Tea", 3500));
	        
	        while (true) {
	            System.out.println("행동을 선택해주세요.");
	            System.out.println("1. 스타벅스 방문 | 2. 아카 방문 | 3. 사무실 복귀..");
	            System.out.print(">>> ");
	            
	            int action = scanner.nextInt();
	            
	            if (action == 1) {
	                starbucks.showMenu();
	                System.out.print("메뉴를 선택해주세요: ");
	                int menuChoice = scanner.nextInt();
	                starbucks.buyCoffee(menuChoice);
	            } else if (action == 2) {
	                akaCafe.showMenu();
	                System.out.print("메뉴를 선택해주세요: ");
	                int menuChoice = scanner.nextInt();
	                akaCafe.buyCoffee(menuChoice);
	            } else if (action == 3) {
	                System.out.println("사무실로 복귀합니다..");
	                break;
	            } else {
	                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
	            }
	            
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
}
