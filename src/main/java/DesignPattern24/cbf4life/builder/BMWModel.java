package DesignPattern24.cbf4life.builder;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����ģ��
*/
public class BMWModel extends CarModel {
	@Override
	protected void alarm() {
		System.out.println("����������������������ӵ�...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("���������������������...");
	}

	@Override
	protected void start() {
		System.out.println("������������������ӵ�...");
	}

	@Override
	protected void stop() {
		System.out.println("����Ӧ������ͣ��...");
	}
}