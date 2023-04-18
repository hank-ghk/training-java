package DesignPattern24.cbf4life.mediator;

import java.util.Random;

public class Sale {
	// ����IBM�ͺŵĵ���
	public void sellIBMComputer(int number) {
		// ���ʿ��
		Stock stock = new Stock();
		// ���ʲɹ�
		Purchase purchase = new Purchase();
		if (stock.getStockNumber() < number) { // ���������������
			purchase.buyIBMcomputer(number);
		}
		System.out.println("����IBM����" + number + "̨");
		stock.decrease(number);
	}

	// �����������,0����100֮��仯��0���������û������100����ǳ���������һ����һ��
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��" + saleStatus);
		return saleStatus;
	}

	// �ۼ۴���
	public void offSale() {
		// �ⷿ�ж���������
		Stock stock = new Stock();
		System.out.println("�ۼ�����IBM����" + stock.getStockNumber() + "̨");
	}
}