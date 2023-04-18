package DesignPattern24.cbf4life.mediator2;

public abstract class Mediator {
	// ����ͬ����
	protected ConcreteColleague1 c1;
	protected ConcreteColleague2 c2;

	// ͨ��getter/setter������ͬ����ע�����
	public ConcreteColleague1 getC1() {
		return c1;

	}

	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}

	public ConcreteColleague2 getC2() {
		return c2;
	}

	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}

	// �н���ģʽ��ҵ���߼�
	public abstract void doSomething1();

	public abstract void doSomething2();
}