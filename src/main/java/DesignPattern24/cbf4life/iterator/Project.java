package DesignPattern24.cbf4life.iterator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ������Ŀ����Ϣ��
*/
public class Project implements IProject {
	// ��Ŀ����
	private String name = "";
	// ��Ŀ��Ա����
	private int num = 0;
	// ��Ŀ����
	private int cost = 0;

	// ����һ�����캯�����������ϰ���Ҫ��������Ϣ�洢����
	public Project(String name, int num, int cost) {
		// ��ֵ����ĳ�Ա������
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	// �õ���Ŀ����Ϣ
	public String getProjectInfo() {
		String info = "";
		// �����Ŀ������
		info = info + "��Ŀ�����ǣ�" + this.name;
		// �����Ŀ����
		info = info + "\t��Ŀ����: " + this.num;
		// ��Ŀ����
		info = info + "\t ��Ŀ���ã�" + this.cost;
		return info;
	}
}
