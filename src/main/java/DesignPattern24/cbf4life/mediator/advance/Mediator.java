package DesignPattern24.cbf4life.mediator.advance;


public class Mediator extends AbstractMediator {
	// �н�������Ҫ�ķ���
	public void execute(String str, Object... objects) {
		if (str.equals("purchase.buy")) { // �ɹ�����
			this.buyComputer((Integer) objects[0]);
		} else if (str.equals("sale.sell")) { // ���۵���
			this.sellComputer((Integer) objects[0]);
		} else if (str.equals("sale.offsell")) { // �ۼ�����
			this.offSell();
		} else if (str.equals("stock.clear")) { // ��ִ���
			this.clearStock();
		}
	}

	// �ɹ�����
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) { // �����������
			System.out.println("�ɹ�IBM����:" + number + "̨");
			super.stock.increase(number);
		} else { // �����������
			int buyNumber = number / 2; // �۰�ɹ�
			System.out.println("�ɹ�IBM���ԣ�" + buyNumber + "̨");
		}
	}

	// ���۵���
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) { // ���������������
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}

	// �ۼ����۵���
	private void offSell() {
		System.out.println("�ۼ�����IBM����" + stock.getStockNumber() + "̨");
	}

	// ��ִ���
	private void clearStock() {
		// Ҫ���������
		super.sale.offSale();
		// Ҫ��ɹ���Ա��Ҫ�ɹ�
		super.purchase.refuseBuyIBM();
	}
}