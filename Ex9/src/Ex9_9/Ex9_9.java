package Ex9_9;

import java.util.StringJoiner;

public class Ex9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
//		문자열 붙이기 전용 클래스
//		1st 매개변수 : 구분자
//		2nd 매개변수 : 문자열 처음에 붙일 문자
//		3rd 매개변수 : 문자열 마지막에 붙일 문자
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) {
//			add: StringJoiner 클래스의 문자열 붙이기 메소드
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}