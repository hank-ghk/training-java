package DesignPattern24.cbf4life.command;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��Ŀ��ֳ��������飬ÿ���黹��Ҫ������ɾ�ĵ�����
*/
public abstract class Group {
	// ����˫���ֿ��칫����Ҫ���Ǹ������ۣ�������Ҫ�ҵ������
	public abstract void find();

	// ��Ҫ�����ӹ���
	public abstract void add();

	// ��Ҫ��ɾ������
	public abstract void delete();

	// ��Ҫ���޸Ĺ���
	public abstract void change();

	// ��Ҫ��������еı���ƻ�
	public abstract void plan();
}
