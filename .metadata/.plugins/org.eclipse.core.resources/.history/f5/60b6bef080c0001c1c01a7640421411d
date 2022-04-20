package Ex13_1;

class TreadeEx1_1 extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
}

class TreadeEx1_2 implements Runnable{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Ex13_1 {

	public static void main(String[] args) {
		TreadeEx1_1 t1 = new TreadeEx1_1();
		
//		다형성 이용
		Runnable r = new TreadeEx1_2();
		Thread t2 = new Thread(r);
		
//		1st 쓰레드 실행
		t1.start();
//		2nd 쓰레드 실행
		t2.start();
	}

}
