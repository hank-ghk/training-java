package DesignPattern24.cbf4life.visitor.common2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
public class Visitor implements IVisitor {
	// ������ͨԱ������ӡ������
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	// ���ʲ��ž�����ӡ������
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	// ��װ��������Ϣ
	private String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�"
				+ (employee.getSex() == Employee.FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}

	// ��װ�����ž������Ϣ
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "ҵ����" + manager.getPerformance() + "\t";

		return basicInfo + otherInfo;
	}

	// ��װ����ͨԱ����Ϣ
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "������" + commonEmployee.getJob() + "\t";
		return basicInfo + otherInfo;
	}
}