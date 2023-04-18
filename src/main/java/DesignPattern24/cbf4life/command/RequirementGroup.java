package DesignPattern24.cbf4life.command;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �������ְ���ǺͿͻ�̸��������������Ӧ�ö���ҵ������ר��
*/
public class RequirementGroup extends Group {
	// �ͻ�Ҫ���������ȥ������̸
	public void find() {
		System.out.println("�ҵ�������...");
	}

	// �ͻ�Ҫ������һ������
	public void add() {
		System.out.println("�ͻ�Ҫ������һ������...");
	}

	// �ͻ�Ҫ���޸�һ������
	public void change() {
		System.out.println("�ͻ�Ҫ���޸�һ������...");
	}

	// �ͻ�Ҫ��ɾ��һ������
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ������...");
	}

	// �ͻ�Ҫ�������ƻ�
	public void plan() {
		System.out.println("�ͻ�Ҫ���������ƻ�...");
	}
}
