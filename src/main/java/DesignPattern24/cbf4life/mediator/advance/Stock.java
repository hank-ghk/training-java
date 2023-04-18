package DesignPattern24.cbf4life.mediator.advance;

public class Stock extends AbstractColleague {
	public Stock(AbstractMediator _mediator) {
		super(_mediator);
	}

	// �տ�ʼ��100̨����
	private static int COMPUTER_NUMBER = 100;

	// �������
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ��潵��
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("�������Ϊ��" + COMPUTER_NUMBER);
	}

	// ��ÿ������
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	// ���ѹ�����ˣ���Ҫ֪ͨ�ɹ���Ա��Ҫ�ɹ���������ԱҪ��������
	public void clearStock() {
		System.out.println("����������Ϊ��" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}