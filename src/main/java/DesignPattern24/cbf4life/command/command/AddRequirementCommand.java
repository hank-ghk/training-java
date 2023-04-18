package DesignPattern24.cbf4life.command.command;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����һ������
*/
public class AddRequirementCommand extends Command {
	// ִ������һ�����������
	public void execute() {
		// �ҵ�������
		super.rg.find();
		// ����һ������
		super.rg.add();
		// ҳ��ҲҪ����
		super.pg.add();
		// ����ҲҪ����
		super.cg.add();
		// �����ƻ�
		super.rg.plan();
	}
}