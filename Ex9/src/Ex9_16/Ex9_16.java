package Ex9_16;

public class Ex9_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
//		레퍼 클래스 이용
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
//		레퍼 클래스 이용
		Long lng = 100L;
		
// 		레퍼 객체 + 기본 정수 = 연산 가능 : 오토 박싱
//		오토박싱 : "레퍼객채.intValue() + 기본정수" 이런 형태야 연산이 가능했는데
//		오토박싱으로 인해 "레퍼객체 + 기본정수" 만 해도 연산 씹가능
		int i2 = intg + 10;
		long l = intg + lng;
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i = " + i);
		System.out.println("intg = " + intg);
		System.out.println("obj = " + obj);
		System.out.println("lng = " + lng);
		System.out.println("intg + 10 = " + i2);
		System.out.println("intg + lng = " + l);
		System.out.println("intg2 = " + intg2);
		System.out.println("i3 = " + i3);
		System.out.println("intg2 + i3 = " + intg3);
	}

}
