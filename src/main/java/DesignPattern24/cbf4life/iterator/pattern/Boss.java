package DesignPattern24.cbf4life.iterator.pattern;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ϰ�������Ŀ��Ϣ��
*/
public class Boss {
	public static void main(String[] args) {
		// ����һ��List��������е���Ŀ����
		IProject project = new Project();
		// ���������ս��Ŀ
		project.add("�����ս��Ŀddddd", 10, 100000);
		// ����Ťתʱ����Ŀ
		project.add("Ťתʱ����Ŀ", 100, 10000000);
		// ���ӳ��˸�����Ŀ
		project.add("���˸�����Ŀ", 10000, 1000000000);
		// ���100����Ŀ
		for (int i = 4; i < 104; i++) {
			project.add("��" + i + "����Ŀ", i * 5, i * 1000000);
		}
		// ����һ��ArrayList�������е����ݶ�ȡ��
		IProjectIterator projectIterator = project.iterator();
		while (projectIterator.hasNext()) {
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
