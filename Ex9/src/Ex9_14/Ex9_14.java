package Ex9_14;

public class Ex9_14 {

	public static void main(String[] args) {
//		String, wrapper class�� equals : ���������� �������̵��� �Ǿ� ����
//		�����ڰ� �������̵� �� �ʿ䰡 ����
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? " + (i == i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
//		compareTo = ������ 0, ũ�� 1, ������ -1�� ����
		System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
		System.out.println("i.toString() = " + i.toString());
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE + 1);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("BYTES = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE);
	}

}