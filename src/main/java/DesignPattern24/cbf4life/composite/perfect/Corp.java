package DesignPattern24.cbf4life.composite.perfect;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ����˾����Ա�ĳ�����
*/
@SuppressWarnings("all")
public abstract class Corp {
	// ��˾ÿ���˶�������
	private String name = "";
	// ��˾ÿ���˶�ְλ
	private String position = "";
	// ��˾ÿ���˶���нˮ
	private int salary = 0;

	/*
	 * ͨ���ӿڵķ�ʽ���ݣ����Ǹı�һ��ϰ�ߣ����ݽ����Ĳ��������»��߿�ʼ �����һЩ��Դ��Ŀ�зǳ�������һ�㹹�캯��������ô�����
	 */
	public Corp(String _name, String _position, int _salary) {
		this.name = _name;
		this.position = _position;
		this.salary = _salary;
	}

	// ���Ա����Ϣ
	public String getInfo() {
		String info = "";
		info = "������" + this.name;
		info = info + "\tְλ��" + this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}
}
