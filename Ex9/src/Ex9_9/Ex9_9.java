package Ex9_9;

import java.util.StringJoiner;

public class Ex9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
//		���ڿ� ���̱� ���� Ŭ����
//		1st �Ű����� : ������
//		2nd �Ű����� : ���ڿ� ó���� ���� ����
//		3rd �Ű����� : ���ڿ� �������� ���� ����
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) {
//			add: StringJoiner Ŭ������ ���ڿ� ���̱� �޼ҵ�
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}