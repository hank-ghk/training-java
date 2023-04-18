package DesignPattern24.cbf4life.composite;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���е���֦�ڵ�
*/
@SuppressWarnings("all")
public class Branch implements IBranch {
	// �洢�ӽڵ����Ϣ
	private ArrayList subordinateList = new ArrayList();
	// ��֦�ڵ������
	private String name = "";
	// ��֦�ڵ��ְλ
	private String position = "";
	// ��֦�ڵ��нˮ
	private int salary = 0;

	// ͨ�����캯��������֦�ڵ�Ĳ���
	public Branch(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	// ����һ������֦�ڵ�
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}

	// ����һ��Ҷ�ӽڵ�
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}

	// ����Լ���֦�ڵ����Ϣ
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}

	// ����¼�����Ϣ
	public ArrayList getSubordinateInfo() {
		return this.subordinateList;
	}
}
