package DesignPattern24.cbf4life.visitor.extend;

import java.util.ArrayList;
import java.util.List;

import com.cbf4life.visitor.extend.CommonEmployee;
import com.cbf4life.visitor.extend.Employee;
import com.cbf4life.visitor.extend.Manager;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
public class Client {
	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		for (Employee emp : mockEmployee()) {
			emp.accept(visitor);
		}
		System.out.println("����˾���¹����ܶ��ǣ�" + visitor.getTotalSalary());
	}
	
	// ģ�����˾����Ա��������ǿ����������������ͨ���־ò㴫�ݹ�����
	public static List<Employee> mockEmployee() {
		List<Employee> empList = new ArrayList<Employee>();
		// �����������Ա��
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setJob("��дJava���򣬾��Ե����졢�๤�Ӱ��˹�");
		zhangSan.setName("����");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		empList.add(zhangSan);
		// �����������Ա��
		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("ҳ����������������̫�������ˣ�");
		liSi.setName("����");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		empList.add(liSi);
		// �ٲ���һ������
		Manager wangWu = new Manager();
		wangWu.setName("����");
		wangWu.setPerformance("�������Ǹ�ֵ�������һ�����ƨѽ");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		empList.add(wangWu);
		return empList;
	}
}