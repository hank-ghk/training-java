package DesignPattern24.cbf4life.adaptor;

import java.util.HashMap;
import java.util.Map;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ϵͳ���û���Ϣ��ʵ����
*/
@SuppressWarnings("all")
public class OuterUser implements IOuterUser {
	/*
	 * �û��Ļ�����Ϣ
	 */
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "���Ա���л���ħ��....");
		baseInfoMap.put("mobileNumber", "���Ա���绰��....");

		return baseInfoMap;
	}

	/*
	 * Ա���ļ�ͥ��Ϣ
	 */
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰��....");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��....");
		return homeInfo;
	}

	/*
	 * Ա���Ĺ�����Ϣ������ְλ�˵�
	 */
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "����˵�ְλ��BOSS...");
		officeInfo.put("officeTelNumber", "Ա���İ칫�绰��....");
		return officeInfo;
	}
}