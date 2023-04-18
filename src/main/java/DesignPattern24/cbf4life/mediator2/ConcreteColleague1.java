package DesignPattern24.cbf4life.mediator2;

public class ConcreteColleague1 extends Colleague {
	// ͨ�����캯�������н���
	public ConcreteColleague1(Mediator _mediator) {
		super(_mediator);
	}

	// ���з��� self-method
	public void selfMethod1() {
		// �����Լ���ҵ���߼�
	}

	// ��������dep-method
	public void depMethod1() {
		// �����Լ���ҵ���߼�
		// �Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething1();
	}
}