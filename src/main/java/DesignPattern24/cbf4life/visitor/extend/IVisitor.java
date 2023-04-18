package DesignPattern24.cbf4life.visitor.extend;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �����ߣ���Ҫȥ�����˼ҵ�������
*/
public interface IVisitor {
	// ���ȶ����ҿ��Է�����ͨԱ��
	public void visit(CommonEmployee commonEmployee);

	// ��ζ��壬�һ����Է��ʲ��ž���
	public void visit(Manager manager);

	// ͳ������Ա�������ܺ�
	public int getTotalSalary();
}
