package DesignPattern24.cbf4life.adaptor;
import java.util.Map;
/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* ��ϵͳ����Ա��Ϣ
*/
@SuppressWarnings("all")
public interface IOuterUser {
	// ������Ϣ���������ƣ��Ա��ֻ������˵�
	public Map getUserBaseInfo();

	// ����������Ϣ
	public Map getUserOfficeInfo();

	// �û��ļ�ͥ��Ϣ
	public Map getUserHomeInfo();
}