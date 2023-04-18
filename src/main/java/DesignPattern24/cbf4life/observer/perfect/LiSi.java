package DesignPattern24.cbf4life.observer.perfect;

import java.util.Observable;
import java.util.Observer;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��˹����ˣ��Ǹ��۲��ߣ�ֻҪ������һ�ж�������߾�֪��
*/
public class LiSi implements Observer {
	// ������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	public void update(Observable observable, Object obj) {
		System.out.println("��˹���۲쵽��˹�����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(obj.toString());
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}

	// �㱨����ʼ��
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
