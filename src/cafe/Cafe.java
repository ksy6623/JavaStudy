package cafe;

import java.util.ArrayList;

public class Cafe {
	 private String name;
	    private ArrayList<Coffee> menuList;
	    
	    public Cafe(String name) {
	        this.name = name;
	        this.menuList = new ArrayList<>();
	    }
	    
	    public void showMenu() {
	        System.out.println("어서오세요 " + name + " 입니다.");
	        for (int i = 0; i < menuList.size(); i++) {
	            System.out.println((i + 1) + ". " + menuList.get(i));
	        }
	    }
	    
	    public void addCoffee(Coffee coffee) {
	        menuList.add(coffee);
	    }
	    
	    public void buyCoffee(int menuNumber) {
	        if (menuNumber >= 1 && menuNumber <= menuList.size()) {
	            Coffee selected = menuList.get(menuNumber - 1);
	            System.out.println("메뉴를 선택해주세요: " + menuNumber);
	            System.out.println(selected.getName() + "를 " + selected.getPrice() + "원에 구매했습니다.");
	        } else {
	            System.out.println("잘못된 메뉴 번호입니다.");
	        }
	    }
}
