package DesignPattern24.cbf4life.state.common2;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���ݵ�ʵ����
*/
public class Lift implements ILift {
	private int state;

	public void setState(int state) {
		this.state = state;
	}

	// �����Źر�
	public void close() {
		// ������ʲô״̬�²��ܹر�
		switch (this.state) {
		case OPENING_STATE: // ���������Թ��ţ�ͬʱ�޸ĵ���״̬
			this.closeWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case CLOSING_STATE: // ������ݾ��ǹ���״̬����ʲô������
			// do nothing;
			break;
		case RUNNING_STATE: // ������������У��ű������ǹرյģ�Ҳ˵��������
			// do nothing;
			break;
		case STOPPING_STATE: // �����ֹͣ״̬����Ҳ�ǹرյģ�ʲôҲ����
			// do nothing;
			break;
		}
	}

	// �����ſ���
	public void open() {
		// ������ʲô״̬���ܿ���
		switch (this.state) {
		case OPENING_STATE: // ����Ѿ����ų�״̬����ʲô������
			// do nothing;
			break;
		case CLOSING_STATE: // ���ǵ���ʱ�ر�״̬������Կ���
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		case RUNNING_STATE: // ��������״̬�����ܿ��ţ�ʲô������
			// do nothing;
			break;
		case STOPPING_STATE: // ֹͣ״̬����ȻҪ������
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		}
	}

	// ���ݿ�ʼ������

	public void run() {
		switch (this.state) {
		case OPENING_STATE: // ����Ѿ����ų�״̬�����������У�ʲô������
			// do nothing;
			break;
		case CLOSING_STATE: // ���ǵ���ʱ�ر�״̬�����������
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;
		case RUNNING_STATE: // ��������״̬����ʲô������
			// do nothing;
			break;
		case STOPPING_STATE: // ֹͣ״̬����������
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
		}
	}

	// ����ֹͣ
	public void stop() {
		switch (this.state) {
		case OPENING_STATE: // ����Ѿ����ų�״̬���ǿ϶�Ҫ��ͣ�����ģ�ʲô������
			// do nothing;
			break;
		case CLOSING_STATE: // ���ǵ���ʱ�ر�״̬����Ȼ����ֹͣ��
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case RUNNING_STATE: // ��������״̬�������е�Ȼ��Ҳ����ֹͣ��
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case STOPPING_STATE: // ֹͣ״̬��ʲô������
			// do nothing;
			break;
		}
	}

	// ����ĵ��ݹ��ţ�������ʵ�ʵ��߼�
	private void closeWithoutLogic() {
		System.out.println("�����Źر�...");
	}

	// ����ĵ��ſ����������κ�����

	private void openWithoutLogic() {
		System.out.println("�����ſ���...");
	}

	// ��������У���������������
	private void runWithoutLogic() {
		System.out.println("��������������...");
	}

	// ������ֹͣ����������������
	private void stopWithoutLogic() {
		System.out.println("����ֹͣ��...");
	}
}
