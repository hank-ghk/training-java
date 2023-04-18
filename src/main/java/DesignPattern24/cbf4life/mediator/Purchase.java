package DesignPattern24.cbf4life.mediator;

public class Purchase {
	// �ɹ�IBM�ͺŵĵ���
	public void buyIBMcomputer(int number) {
		// ���ʿ��
		Stock stock = new Stock();
		// ��������
		Sale sale = new Sale();
		// ���Ե��������
		int saleStatus = sale.getSaleStatus();
		if (saleStatus > 80) { // �����������
			System.out.println("�ɹ�IBM����:" + number + "̨");
			stock.increase(number);
		} else { // �����������
			int buyNumber = number / 2; // �۰�ɹ�
			System.out.println("�ɹ�IBM���ԣ�" + buyNumber + "̨");
		}
	}

	// ���ٲɹ�IBM����

	public void refuseBuyIBM() {
		System.out.println("���ٲɹ�IBM����");
	}
}