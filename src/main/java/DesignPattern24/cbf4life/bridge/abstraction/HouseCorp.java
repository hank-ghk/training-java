package DesignPattern24.cbf4life.bridge.abstraction;

import com.cbf4life.bridge.implementor.House;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���ز���˾�����շ�����˵Ӧ�ý�realty corp������ǱȽ�׼ȷ�ķ���
* ���������㷿�ز���˾�����Ӣ�ģ����һ��Ӧʲô�����ﻹ��house corp!
*/
public class HouseCorp extends Corp {
	// ���崫��һ��House��Ʒ����
	public HouseCorp(House house) {
		super(house);
	}

	// ���ز���˾��High�ˣ�׬Ǯ����������
	public void makeMoney() {
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}
}