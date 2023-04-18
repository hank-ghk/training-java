package DesignPattern24.cbf4life.templateMethod;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ������ÿ��ԽҰ�ߵ��������H1��ӽ�����ϵ��
*/
public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true; //�Ƿ�Ҫ������
	@Override
	public void alarm() {
		System.out.println("����H1����...");
	}

	@Override
	public void engineBoom() {
		System.out.println("����H1����������������...");
	}

	@Override
	public void start() {
		System.out.println("����H1����...");

	}

	@Override
	public void stop() {
		System.out.println("����H1ͣ��...");
	}
	
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	// Ҫ��Ҫ�����ȣ����пͻ�����������
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}