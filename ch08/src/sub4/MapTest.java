package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 2025/07/22
 * 설유진
 * 자바 map 실습하기
 * 
 */
public class MapTest {

	public static void main(String[] args) {

		//map 생성
		Map<Character, String> map =new HashMap();
		
		//map 데이터 추가
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		System.out.println(map);
		
		//map 크기
		System.out.println("map 크기:" + map.size());
		
		//map 데이커 출력
		System.out.println("map의 a키값 :"+ map.get('A'));
		System.out.println("map의 B키값 :"+ map.get('B'));
		System.out.println("map의 C키값 :"+ map.get('C'));
		
		//map 반복문
		Set<Character> KeySet =map.keySet();
		Iterator<Character> it= KeySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(char key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		
		//map과 list 응용

		Map<Integer,Apple> m1 = new HashMap<Integer, Apple>();
		m1.put(101, new Apple("한국",3000));
		m1.put(102, new Apple("중국",2000));
		m1.put(103, new Apple("일본",1000));
		
		Map<Integer,Apple> m2 = new HashMap<Integer, Apple>();
		m2.put(201, new Apple("미국",3000));
		m2.put(202, new Apple("영국",2000));
		m2.put(203, new Apple("호주",1000));
		
		Map<Integer,Apple> m3 = new HashMap<Integer, Apple>();
		m3.put(301, new Apple("대만",3000));
		m3.put(302, new Apple("태국",2000));
		m3.put(303, new Apple("인도",1000));
		
		
		
		List<Map<Integer,Apple>> list = new ArrayList();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		//한국사과
		Map<Integer,Apple> resultMap = list.get(0);
		Apple korea = resultMap.get(101);
		korea.show();
		
		//호주사과출력
		list.get(1).get(203).show();
		
		//태국사과 출력
		list.get(2).get(302).show();
		
		
		
	}

}
