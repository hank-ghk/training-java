package DesignPattern24.cbf4life.composite;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��С��Ҷ�ӽڵ�
*/
@SuppressWarnings("all")
public class Leaf implements ILeaf {
	// Ҷ�ӽ�ʲô����
	private String name = "";
	// Ҷ�ӵ�ְλ
	private String position = "";
	// Ҷ�ӵ�нˮ
	private int salary = 0;

	// ͨ�����캯��������Ϣ
	public Leaf(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	// ��С��С��ֻ�ܻ���Լ�����Ϣ��
	public String getInfo() {
		String info = "";
		info = "���ƣ�" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}
}