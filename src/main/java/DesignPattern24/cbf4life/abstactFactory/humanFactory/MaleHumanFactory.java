package DesignPattern24.cbf4life.abstactFactory.humanFactory;

import com.cbf4life.abstactFactory.Human;
import com.cbf4life.abstactFactory.HumanEnum;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ���Դ�������
*/
public class MaleHumanFactory extends AbstractHumanFactory {
	// ����һ�����Ժ�����
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	// ����һ�����԰�����
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	// ����һ�����Ի�����
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YelloMaleHuman);
	}
}
