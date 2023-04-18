package DesignPattern24.cbf4life.decorator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ѧУ����������㱨
*/
public class SortDecorator extends Decorator {
	// ���캯��
	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	// �����ϰ�ѧУ���������
	private void reportSort() {
		System.out.println("����������38��...");
	}

	// �ϰֿ���ɼ������ٸ���������ǿ����
	@Override
	public void report() {
		super.report();
		this.reportSort();
	}
}