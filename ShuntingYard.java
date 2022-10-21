package solutions;

/*
 * Diana proposed an algorithm for parsing complex mathematical expressionss 
 * pecified in an infix notation is one where an operator is present between 
 * two operandse.g.(2+5.This algorithm is also used in compiler creation in the parsing phase to 
 * generate abstract syntax treeand postfix notations.The algorithm also involves parsing expressions 
 * including parenthess and power operations.the algorithm is basically,stack based.

It is a simple example of shunting yard algorithm:

input:3+4 Add 3 to the output queue(whenever a number is read,it is add to the output).push ‘+’ onto the operator stack .Add 4 to the output queue.After readind the expression ,pop the operators off the stack and add them to the output. In these case,there only one operator,’+’.The resulting postfix notation is ‘34+’.

Your friend has requested you to help him in implementing this algorithm as he has to solve large mathmatical expressions given in infix notations

Note:the characters in the input are seperated by spaces

Ex :

i/p1:10+2*6

o/p:22
 */

import java.util.Stack;

public class ShuntingYard {

	public static void main(String[] args) {
	System.out.println(evaluate("10 + 2* 6"));
}
	static int evaluate(String expression) {
		
		char[] tokens=expression.toCharArray();
		Stack<Integer> values=new Stack<Integer>();
		Stack<Character> ops=new Stack<Character>();
		
		for(int i=0;i<tokens.length;i++) {
			 
			if(tokens[i]==' ') {
				continue;
			}
			
			if(tokens[i]>='0' && tokens[i]<='9') {
				StringBuffer sbuf=new StringBuffer();
				
				while(i<tokens.length && tokens[i]>='0' && tokens[i]<='9')
					sbuf.append(tokens[i++]);
				values.push(Integer.parseInt(sbuf.toString()));
				i--;
			}
			
			else if(tokens[i]=='(')
				ops.push(tokens[i]);
			
			else if(tokens[i]==')') {
				while(ops.peek()!='(')
					values.push(applyOp(ops.pop(),
							values.pop(),
							values.pop()));
				ops.pop();
			}
			else if(tokens[i]=='+' ||
					tokens[i]=='-' ||
					tokens[i]=='*' ||
					tokens[i]=='/' ) {
				while(!ops.empty() && hasPrecedence(tokens[i],ops.peek()))
					values.push(applyOp(ops.pop(),
							values.pop(),
							values.pop()));
				ops.push(tokens[i]);
			}
				
		}
		while(!ops.empty())
			values.push(applyOp(ops.pop(),
					values.pop(),
					values.pop()));
		return values.pop();
	}
	static boolean hasPrecedence(char op1,char op2) {
		if(op2=='(' || op2==')')
			return false;
		
		if((op1=='*' || op1=='/') && (op2=='+' || op2=='-'))
			return false;
		else 
			return true;
	}
	static int applyOp(char op,int b,int a) {
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if(b==0)
				throw new UnsupportedOperationException("cannot divide by zero");
			return a/b;
		}
		return 0;
	}

}
