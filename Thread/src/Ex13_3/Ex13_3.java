package Ex13_3;

public class Ex13_3 {
	
	static long startTime = 0;

//	�ΰ� �� �켱������ �� �����༭ ���� ���� ������� ��
//	���������� �����Ѵ��ص� ��·�� ������ 2���� ����Ǵ°Ŵϱ� �𸥴� �̰ž� ����
	public static void main(String[] args) {
//		2nd ������ ����
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println("�ҿ�ð� 1 : " + (System.currentTimeMillis() - Ex13_3.startTime));
	}

}

//	2nd ������
class ThreadEx3_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("�ҿ�ð� 2 : " + (System.currentTimeMillis() - Ex13_3.startTime));
	}
}
