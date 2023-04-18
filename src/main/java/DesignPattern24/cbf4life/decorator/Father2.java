package DesignPattern24.cbf4life.decorator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ϰֿ��ɼ�����
*/
public class Father2 {
	public static void main(String[] args) {
		// �ɼ����ù���
		SchoolReport sr;
		sr = new FouthGradeSchoolReport(); // ԭװ�ĳɼ���
		// ������߷�˵���ĳɼ���
		sr = new HighScoreDecorator(sr);
		// �ּ��˳ɼ�������˵��
		sr = new SortDecorator(sr);
		// ���ɼ���
		sr.report();
		// Ȼ���ϰ֣�һ�����ܿ��ģ���ǩ����
		sr.sign("����"); // �ҽ�С�����ϰֵ�Ȼ������
	}
}
