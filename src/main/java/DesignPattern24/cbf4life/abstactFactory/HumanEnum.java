package DesignPattern24.cbf4life.abstactFactory;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ����������Щ���͵��ˣ��г���
* JDK 1.5��ʼ����enum����Ҳ��Ŀ�ĵģ�����C����Աת����
*/
public enum HumanEnum {
	// �����������������Ͷ��������
	YelloMaleHuman("com.cbf4life.abstactFactory.yellowHuman.YellowMaleHuman"),
	YelloFemaleHuman("com.cbf4life.abstactFactory.yellowHuman.YellowFemaleHuman"),
	WhiteFemaleHuman("com.cbf4life.abstactFactory.whiteHuman.WhiteFemaleHuman"), 
	WhiteMaleHuman("com.cbf4life.abstactFactory.whiteHuman.WhiteMaleHuman"), 
	BlackFemaleHuman("com.cbf4life.abstactFactory.blackHuman.BlackFemaleHuman"),
	BlackMaleHuman("com.cbf4life.abstactFactory.blackHuman.BlackMaleHuman");

	private String value = "";

	// ���幹�캯����Ŀ����Data(value)���͵���ƥ��
	private HumanEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
	/*
	 * java enum���;�����ʹ�ã�������Ҫʹ�ö�̬���̳еȷ��� �Ͼ���Clas��ȫ���Դ���enum
	 */
}
