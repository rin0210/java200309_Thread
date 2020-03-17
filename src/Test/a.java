package Test;

public class a extends Thread {	// 스레드 상속 : a라는 class를 스레드로 처리하겠다. (별도의 스레드를 만듦)
								// 슈퍼클래스 & 서브클래스
	
	a() {
//		String thisName = Thread.currentThread().getName();	// 현재 실행되고있는 스레드의 이름을 가져와라
//		for (int i = 0; i < 10; i++) {
//			System.out.println(thisName + " : " + i);
//		}
	}

	@Override
	public void run() {	// 이게 실행되어야 멀티스레드가 실행 된다.
//		super.run();
//		// super : 내가 아닌 부모님의 run 메서드를 호출
		
		gogo();
	}

	public void gogo() {
		String thisName = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(thisName + " : " + i);
		}
	}
	
}
