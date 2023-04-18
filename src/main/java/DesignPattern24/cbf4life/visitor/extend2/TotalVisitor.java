package DesignPattern24.cbf4life.visitor.extend2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���ܱ��÷�������������ã��������е�����һ��һ��������Ȼ�����
*/
public class TotalVisitor implements ITotalVisitor {
	// ���ž���Ĺ���ϵ����5
	private final static int MANAGER_COEFFICIENT = 5;
	// Ա���Ĺ���ϵ����2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	// ��ͨԱ���Ĺ����ܺ�
	private int commonTotalSalary = 0;
	// ���ž���Ĺ����ܺ�
	private int managerTotalSalary = 0;

	public void totalSalary() {
		System.out.println("����˾���¹����ܶ���"
				+ (this.commonTotalSalary + this.managerTotalSalary));
	}

	// ������ͨԱ�������㹤���ܶ�
	public void visit(CommonEmployee commonEmployee) {
		this.commonTotalSalary = this.commonTotalSalary
				+ commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
	}

	// ���ʲ��ž������㹤���ܶ�
	public void visit(Manager manager) {
		this.managerTotalSalary = this.managerTotalSalary + manager.getSalary()
				* MANAGER_COEFFICIENT;
	}
}
