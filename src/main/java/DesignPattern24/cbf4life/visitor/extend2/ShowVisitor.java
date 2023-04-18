package DesignPattern24.cbf4life.visitor.extend2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* չʾ�����÷����ߵĹ������ǿ���ʲô����չʾʲô����
*/
public class ShowVisitor implements IShowVisitor {
	private String info = "";

	// ��ӡ������
	public void report() {
		System.out.println(this.info);
	}

	// ������ͨԱ������װ��Ϣ
	public void visit(CommonEmployee commonEmployee) {
		this.info = this.info + this.getBasicInfo(commonEmployee) + "������"
				+ commonEmployee.getJob() + "\t\n";
	}

	// ���ʾ���Ȼ����װ��Ϣ
	public void visit(Manager manager) {
		this.info = this.info + this.getBasicInfo(manager) + "ҵ����"
				+ manager.getPerformance() + "\t\n";
	}

	// ��װ��������Ϣ
	private String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�"
				+ (employee.getSex() == Employee.FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}
}
