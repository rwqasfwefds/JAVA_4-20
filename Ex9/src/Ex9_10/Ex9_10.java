package Ex9_10;

public class Ex9_10 {
	
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
//		parseInt : 정수 앞에 "+". "-"를 붙여서 각각 양수, 음수를 표현해줌
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
//		첫 번째 매개변수에 "" 이 의미는 구분자 없이 뒤에걸 다 가져다 붙이겠다 ㅇㅇ 라는 뜻
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
//		join같은거 쓰지말고 걍 이 방법 쓰셈 ㅇㅇ(대신 join이 더 빠르다? 여튼 성능상 좋음)
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}
