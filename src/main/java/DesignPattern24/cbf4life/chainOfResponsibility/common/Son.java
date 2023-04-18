package DesignPattern24.cbf4life.chainOfResponsibility.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ������
*/
public class Son implements IHandler {
	// Ŀǰ�������ʾ
	public void HandleMessage(IWomen women) {
		System.out.println("ĸ�׵���ʾ�ǣ�" + women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��");
	}
}
