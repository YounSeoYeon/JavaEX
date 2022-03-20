package arraylist;

import java.util.ArrayList;

public class ARtype {

	public static void main(String[] args) {
		//자바에서 따로 인터페이스로 정의
		//List 인터페이스를 구현한 클래스
		ArrayList<String> arr = new ArrayList<String>();
		
		//배열에 원소추가
		arr.add("10");
		arr.add("20");
		arr.add("와우");
		
		//배열내의 원소확인
		System.out.println(arr.get(0));
		//배열크기확인
		System.out.println(arr.size());
		//배열에 원소 삽입 // 인덱스,넣을원소
		arr.add(1,"15");
		//배열내의 모든원소확인
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//배열원소검색
		System.out.println(arr.contains("15"));
		
		//배열원소삭제
		arr.remove("10");
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//배열내의 원소 꺼내오는 경우 arraylist는 타입을 오브젝트로 인식
		//항상 타입변환을 염두해두어야함
		
		String str = (String)arr.get(2);
		System.out.println(str);
		
		//지네릭스(generics)-타입을 명시해줌
		ArrayList<String> ab = new ArrayList<String>();
		ab.add("에르메스");
		ab.add("테슬라");
		System.out.println(ab);
		
		
	}

}
