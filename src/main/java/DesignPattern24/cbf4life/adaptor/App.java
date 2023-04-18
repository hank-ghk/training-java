package DesignPattern24.cbf4life.adaptor;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��������Ǿ����Ӧ���ˣ������ϰ�Ҫ�����е�20-30��Ů����Ϣ
*/
public class App {
	public static void main(String[] args) {
//		// û������ϵͳ���ӵ�ʱ��������д��
//		IUserInfo youngGirl = new UserInfo();
//		// �����ݿ��в鵽101��
//		for (int i = 0; i < 101; i++) {
//			youngGirl.getMobileNumber();
//		}
		
		//�ϰ�һ�벻��ѽ�����Ӳ����ѱ߲ݣ�������������Դ��Ա���õ�
		IUserInfo youngGirl = new OuterUserInfo(); //����ֻ�޸�����һ���
		//�����ݿ��в鵽101��
		for(int i=0;i<101;i++){
		youngGirl.getMobileNumber();
		}
		
		
	}
}
