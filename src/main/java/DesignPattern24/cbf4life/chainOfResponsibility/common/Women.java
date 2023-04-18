package DesignPattern24.cbf4life.chainOfResponsibility.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �Ŵ�Ů�Ե��ܳ�
*/
public class Women implements IWomen {
	/*
	 * ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״�� 1---δ���� 2---���� 3---����
	 */
	private int type = 0;
	// ��Ů����ʾ
	private String request = "";

	// ���캯�����ݹ�������
	public Women(int _type, String _request) {
		this.type = _type;
		this.request = _request;
	}

	// ����Լ���״��
	public int getType() {
		return this.type;
	}

	// ��ø�Ů������
	public String getRequest() {
		return this.request;
	}
}
