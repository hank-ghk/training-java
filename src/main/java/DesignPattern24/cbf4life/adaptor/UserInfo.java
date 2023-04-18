package DesignPattern24.cbf4life.adaptor;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
*/
public class UserInfo implements IUserInfo {
	/*
	 * ��ü�ͥ��ַ����������Ҳ�����ҵ��ط�
	 */
	public String getHomeAddress() {
		System.out.println("������Ա���ļ�ͥ��ַ....");
		return null;
	}

	/*
	 * ��ü�ͥ�绰����
	 */
	public String getHomeTelNumber() {
		System.out.println("Ա���ļ�ͥ�绰��....");
		return null;
	}

	/*
	 * Ա����ְλ���ǲ��ž�����С��
	 */
	public String getJobPosition() {
		System.out.println("����˵�ְλ��BOSS....");
		return null;
	}

	/*
	 * �ֻ�����
	 */
	public String getMobileNumber() {
		System.out.println("����˵��ֻ�������0000....");
		return null;
	}

	/*
	 * �칫�ҵ绰�������ʱ����á���С�ġ��ѵ绰���ߵ����Ҿ�����ô�ɣ��Լ����˶��кô�
	 */
	public String getOfficeTelNumber() {
		System.out.println("�칫�ҵ绰��....");
		return null;
	}

	/*
	 * �����ˣ��������Ҫ��
	 */
	public String getUserName() {
		System.out.println("��������...");
		return null;

	}
}
