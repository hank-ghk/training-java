package DesignPattern24.cbf4life.observer.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���Client�������ǣ������ǵ��ӽǿ��������ʷ
*/
public class Client {
	public static void main(String[] args) {
		// �����������
		HanFeiZi hanFeiZi = new HanFeiZi();
		// Ȼ���������ǿ����������ڸ�ʲô
		hanFeiZi.haveBreakfast();
		// ������������
		hanFeiZi.haveFun();
	}
}
