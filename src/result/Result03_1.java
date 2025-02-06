package result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Result03_1 {
    public static void main(String[] args) {
        ArrayList<Integer> weekLotto = null;
        String[] numArr = {"1", "5"};

        weekLotto = makeLotto(numArr);
        System.out.println(weekLotto.toString());
    }


    public static ArrayList<Integer> makeLotto() {
        Set<Integer> lotto = new HashSet<>();
        while(lotto.size() < 6) {
            int num = (int) ((Math.random() * 45) + 1);
            lotto.add(num);
        }
        ArrayList<Integer> lottoList = new ArrayList<>(lotto);
        Collections.sort(lottoList);
        return lottoList;
    }

    public static ArrayList<Integer> makeLotto(String[] strArr) {
        Set<Integer> lotto = new HashSet<>();

        for(String str : strArr) {
            int num = Integer.parseInt(str);
            if(num >= 1 && num <= 45) { 
                lotto.add(num);
            }
        }
        
        
        while(lotto.size() < 6) {
            int num = (int) ((Math.random() * 45) + 1);
            lotto.add(num);
        }
        
        ArrayList<Integer> lottoList = new ArrayList<>(lotto);
        Collections.sort(lottoList);
        return lottoList;
    }
}