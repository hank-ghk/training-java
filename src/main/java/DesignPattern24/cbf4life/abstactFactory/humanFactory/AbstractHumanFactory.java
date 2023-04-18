package DesignPattern24.cbf4life.abstactFactory.humanFactory;

import com.cbf4life.abstactFactory.Human;
import com.cbf4life.abstactFactory.HumanEnum;
import com.cbf4life.abstactFactory.HumanFactory;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��дһ�������࣬����enum����һ���������
*/
public abstract class AbstractHumanFactory implements HumanFactory {
	/*
	 * ����һ���Ա����֣�����һ���������רҵ�����ǲ�����Ʒ�ȼ�
	 */
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		// ������ݽ�������һ��Enum�о����һ��Element�Ļ����򲻴���
		if (!humanEnum.getValue().equals("")) {
			try {
				// ֱ�Ӳ���һ��ʵ��
				human = (Human) Class.forName(humanEnum.getValue())
						.newInstance();
			} catch (Exception e) {
				// ��Ϊʹ����enum��������쳣�����������ˣ��������enum�����⣻
				e.printStackTrace();
			}

		}
		return human;
	}
}