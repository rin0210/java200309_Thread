package Test;

public class Main {
	// 스레드 : 실제로 코드를 실행하는 것(실제로 jvm에서 명령문을 실행하는 단위)
	// 싱글 스레드 : 클래스(설계도)가 여러개여도 실행하고 있는 스레드는 한개인 것
	// 멀티 스레드
	public static void main(String[] args) {
		a aa = new a();
//		aa.gogo();
		aa.setName("1st a"); // 스레드 이름 지정
		aa.start();	// run 메서드를 호출할때는 참조변수 . run이 아니라 start를 해준다. 이걸 해주어야 멀티스레드 실행
					// 메인이 실행시키지만 더이상 관여하지않고 독자적으로 스레드를 실행시켜준다.
		
		a a1 = new a();
//		a1.gogo();
		a1.start();

		a a2 = new a();
//		a2.gogo();
		a2.start();

		try {
			aa.join();	// join을 걸어주면 main스레드가 가장 늦게 실행됨
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main 종료");
	}

}
