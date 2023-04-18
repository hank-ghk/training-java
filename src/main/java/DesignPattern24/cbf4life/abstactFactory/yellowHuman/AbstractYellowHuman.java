package DesignPattern24.cbf4life.abstactFactory.yellowHuman;

import com.cbf4life.abstactFactory.Human;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ΪʲôҪ�޸ĳɳ������أ�Ҫ�����Ա�ѽ
*/
public abstract class AbstractYellowHuman implements Human {
	public void cry() {
		System.out.println("��ɫ���ֻ��");
	}

	public void laugh() {
		System.out.println("��ɫ���ֻ��Ц���Ҹ�ѽ��");
	}

	public void talk() {

		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ���˫�ֽ�");
	}
}
