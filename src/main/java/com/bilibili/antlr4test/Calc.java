package com.bilibili.antlr4test;

import com.bilibili.antlr4.CalcLexer;
import com.bilibili.antlr4.CalcParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * @author zhangyang
 * @Date:2018/3/27
 * @Time:下午4:04
 */
public class Calc {

    public static void main(String[] args) {
        ANTLRInputStream inputStream = new ANTLRInputStream("a=9 b=2 c=a^b*(1+2) print(c)");
        CalcLexer lexer = new CalcLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

    }
}
