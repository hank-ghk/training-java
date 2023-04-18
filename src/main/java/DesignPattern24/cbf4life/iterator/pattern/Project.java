package DesignPattern24.cbf4life.iterator.pattern;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ������Ŀ����Ϣ��
*/
@SuppressWarnings("all")
public class Project implements IProject {
	// ����һ����Ŀ�б�˵�е���Ŀ����������
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	// ��Ŀ����
	private String name = "";
	// ��Ŀ��Ա����
	private int num = 0;
	// ��Ŀ����
	private int cost = 0;

	public Project() {
	}

	// ����һ�����캯�����������ϰ���Ҫ��������Ϣ�洢����
	private Project(String name, int num, int cost) {
		// ��ֵ����ĳ�Ա������
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	// ������Ŀ
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name, num, cost));
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

	// ����һ����������
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}
}
