package DesignPattern24.cbf4life.bridge;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����ɽկ�ϴ�������ɶ�Ҿ�����ɶ
* ��������iPod
*/
public class IPodCorp extends Corp {
	// �ҿ�ʼ����iPod��
	protected void produce() {
		System.out.println("������iPod...");
	}

	// ɽկ��iPod�ܳ���������ѽ
	protected void sell() {
		System.out.println("iPod����...");
	}

	// ��׬Ǯ
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}
}
