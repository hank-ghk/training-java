package DesignPattern24.cbf4life.abstactFactory.humanFactory;

import com.cbf4life.abstactFactory.Human;
import com.cbf4life.abstactFactory.HumanEnum;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.\
* Ů�Դ�������
*/
public class FemaleHumanFactory extends AbstractHumanFactory {
	// ����һ��Ů�Ժ�����
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

	// ����һ��Ů�԰�����
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

	// ����һ��Ů�Ի�����
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YelloFemaleHuman);
	}
}