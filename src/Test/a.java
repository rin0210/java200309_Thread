package Test;

public class a extends Thread {	// ������ ��� : a��� class�� ������� ó���ϰڴ�. (������ �����带 ����)
								// ����Ŭ���� & ����Ŭ����
	
	a() {
//		String thisName = Thread.currentThread().getName();	// ���� ����ǰ��ִ� �������� �̸��� �����Ͷ�
//		for (int i = 0; i < 10; i++) {
//			System.out.println(thisName + " : " + i);
//		}
	}

	@Override
	public void run() {	// �̰� ����Ǿ�� ��Ƽ�����尡 ���� �ȴ�.
//		super.run();
//		// super : ���� �ƴ� �θ���� run �޼��带 ȣ��
		
		gogo();
	}

	public void gogo() {
		String thisName = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(thisName + " : " + i);
		}
	}
	
}
