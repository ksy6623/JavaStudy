package ch07_array;

public class ArrayEx2 {
	public static void main(String[] args) {
	// Q. 월리를 찾아라!
	// findWally 문자열에 '월리'가 총 몇개 있는 지 출력하시오	
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int cnt = 0;
		int cnt2 = 0;
		// 2자리씩 비교 or 제거
		
//        for (int index = 0; index <= findWally.length() - 2; index++) {
//            if (findWally.substring(index, index + 2).equals("월리")) {
//                cnt++;
//            }
//        }
//        System.out.println("월리의 개수: " + cnt);
//    }

//        while (findWally.contains("월리")) {	
//
//            cnt++;
//            findWally = findWally.replaceFirst("월리", ""); 
//        }
                System.out.println("월리의 개수: " + cnt);
   
        int all = findWally.length();
        int after = findWally.replaceFirst("월리", "").length();
                System.out.println(all + "-" + after);
                cnt = (all - after) / 2 ;
                
       for(int i = 0; i< findWally.length()-1; i++) {
    	   String subText = findWally.substring(i,i+2);
    	   if(subText.equals("월리")) {
    		   cnt2++;
    	   }
       }
       System.out.println("월리는 총 : " + cnt);
       System.out.println("월리는 총 : " + cnt2);
	}
}

