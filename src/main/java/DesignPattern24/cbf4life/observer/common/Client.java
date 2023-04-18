package DesignPattern24.cbf4life.observer.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���Client�������ǣ������ǵ��ӽǿ��������ʷ
*/
public class Client {
	public static void main(String[] args) throws InterruptedException {
		// ����������Ӻ���˹
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		// �۲����
		Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
		// ��ʼ�����̣߳����
		watchBreakfast.start();
		// �۲��������
		Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
		watchFun.start();

		// Ȼ���������ǿ����������ڸ�ʲô
		Thread.sleep(1000); // ���̵߳ȴ�1����������ִ��
		hanFeiZi.haveBreakfast();
		// ������������
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}