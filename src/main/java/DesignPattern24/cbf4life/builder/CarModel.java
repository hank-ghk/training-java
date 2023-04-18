package DesignPattern24.cbf4life.builder;

import java.util.ArrayList;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ������ģ�͵ĳ����࣬���еĳ���ģ�Ͷ��̳�������
*/
public abstract class CarModel {
	// ��������Ǹ�����������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<String>();

	/*
	 * ģ����������ʼ����
	 */
	protected abstract void start();

	// �ܷ������ǻ�Ҫ��ͣ�������ǲ����汾��
	protected abstract void stop();

	// ���Ȼ���������ǵενУ��������ٽ�
	protected abstract void alarm();

	// ������¡¡���죬�������Ǽٵ�
	protected abstract void engineBoom();

	// ��ģ��Ӧ�û��ܰɣ���������Ƶģ����ǵ�����������֮Ҫ����
	final public void run() {
		// ѭ��һ�飬˭��ǰ������ִ��˭
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) { // �����start�ؼ��֣�
				this.start(); // ��������
			} else if (actionName.equalsIgnoreCase("stop")) { // �����stop�ؼ���
				this.stop(); // ֹͣ����
			} else if (actionName.equalsIgnoreCase("alarm")) { // �����alarm�ؼ���
				this.alarm(); // ���ȿ�ʼ����
			} else if (actionName.equalsIgnoreCase("engine boom")) { // �����engine boom�ؼ���
				this.engineBoom(); // ���濪ʼ����

			}
		}
	}

	// �Ѵ��ݹ�����ֵ���ݵ�����
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}