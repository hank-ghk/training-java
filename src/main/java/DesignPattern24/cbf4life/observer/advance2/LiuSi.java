package DesignPattern24.cbf4life.observer.advance2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��˹����ˣ��Ǹ��۲��ߣ�ֻҪ������һ�ж�������߾�֪��
* ��׫������
*/
public class LiuSi implements Observer {
	// ��˹���۲쵽�����ӻ���Լ�Ҳ��һ��������
	public void update(String str) {
		System.out.println("��˹���۲쵽�����ӻ����ʼ������...");
		this.happy(str);
		System.out.println("��˹���汻������\n");
	}

	// һ���������б仯�����Ϳ���
	private void happy(String context) {
		System.out.println("��˹����Ϊ" + context + ",���������ҿ���ѽ��");
	}
}