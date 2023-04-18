package DesignPattern24.cbf4life.command;

import com.cbf4life.command.command.AddRequirementCommand;
import com.cbf4life.command.command.Command;
import com.cbf4life.command.invoker.Invoker;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �ͻ����Ǽ׷���������Ǯ��һ�������ϴ�
*/
public class Client {
	public static void main(String[] args) {
		// ���ȿͻ��ҵ�������˵������̸���󣬲��޸�
		System.out.println("-------------�ͻ�Ҫ������һ������-----------------");
		Group rg = new RequirementGroup();
		// �ҵ�������
		rg.find();
		// ����һ������
		rg.add();
		// Ҫ�����ƻ�
		rg.plan();

		// �������ǵĽ�ͷ��
		Invoker xiaoSan = new Invoker(); // ��ͷ�˾�����С��
		// �ͻ�Ҫ������һ������
		System.out.println("-------------�ͻ�Ҫ������һ������-----------------");
		// �ͻ���������������
		Command command = new AddRequirementCommand();
		// Command command = new DeletePageCommand();
		// ��ͷ�˽��յ�����
		xiaoSan.setCommand(command);
		// ��ͷ��ִ������
		xiaoSan.action();
	}
}