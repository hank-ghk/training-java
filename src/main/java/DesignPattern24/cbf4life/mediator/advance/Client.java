package DesignPattern24.cbf4life.mediator.advance;

public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		// �ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		// ������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		// �ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

}