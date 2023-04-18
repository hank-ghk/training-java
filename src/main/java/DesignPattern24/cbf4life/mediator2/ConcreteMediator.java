package DesignPattern24.cbf4life.mediator2;

public class ConcreteMediator extends Mediator {
	@Override
	public void doSomething1() {
		// ����ͬ����ķ�����ֻҪ��public���������Ե���
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	public void doSomething2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}
}
