package DesignPattern24.cbf4life.visitor.extend;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��������
*/
public class Manager extends Employee {
	// ���������ְ��ǳ���ȷ��ҵ��
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	// ���ž�����������߷���
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
