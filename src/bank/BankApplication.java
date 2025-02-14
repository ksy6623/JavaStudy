package bank;

import java.util.Scanner;

public class BankApplication {
	  private static Account[] accounts = new Account[100];
	    private static Scanner scanner = new Scanner(System.in);
	    private static int accountCount = 0;

	    public static void main(String[] args) {
	        boolean run = true;
	        while(run) {
	            System.out.println("------------------------------------------");
	            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	            System.out.println("------------------------------------------");
	            System.out.print("선택> ");

	            String choice = scanner.nextLine();

	            switch(choice) {
	                case "1":
	                    createAccount();
	                    break;
	                case "2":
	                    accountList();
	                    break;
	                case "3":
	                    deposit();
	                    break;
	                case "4":
	                    withdraw();
	                    break;
	                case "5":
	                    run = false;
	                    break;
	            }
	        }
	        System.out.println("프로그램 종료");
	    }

	    private static void createAccount() {
	        System.out.println("--------");
	        System.out.println("계좌생성");
	        System.out.println("--------");

	        System.out.print("계좌번호: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("계좌주: ");
	        String owner = scanner.nextLine();
	        System.out.print("초기입금액: ");
	        int balance = Integer.parseInt(scanner.nextLine());

	        Account account = new Account(accountNumber, owner, balance);
	        accounts[accountCount++] = account;

	        System.out.println("결과: 계좌가 생성되었습니다.");
	    }

	    private static void accountList() {
	        System.out.println("--------");
	        System.out.println("계좌목록");
	        System.out.println("--------");

	        for(int i = 0; i < accountCount; i++) {
	            Account account = accounts[i];
	            System.out.printf("%s\t%s\t%d\n", 
	                account.getAccountNumber(), 
	                account.getOwner(), 
	                account.getBalance());
	        }
	    }

	    private static void deposit() {
	        System.out.println("--------");
	        System.out.println("예금");
	        System.out.println("--------");

	        System.out.print("계좌번호: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("예금액: ");
	        int amount = Integer.parseInt(scanner.nextLine());

	        Account account = findAccount(accountNumber);
	        if(account != null) {
	            account.setBalance(account.getBalance() + amount);
	            System.out.println("결과: 예금이 성공되었습니다.");
	        }
	    }

	    private static void withdraw() {
	        System.out.println("--------");
	        System.out.println("출금");
	        System.out.println("--------");

	        System.out.print("계좌번호: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("출금액: ");
	        int amount = Integer.parseInt(scanner.nextLine());

	        Account account = findAccount(accountNumber);
	        if(account != null) {
	            if(account.getBalance() >= amount) {
	                account.setBalance(account.getBalance() - amount);
	                System.out.println("결과: 출금이 성공되었습니다.");
	            } else {
	                System.out.println("결과: 잔액이 부족합니다.");
	            }
	        }
	    }

	    private static Account findAccount(String accountNumber) {
	        for(int i = 0; i < accountCount; i++) {
	            if(accounts[i].getAccountNumber().equals(accountNumber)) {
	                return accounts[i];
	            }
	        }
	        System.out.println("결과: 계좌가 존재하지 않습니다.");
	        return null;
	    }
	}
