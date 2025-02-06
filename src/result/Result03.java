package result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Result03 {
	public static void main(String[] args) {
		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto();
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

}
