package DesignPattern24.cbf4life.singleton1;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��������Ҫ����ʵۣ�������Ļʵۺ�����ģ�ǰ�첻һ���Ǿͳ������ˣ�
*/
@SuppressWarnings("all")
public class Minister {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��һ��
		Emperor emperor1 = Emperor.getInstance();
		emperor1.emperorInfo(); // ��һ����Ļʵ۽�ʲô�����أ�
		// �ڶ���
		Emperor emperor2 = Emperor.getInstance();
		Emperor.emperorInfo();
		// ������
		Emperor emperor3 = Emperor.getInstance();
		emperor2.emperorInfo();
		// ������Ļʵ۶���ͬһ���ˣ����Ұɣ�
	}
}