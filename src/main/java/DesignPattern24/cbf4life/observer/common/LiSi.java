package DesignPattern24.cbf4life.observer.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��˹����ˣ��Ǹ��۲��ߣ�ֻҪ������һ�ж�������߾�֪��
*/
public class LiSi implements ILiSi {
	// ������˹�Ǹ��۲��ߣ�һ���������л������֪��������Ҫ���ϰ�㱨
	public void update(String str) {
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨��...");
		this.reportToQiShiHuang(str);
		System.out.println("��˹���㱨��ϣ����ϰ��͸��������ܲ��Գ�...\n");
	}

	// �㱨����ʼ��
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
