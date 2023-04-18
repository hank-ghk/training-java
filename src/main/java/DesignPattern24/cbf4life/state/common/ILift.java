package DesignPattern24.cbf4life.state.common;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ�����ݵĽӿ�
*/
public interface ILift {
	// ���ȵ����ſ�������
	public void open();

	// �������п������ǵ�ȻҲ���йر���

	public void close();

	// ����Ҫ�������£�������
	public void run();

	// ���ݻ�Ҫ��ͣ������ͣ�������Ǿͳ�����
	public void stop();
}
