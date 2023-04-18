package DesignPattern24.cbf4life.mediator2;

public class ConcreteColleague2 extends Colleague {
	// ͨ�����캯�������н���
	public ConcreteColleague2(Mediator _mediator) {
		super(_mediator);

	}

	// ���з��� self-method
	public void selfMethod2() {
		// �����Լ���ҵ���߼�
	}

	// ��������dep-method
	public void depMethod2() {
		// �����Լ���ҵ���߼�
		// �Լ����ܴ����ҵ���߼���ί�и��н��ߴ���
		super.mediator.doSomething2();
	}
}