package DesignPattern24.cbf4life.abstactFactory.whiteHuman;

import com.cbf4life.abstactFactory.Human;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ɫ������
* Ϊ�˴������࣬�½�һ�����������ǰ����˵�������
*/
public abstract class AbstractWhiteHuman implements Human {
	public void cry() {
		System.out.println("��ɫ���ֻ��");
	}

	public void laugh() {
		System.out.println("��ɫ���ֻ��Ц�����Ե�Ц��");
	}

	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ�㶼�ǵ��ǵ��ֽڣ�");
	}
}
