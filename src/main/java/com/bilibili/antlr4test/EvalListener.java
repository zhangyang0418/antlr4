package com.bilibili.antlr4test;

import com.bilibili.antlr4.CalcBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * @author zhangyang
 * @Date:2018/3/28
 * @Time:上午10:27
 */
public class EvalListener extends CalcBaseListener {

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enter:" + ctx.getRuleContext());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exit:" + ctx.getRuleContext());
    }

}
