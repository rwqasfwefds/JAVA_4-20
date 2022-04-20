package Ex13_3;

public class Ex13_3 {
	
	static long startTime = 0;

//	두개 다 우선순위를 안 정해줘서 뭐가 먼저 실행될지 모름
//	순차적으로 실행한다해도 어쨌든 쓰레드 2개가 실행되는거니깐 모른다 이거야 ㅇㅇ
	public static void main(String[] args) {
//		2nd 쓰레드 실행
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println("소요시간 1 : " + (System.currentTimeMillis() - Ex13_3.startTime));
	}

}

//	2nd 쓰레드
class ThreadEx3_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("소요시간 2 : " + (System.currentTimeMillis() - Ex13_3.startTime));
	}
}
