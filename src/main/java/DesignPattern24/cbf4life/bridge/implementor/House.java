package DesignPattern24.cbf4life.bridge.implementor;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �����Ҽ��Ź�˾�ǵķ���
*/
public class House extends Product {
	// �������Ͷ������£��ô�Ҳ�Ǹ�����
	public void beProducted() {
		System.out.println("�������ķ�����������ӵ�...");
	}

	// ��Ȼ�Ƕ�������Ҳ���ܹ����۳�ȥ��
	public void beSelled() {
		System.out.println("�������ķ�������ȥ��...");
	}
}
