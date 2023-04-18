package DesignPattern24.cbf4life.composite.advance;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��Щ��֦�ڵ�Ҳ������Щ�쵼�Ǽ�Ҫ���Լ�����Ϣ����Ҫ֪���Լ����������
*/
@SuppressWarnings("all")
public class Branch implements IBranch, ICorp {
	// �쵼Ҳ���ˣ�Ҳ������
	private String name = "";
	// �쵼���쵼��ͬ��Ҳ��ְλ����
	private String position = "";
	// �쵼Ҳ����нˮ��
	private int salary = 0;
	// �쵼�±�����Щ�¼��쵼��С��
	ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();

	// ͨ�����캯�������쵼����Ϣ
	public Branch(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	// ����һ��������������СͷĿ��Ҳ�����Ǹ�С��
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}

	// ������Щ����
	public ArrayList<ICorp> getSubordinate() {
		return this.subordinateList;
	}

	// �쵼Ҳ���ˣ���Ҳ����Ϣ
	public String getInfo() {
		String info = "";
		info = "������" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}
}