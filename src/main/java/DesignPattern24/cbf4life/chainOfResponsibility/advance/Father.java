package DesignPattern24.cbf4life.chainOfResponsibility.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����
*/
public class Father extends Handler {
	// ����ֻ����Ů��������
	public Father() {
		super(1);
	}

	// ���׵Ĵ�
	@Override
	public void response(IWomen women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}

}