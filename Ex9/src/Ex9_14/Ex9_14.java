package Ex9_14;

public class Ex9_14 {

	public static void main(String[] args) {
//		String, wrapper class의 equals : 내부적으로 오버라이딩이 되어 있음
//		개발자가 오버라이딩 할 필요가 음따
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? " + (i == i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
//		compareTo = 같으면 0, 크면 1, 작으면 -1이 나옴
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
		System.out.println("i.toString() = " + i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE + 1);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("BYTES = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE);
	}

}
