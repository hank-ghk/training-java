package DesignPattern24.cbf4life.state.common2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ�����ݵĽӿ�
*/
public interface ILift {
	// ���ݵ��ĸ�״̬
	public final static int OPENING_STATE = 1; // �ų�״̬
	public final static int CLOSING_STATE = 2; // �ű�״̬
	public final static int RUNNING_STATE = 3; // ����״̬
	public final static int STOPPING_STATE = 4; // ֹͣ״̬��
	// ���õ��ݵ�״̬

	public void setState(int state);

	// ���ȵ����ſ�������
	public void open();

	// �������п������ǵ�ȻҲ���йر���
	public void close();

	// ����Ҫ�������£�������
	public void run();

	// ���ݻ�Ҫ��ͣ������ͣ�������Ǿͳ�����
	public void stop();
}
