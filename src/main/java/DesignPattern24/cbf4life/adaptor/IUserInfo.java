package DesignPattern24.cbf4life.adaptor;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* �û���Ϣ����
*/
public interface IUserInfo {
	// ����û�����
	public String getUserName();

	// ��ü�ͥ��ַ
	public String getHomeAddress();

	// �ֻ����룬���̫��Ҫ���ֻ�����ѽ
	public String getMobileNumber();

	// �칫�绰��һ��ʽ����
	public String getOfficeTelNumber();

	// ����˵�ְλ��ɶ
	public String getJobPosition();

	// ��ü�ͥ�绰������е�ȱ�£����ǲ�ϲ�����ͥ�绰���۹���
	public String getHomeTelNumber();
}