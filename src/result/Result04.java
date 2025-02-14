package result;

import java.util.Scanner;

public class Result04 {	
	public static void main(String[] args) {
		        int elevatorA = 10;
		        int elevatorB = 4;
		        Scanner scan = new Scanner(System.in);
		        
		        while(true) {  
		            System.out.println("============== 엘리베이터 ==============\n" + 
		                             "승강기 A의 현재 위치: " + elevatorA +"\n승강기 B의 현재 위치: " + elevatorB);
		            
		            System.out.println("몇층에 계시나요?[종료는 q 또는 exit]");
		            String input = scan.nextLine();  
		            
		            
		            if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("exit")) {
		                System.out.println("프로그램을 종료합니다.");
		                break;
		            }
		            
		           
		                int floor = Integer.parseInt(input);  

		                int distanceA = Math.abs(floor - elevatorA);
		                int distanceB = Math.abs(floor - elevatorB);

		                String selectedElevator;
		                if(distanceA < distanceB) {
		                    selectedElevator = "A";
		                    elevatorA = floor;
		                } else if(distanceB < distanceA) {
		                    selectedElevator = "B";
		                    elevatorB = floor;
		                } else {
		                    if(elevatorA > elevatorB) {
		                        selectedElevator = "A";
		                        elevatorA = floor;
		                    } else {
		                        selectedElevator = "B";
		                        elevatorB = floor;
		                    }
		                }
		                
		                System.out.println(selectedElevator + "엘리베이터가 " + floor + "층으로 이동했습니다.");
		            }
		            scan.close();
		        }
	}

		             
		                
		          
		            
		        
		        
		   
		    
	
       
       


		
		


