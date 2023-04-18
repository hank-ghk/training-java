package DesignPattern24.cbf4life.state.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ڵ����ſ�����״̬������ʲô����
*/
public class OpenningState extends LiftState {
	// ������Ȼ���Թر��ˣ��Ҿ������һ�µ����ſ��ع���
	@Override
	public void close() {
		// ״̬�޸�
		super.context.setLiftState(Context.closeingState);
		// ����ί��ΪCloseState��ִ��
		super.context.getLiftState().close();
	}

	// �򿪵�����
	@Override
	public void open() {
		System.out.println("�����ſ���...");
	}

	// �ſ��ŵ��ݾ����ܣ�����ݣ������㣡
	@Override
	public void run() {

		// do nothing;
	}

	// ���Ż���ֹͣ��
	public void stop() {
		// do nothing;
	}
}
