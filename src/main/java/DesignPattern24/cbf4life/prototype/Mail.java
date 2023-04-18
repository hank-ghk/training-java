package DesignPattern24.cbf4life.prototype;

public class Mail {
	// �ռ���
	private String receiver;
	// �ʼ�����
	private String subject;
	// ��ν
	private String appellation;
	// �ʼ�����
	private String contxt;
	// �ʼ���β����һ�㶼�Ǽ��ϡ�XXX��Ȩ���С�����Ϣ
	private String tail;

	// ���캯��
	public Mail(AdvTemplate advTemplate) {
		this.contxt = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}

	// ����Ϊgetter/setter����
	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
}