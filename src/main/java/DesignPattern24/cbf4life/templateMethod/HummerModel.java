package DesignPattern24.cbf4life.templateMethod;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* Hummer Model�Ǻ�����ģ�͵���˼�����Ǻ�����Ů��ģ
*/
public abstract class HummerModel {
	/*
	 * ���ȣ����ģ��Ҫ�ܹ��������������������ҡ���������ǵ������������� ��Ҫ�ܹ����������������ʵ��Ҫ��ʵ��������
	 */
	protected abstract void start();

	// �ܷ������ǻ�Ҫ��ͣ�������ǲ����汾��
	protected abstract void stop();

	// ���Ȼ���������ǵενУ��������ٽ�
	protected abstract void alarm();

	// ������¡¡���죬�������Ǽٵ�
	protected abstract void engineBoom();

	// ��ģ��Ӧ�û��ܰɣ���������˵ģ����ǵ�����������֮Ҫ����
	final public void run() {
		// �ȷ�������
		this.start();
		// ���濪ʼ����
		this.engineBoom();
		//��������������죬����������Ͳ���
		if(this.isAlarm()){
		this.alarm();
		}
		// ����Ŀ�ĵؾ�ͣ��
		this.stop();
	}
	//���ӷ�����Ĭ�������ǻ����
	protected boolean isAlarm() {
		return true;
	}
}