package DesignPattern24.cbf4life.visitor.common2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ͨԱ����Ҳ������С��С��
*/
public class CommonEmployee extends Employee {
	// �������ݣ�����ǳ���Ҫ���Ժ��ְҵ�滮���ǿ������
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	// ����������߹�������

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
