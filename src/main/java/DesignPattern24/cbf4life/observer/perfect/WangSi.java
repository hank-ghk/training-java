package DesignPattern24.cbf4life.observer.perfect;

import java.util.Observable;
import java.util.Observer;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��˹��Ҳ�ǹ۲��ߣ���׫������
*/
public class WangSi implements Observer {
	// ��˹�������������л���Լ����ܲ���
	public void update(Observable observable, Object obj) {
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(obj.toString());
		System.out.println("��˹������Ŀ�����...\n");
	}

	// һ����˹�л���Ϳޣ�ʹ��
	private void cry(String context) {
		System.out.println("��˹����Ϊ" + context + "�����������ұ���ѽ��");
	}
}