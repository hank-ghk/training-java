package DesignPattern24.cbf4life.builder;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���۳�ģ��
*/
public class BenzModel extends CarModel {
	@Override
	protected void alarm() {
		System.out.println("���۳�������������������ӵ�...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("���۳������������������...");
	}

	@Override
	protected void start() {
		System.out.println("���۳���������������ӵ�...");
	}

	@Override
	protected void stop() {
		System.out.println("���۳�Ӧ������ͣ��...");
	}
}
