package DesignPattern24.cbf4life.mediator.advance;

public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	// ���캯��
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// �н�������Ҫ�ķ����������¼�����������������֮��Ĺ�ϵ
	public abstract void execute(String str, Object... objects);
}