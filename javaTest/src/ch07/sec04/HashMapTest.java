package ch07.sec04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> hmDic = new HashMap<String, String>();
		
		//HashMap 추가(삽입)
		hmDic.put("baby", "아기");
		hmDic.put("love", "사랑");
		hmDic.put("apple", "사과");
		//key 객체를 중복했을때 이전의 value 객체는 삭제된다. 
		hmDic.put("apple", "사과2");
		
		//HashMap 출력(키객체->Set)
		Set<String> keyset = hmDic.keySet();
		for(String key : keyset) {
			System.out.printf("key=%s \t value=%s \n",key, hmDic.get(key));
		}
		
		//검색기능
		while(true) {
			System.out.print("검색단어(종료:exit)>>");
			String search = scan.nextLine().trim(); 
			if(search.equals("exit") || search.equals("EXIT")) {
				System.out.println("단어검색을 종료합니다.");
				break;
			}  
			System.out.printf("%s >> %s \n", search, hmDic.get(search));
		}
		
		System.out.println("The end");

	}
}
