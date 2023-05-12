package DesignPattern24.cbf4life.interpreter2;

//import sun.org.mozilla.javascript.internal.Context;
import org.mozilla.javascript.Context;
public class NonterminalExpression extends Expression {
	// 每个非终结符表达式都会对其他表达式产生依赖
	public NonterminalExpression(Expression... expression) {
	}

	public Object interpreter(Context ctx) {
		// 进行文法处理
		return null;
	}
}
