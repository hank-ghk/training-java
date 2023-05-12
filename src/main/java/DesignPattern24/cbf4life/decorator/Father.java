package DesignPattern24.cbf4life.decorator;

/**
* @author cbf4Life cbf4life@126.com
* I'm glad to share my knowledge with you all.
* 老爸看成绩单了
*/
public class Father {
	public static void main(String[] args) {
		// 成绩单拿过来
		SchoolReport sr = new FouthGradeSchoolReport();
		// 看成绩单
		sr.report();
		// 签名？休想！
		
		
		//美化过的成绩单拿过来
		SchoolReport srd= new SugarFouthGradeSchoolReport();
		//看成绩单
		srd.report();
		//然后老爸，一看，很开心，就签名了
		srd.sign("老三");//我叫小三，老爸当然叫老三
	}
}
