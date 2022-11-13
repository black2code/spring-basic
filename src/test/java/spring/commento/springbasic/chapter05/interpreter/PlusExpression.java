package spring.commento.springbasic.chapter05.interpreter;

import java.util.Map;

public class PlusExpression implements PostfixExpression{

    private PostfixExpression left, right;

    public PlusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context)+ right.interpret(context);
    }
}