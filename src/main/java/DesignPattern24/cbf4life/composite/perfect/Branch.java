package DesignPattern24.cbf4life.composite.perfect;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ڵ��࣬Ҳ���˺ܶ�
*/
public class Branch extends Corp {
	// �쵼�±�����Щ�¼��쵼��С��
	ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	// ���캯���Ǳ������
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}

	// ����һ��������������СͷĿ��Ҳ�����Ǹ�С��
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}

	// ������Щ����
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}
}