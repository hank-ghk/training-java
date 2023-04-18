package DesignPattern24.cbf4life.decorator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���꼶�ĳɼ��������������ѧУ��һ��ʵʩ����ǰû�иɹ�
* ���֡�ȱ�¡��¡�
*/
public class FouthGradeSchoolReport extends SchoolReport {
	// �ҵĳɼ���
	public void report() {
		// �ɼ����ĸ�ʽ��������ӵ�
		System.out.println("�𾴵�XXX�ҳ�:");
		System.out.println(" ......");
		System.out.println(" ���� 62 ��ѧ65 ���� 98 ��Ȼ 63");
		System.out.println(" .......");
		System.out.println(" �ҳ�ǩ���� ");
	}

	// �ҳ�ǩ��
	public void sign(String name) {
		System.out.println("�ҳ�ǩ��Ϊ��" + name);
	}

}
