package DesignPattern24.cbf4life.iterator;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ϰ�������Ŀ��Ϣ��
*/
public class Boss {
	public static void main(String[] args) {
		// ����һ��List��������е���Ŀ����
		ArrayList<IProject> projectList = new ArrayList<IProject>();
		// ���������ս��Ŀ
		projectList.add(new Project("�����ս��Ŀ", 10, 100000));
		// ����Ťתʱ����Ŀ
		projectList.add(new Project("Ťתʱ����Ŀ", 100, 10000000));
		// ���ӳ��˸�����Ŀ
		projectList.add(new Project("���˸�����Ŀ", 10000, 1000000000));
		// ���100����Ŀ
		for (int i = 4; i < 10; i++) {
			projectList.add(new Project("��" + i + "����Ŀ", i * 5, i * 1000000));
		}
		// ����һ��ArrayList�������е����ݶ�ȡ��
		for (IProject project : projectList) {
			System.out.println(project.getProjectInfo());
		}
	}
}
