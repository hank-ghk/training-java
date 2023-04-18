package DesignPattern24.cbf4life.chainOfResponsibility.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ������
*/
public class Son extends Handler {
	// ����ֻ����ĸ�׵�����
	public Son() {
		super(3);
	}

	// ���ӵĴ�
	public void response(IWomen women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}

}
