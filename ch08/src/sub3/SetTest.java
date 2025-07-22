package sub3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2025/07/22
 * 설유진
 * 자바 집합(set) 실습하기
 * 
 */
public class SetTest {

	public static void main(String[] args) {

		//집합 기본
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1); //auto-boxing
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(2);


		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			//집합에 데이터가 없을 때까디 반복
			System.out.println(it.next());
			
		}
		
		for(int num : set) {
			System.out.println("num"+num);
		}
		////////////////
		//집합연산 실습
		///////////////
		//합집합
		Set<String> seta= new HashSet<String>(Arrays.asList("사과","바나나","딸기","포도"));
		Set<String> setb= new HashSet<String>(Arrays.asList("딸기","수박","바나ㅏㄴ","오렌지"));
		

		Set<String> union = new HashSet<String>(seta);
		union.addAll(setb);
		System.out.println(union);
		
		//교집합
		Set<String> intersection = new HashSet<String>(seta);
		intersection.retainAll(setb);
		System.out.println("교집합" + intersection);
		
		//차집합
		Set<String> minus = new HashSet<String>(seta);
		minus.removeAll(setb);
		System.out.println(setb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
