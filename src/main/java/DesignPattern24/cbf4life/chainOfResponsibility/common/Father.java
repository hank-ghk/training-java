package DesignPattern24.cbf4life.chainOfResponsibility.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����
*/
public class Father implements IHandler {
	// δ����Ů������ʾ����
	public void HandleMessage(IWomen women) {
		System.out.println("Ů������ʾ�ǣ�" + women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��");
	}
}
