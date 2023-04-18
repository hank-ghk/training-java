package DesignPattern24.cbf4life.bridge;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���ز���˾�����շ�����˵Ӧ�ý�realty corp������ǱȽ�׼ȷ�ķ���
* ���������㷿�ز���˾�����Ӣ�ģ����һ��Ӧʲô�����ﻹ��house corp!
*/
public class HouseCorp extends Corp {
	// ���ز���˾���ǸǷ���
	protected void produce() {
		System.out.println("���ز���˾�Ƿ���...");
	}

	// ���ز������ӣ��Լ�ס�ǿɲ�׬Ǯ
	protected void sell() {
		System.out.println("���ز���˾���۷���...");
	}

	// ���ز���˾��High�ˣ�׬Ǯ����������
	public void makeMoney() {
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}
}
