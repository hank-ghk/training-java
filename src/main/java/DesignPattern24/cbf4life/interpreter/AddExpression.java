package DesignPattern24.cbf4life.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {
	public AddExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	// �������������ʽ����Ľ��������
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}