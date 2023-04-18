package DesignPattern24.cbf4life.abstactFactory.blackHuman;

import com.cbf4life.abstactFactory.Human;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ɫ���֣��ǵ���ѧѧӢ���ʦ˵black man�������˵���˼��������û������˵��
*/
public abstract class AbstractBlackHuman implements Human {
	public void cry() {
		System.out.println("���˻��");
	}

	public void laugh() {
		System.out.println("���˻�Ц");
	}

	public void talk() {
		System.out.println("���˿���˵����һ����������");
	}
}
