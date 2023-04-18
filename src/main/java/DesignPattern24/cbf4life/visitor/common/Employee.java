package DesignPattern24.cbf4life.visitor.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��һ����λ��˭����Ա�����¹����ǲ��ž�����С��
*/
public abstract class Employee {
	public final static int MALE = 0; // 0����������
	public final static int FEMALE = 1; // 1������Ů��
	// �¹���˭�����й���
	private String name;
	// ֻҪ��Ա���Ǿ���нˮ
	private int salary;
	// �Ա����Ҫ
	private int sex;

	// �����Ǽ򵥵�getter/setter������˵
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	// ��ӡ��Ա������Ϣ
	public final void report() {
		String info = "������" + this.name + "\t";
		info = info + "�Ա�" + (this.sex == FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + this.salary + "\t";

		// ���Ա����������Ϣ
		info = info + this.getOtherInfo();
		System.out.println(info);
	}

	// ƴװԱ����������Ϣ
	protected abstract String getOtherInfo();
}
