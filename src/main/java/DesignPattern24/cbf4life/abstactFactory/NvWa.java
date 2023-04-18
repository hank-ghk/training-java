package DesignPattern24.cbf4life.abstactFactory;

import com.cbf4life.abstactFactory.humanFactory.FemaleHumanFactory;
import com.cbf4life.abstactFactory.humanFactory.MaleHumanFactory;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* Ů洽����������������ߣ��ֱ��ǣ�
* ����������
* Ů��������
*/
public class NvWa {
	public static void main(String[] args) {
		// ��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		// �ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		// �����߽�����ϣ���ʼ��������:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		maleYellowHuman.cry();
		maleYellowHuman.laugh();
		maleYellowHuman.sex();
		femaleYellowHuman.sex();
		/*
		 * ..... �������������
		 */
	}
}