package DesignPattern24.cbf4life.decorator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ϰֿ��ɼ�����
*/
public class Father {
	public static void main(String[] args) {
		// �ɼ����ù���
		SchoolReport sr = new FouthGradeSchoolReport();
		// ���ɼ���
		sr.report();
		// ǩ�������룡
		
		
		//�������ĳɼ����ù���
		SchoolReport srd= new SugarFouthGradeSchoolReport();
		//���ɼ���
		srd.report();
		//Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
		srd.sign("����");//�ҽ�С�����ϰֵ�Ȼ������
	}
}
