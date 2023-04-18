package DesignPattern24.cbf4life.observer.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �����ӣ���˹��ʦ�ܣ���������Ҫ����
*/
public class HanFeiZi implements IHanFeiZi {
	// ����˹��������
	private ILiSi liSi = new LiSi();

	// ������Ҫ�Է���
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		// ֪ͨ��˹
		this.liSi.update("�������ڳԷ�");
	}

	// �����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.liSi.update("������������");
	}
}
