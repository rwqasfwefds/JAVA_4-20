package Ex9_10;

public class Ex9_10 {
	
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
//		parseInt : ���� �տ� "+". "-"�� �ٿ��� ���� ���, ������ ǥ������
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
//		ù ��° �Ű������� "" �� �ǹ̴� ������ ���� �ڿ��� �� ������ ���̰ڴ� ���� ��� ��
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
//		join������ �������� �� �� ��� ���� ����(��� join�� �� ������? ��ư ���ɻ� ����)
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}