package Test;

public class Main {
	// ������ : ������ �ڵ带 �����ϴ� ��(������ jvm���� ��ɹ��� �����ϴ� ����)
	// �̱� ������ : Ŭ����(���赵)�� ���������� �����ϰ� �ִ� ������� �Ѱ��� ��
	// ��Ƽ ������
	public static void main(String[] args) {
		a aa = new a();
//		aa.gogo();
		aa.setName("1st a"); // ������ �̸� ����
		aa.start();	// run �޼��带 ȣ���Ҷ��� �������� . run�� �ƴ϶� start�� ���ش�. �̰� ���־�� ��Ƽ������ ����
					// ������ �����Ű���� ���̻� ���������ʰ� ���������� �����带 ��������ش�.
		
		a a1 = new a();
//		a1.gogo();
		a1.start();

		a a2 = new a();
//		a2.gogo();
		a2.start();

		try {
			aa.join();	// join�� �ɾ��ָ� main�����尡 ���� �ʰ� �����
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main ����");
	}

}
