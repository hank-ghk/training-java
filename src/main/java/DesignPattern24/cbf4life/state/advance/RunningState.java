package DesignPattern24.cbf4life.state.advance;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����������״̬��������Щ����
*/
public class RunningState extends LiftState {
	// �����Źرգ����ǿ϶���
	@Override
	public void close() {
		// do nothing
	}

	// ���е�ʱ�򿪵����ţ�����ˣ����ݲ�����㿪��
	@Override
	public void open() {
		// do nothing
	}

	// ����������״̬��Ҫʵ�ֵķ���
	@Override
	public void run() {
		System.out.println("����������...");
	}

	// ����¾����Ǻ���ģ������в�ֹͣ����˭����������ݣ�������ֻ���ϵ���
	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState); // ��������Ϊֹͣ״̬��
		super.context.getLiftState().stop();
	}
}
