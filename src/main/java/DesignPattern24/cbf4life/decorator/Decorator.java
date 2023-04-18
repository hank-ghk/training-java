package DesignPattern24.cbf4life.decorator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* װ���࣬��Ҫ���ҵĳɼ���װ��һ��
*/
public abstract class Decorator extends SchoolReport {
	// ������Ҫ֪�����Ǹ��ɼ���
	private SchoolReport sr;

	// ���캯�������ݳɼ�������
	public Decorator(SchoolReport sr) {

		this.sr = sr;
	}

	// �ɼ�������Ҫ��������
	public void report() {
		this.sr.report();
	}

	// ����ϻ���Ҫǩ����
	public void sign(String name) {
		this.sr.sign(name);
	}
}
