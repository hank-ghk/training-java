package DesignPattern24.cbf4life.observer.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �����ӣ���˹��ʦ�ܣ���������Ҫ����
*/
public class HanFeiZi implements IHanFeiZi {
	// �������Ƿ��ڳԷ�����Ϊ��ص��жϱ�׼
	private boolean isHaveBreakfast = false;
	// �������Ƿ�������
	private boolean isHaveFun = false;

	// ������Ҫ�Է���
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		this.isHaveBreakfast = true;
	}

	// �����ӿ�ʼ������,�Ŵ���ûɶ���֣������뵽�ľ���ô��
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.isHaveFun = true;
	}

	// ������bean�Ļ���������getter/setter������˵
	public boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}

	public void setHaveBreakfast(boolean isHaveBreakfast) {

		this.isHaveBreakfast = isHaveBreakfast;
	}

	public boolean isHaveFun() {
		return isHaveFun;
	}

	public void setHaveFun(boolean isHaveFun) {
		this.isHaveFun = isHaveFun;
	}
}
