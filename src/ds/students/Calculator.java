package ds.students;

import ds.students.Token.Type;

public class Calculator {

	public DSQueue infixToPostfix(DSQueue infix) {
		DSQueue infixQueue = new DSQueue();
		while (!infix.isEmpty()) {
			Token token = infix.poll();
			if (!token.equals('/') && !token.equals('*') && !token.equals('+') && !token.equals('-')) {
				infixQueue.offer(token);

			} else {

			}
		}
	}

	public double evaluatePostfix(DSQueue exp) {
		DSStack stack = new DSStack();
		while (!(exp.isEmpty())) {
			Token token = exp.poll();
			if (token.equals('/') || token.equals('*') || token.equals('+') || token.equals('-')) {
				stack.push(token);
			} else {
				Token temp = stack.pop();
				Token temp2 = stack.pop();
				if (token.equals('/')) {
					stack.push(new Token(temp.getOperand() / temp2.getOperand()));

				} else if (token.equals('+')) {
					stack.push(new Token(temp.getOperand() + temp2.getOperand()));

				} else if (token.equals('-')) {
					stack.push(new Token(temp.getOperand() - temp2.getOperand()));

				}
				else if (token.equals('*')) {
					stack.push(new Token(temp.getOperand() * temp2.getOperand()));

				}
				
			}

		}
		if (stack.size()==1){
			return stack.pop().getOperand();
		}
		return -99999; //error in the inputs
	}
}
