package DesignPattern24.cbf4life.mediator.advance;

public class Purchase extends AbstractColleague {
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}

	// �ɹ�IBM�ͺŵĵ���
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	// ���ڲɹ�IBM����
	public void refuseBuyIBM() {
		System.out.println("���ٲɹ�IBM����");
	}
}