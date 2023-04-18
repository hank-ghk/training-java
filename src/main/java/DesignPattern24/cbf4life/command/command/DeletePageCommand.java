package DesignPattern24.cbf4life.command.command;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ɾ��һ��ҳ�������
*/
public class DeletePageCommand extends Command {
	// ִ��ɾ��һ��ҳ�������
	public void execute() {
		// �ҵ�ҳ����
		super.pg.find();
		// ɾ��һ��ҳ��
		super.rg.delete();
		// �����ƻ�
		super.rg.plan();
	}
}