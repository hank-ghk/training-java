package DesignPattern24.cbf4life.state.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �����Źر��Ժ󣬵��ݿ�������Щ����
*/
public class ClosingState extends LiftState {
	// �����Źرգ����ǹر�״̬Ҫʵ�ֵĶ���
	@Override
	public void close() {
		System.out.println("�����Źر�...");
	}

	// �����Ź����ٴ򿪣��������أ����������ѽ
	@Override
	public void open() {
		super.context.setLiftState(Context.openningState); // ��Ϊ�ų�״̬
		super.context.getLiftState().open();

	}

	// �����Ź��˾��ܣ�����������������
	@Override
	public void run() {
		super.context.setLiftState(Context.runningState); // ����Ϊ����״̬��
		super.context.getLiftState().run();
	}

	// �����Ź��ţ��ҾͲ���¥��
	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState); // ����Ϊֹͣ״̬��
		super.context.getLiftState().stop();
	}
}