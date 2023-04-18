package DesignPattern24.cbf4life.bridge;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��װ��˾������е����ڲ���ô��
*/
public class ClothesCorp extends Corp {
	// ��װ��˾�����ľ����·���
	protected void produce() {
		System.out.println("��װ��˾�����·�...");
	}

	// ��װ��˾���װ����ֻ����װ�������·���ģ��
	protected void sell() {
		System.out.println("��װ��˾�����·�...");
	}

	// ��װ��˾������������ô˵Ҳ��׬Ǯ��ҵҲ
	public void makeMoney() {
		super.makeMoney();
		System.out.println("��װ��˾׬СǮ...");
	}
}
