package DesignPattern24.cbf4life.visitor.extend;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
public class Visitor implements IVisitor {
	// ���ž���Ĺ���ϵ����5
	private final static int MANAGER_COEFFICIENT = 5;
	// Ա���Ĺ���ϵ����2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	// ��ͨԱ���Ĺ����ܺ�
	private int commonTotalSalary = 0;
	// ���ž���Ĺ����ܺ�
	private int managerTotalSalary = 0;

	// ������ͨԱ������ӡ������
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
		// ������ͨԱ����нˮ�ܺ�
		this.calCommonSlary(commonEmployee.getSalary());
	}

	// ���ʲ��ž�����ӡ������
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
		// ���㲿�ž���Ĺ����ܺ�
		this.calManagerSalary(manager.getSalary());
	}

	// ��װ��������Ϣ
	private String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�"
				+ (employee.getSex() == Employee.FEMALE ? "Ů" : "��")

				+ "\t";
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

	// ���㲿�ž���Ĺ����ܺ�
	private void calManagerSalary(int salary) {
		this.managerTotalSalary = this.managerTotalSalary + salary
				* MANAGER_COEFFICIENT;
	}

	// ������ͨԱ���Ĺ����ܺ�
	private void calCommonSlary(int salary) {
		this.commonTotalSalary = this.commonTotalSalary + salary
				* COMMONEMPLOYEE_COEFFICIENT;
	}

	// �������Ա���Ĺ����ܺ�
	public int getTotalSalary() {
		return this.commonTotalSalary + this.managerTotalSalary;
	}
}