import java.awt.print.PrinterException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class myVisitor extends calcBaseVisitor<Integer>{

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(calcParser.AssignContext ctx) {
        //System.out.println("ID: " + ctx.VARIABLE().getText());
        String id = ctx.VARIABLE().getText();
//        Integer value = Integer.parseInt(ctx.expression().getText());
        Integer value = visit(ctx.expression());
        memory.put(id, value);
        return value;
    }

    /*
    @Override
    public Integer visitId(calcParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        return 0;
    }
    */

    @Override
    public Integer visitComparision(calcParser.ComparisionContext ctx) {
        Integer result = 0;
//        System.out.println("CTX:" + ctx + "ctx_expr_0: " + ctx.expression(0).getText() + "ctx_expr_1: " + ctx.expression(1).getText());
        switch (visit(ctx.relop())) {
            case 0:
                if (visit(ctx.expression(0))==visit(ctx.expression(1))) {
                    result = 1;
                } else {
                    result = 0;
                }
                break;
            case 1:
                if (visit(ctx.expression(0))>visit(ctx.expression(1))) {
                    result = 1;
                } else {
                    result = 0;
                }
                break;
            case 2:
                if (visit(ctx.expression(0))<visit(ctx.expression(1))) {
                    result = 1;
                } else {
                    result = 0;
                }
                break;
        }
        return result;
    }

    @Override
    public Integer visitPlus(calcParser.PlusContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()){
            case calcLexer.PLUS -> {
//                System.out.println(visit(ctx.expression(0)));
                result = visit(ctx.expression(0))+visit(ctx.expression(1));
            }
            case calcLexer.MINUS -> {
                result = visit(ctx.expression(0))-visit(ctx.expression(1));
            }
        }
        return result;
    }

    @Override
    public Integer visitMul(calcParser.MulContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()){
            case calcLexer.TIMES -> {
                result = visit(ctx.expression(0)) * visit(ctx.expression(1));
            }
            case calcLexer.DIV -> {
                result = visit(ctx.expression(0)) / visit(ctx.expression(1));
            }
        }
        return result;
    }

    @Override
    public Integer visitIf(calcParser.IfContext ctx) {
        Integer result = 0;
        if (visit(ctx.cond)==1) {
            result = visit(ctx.then);
        } else {
            if (ctx.else_ != null ) {
                result =  visit(ctx.else_);
            }
        }
        return  result;
    }

    @Override
    public Integer visitNawias(calcParser.NawiasContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Integer visitWhile(calcParser.WhileContext ctx) {
        Integer result = 0;
        while(visit(ctx.cond)==1){
            result = visit(ctx.then);
            result -= 1;
            visitWhile(ctx);
        }
        return  result;
        //return super.visitWhile(ctx);
    }
//    @Override
//    public Integer visitWhile(calcParser.WhileContext ctx) {
//        // Evaluate the relational expression and continue the while
//        // loop as long as it is true (does not equal zero).
//        Integer result = 0;
//        System.out.println("wartość_warunku: " + this.visit(ctx.cond));
//        System.out.println("wartość_expressiona: " + visit(ctx.then));
//
////        while (this.visit(ctx.cond) != 0) {
////            if (this.visit(ctx.cond) != 0) {
////            System.out.println("While != 0");
//////            result = memory.get(ctx.expression().getText());
////            result = visit(ctx.then);
////            System.out.println("Result: " + result);
////            // Evaluate all statements inside the while loop.
//////            for (calcParser.StatContext stat : visit(ctx.stat())) {
//////                this.visit(stat);
//////            }
////        }
//        if (this.visit(ctx.cond) != 0) {
//            System.out.println("While != 0");
////            result = memory.get(ctx.expression().getText());
//            result = visit(ctx.then);
//            System.out.println("Result: " + result);
//            visitWhile_stat(ctx.);
//            // Evaluate all statements inside the while loop.
////            for (calcParser.StatContext stat : visit(ctx.stat())) {
////                this.visit(stat);
////            }
//        }
//
//        // 0 now also is false, so maybe return null instead which would be
//        // some sort of VOID value (or make a proper Value class).
//
//
//    return 0;
//    }
//
//    @Override
//    public Integer visitWhile_stat(calcParser.While_statContext ctx) {
//        System.out.println("While_statment: " + visit(ctx.stat()));
//        return super.visitWhile_stat(ctx);
//    }
//    //        Integer result = 0;
////        System.out.println("while_warunek: " + visit(ctx.cond));
////        result = visitComparision(new calcParser.ComparisionContext())
//////        while (visit(ctx.cond)==1){
//////
//////        }
//////        if(visit(ctx.cond)==1){
//////            while(visit(ctx.cond)==1){
//////            result = visit(ctx.then);
//////        }
//////        }
//////        else {
//////
////        result = 0;
//////            System.out.println("Else");
//////        }
////        return result;




//        while(visit(ctx.cond)==1){
//            result = visit(ctx.then);
////            result -= 1;
//        }
//        return  result;
//        //return super.visitWhile(ctx);
//    }

    @Override
    public Integer visitExpression_stat(calcParser.Expression_statContext ctx) {
        Integer value = visit(ctx.expression());
        System.out.println("WYNIK: " + value);
        return value;
    }

    /*
    @Override
    public Integer visitInt(calcParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
    */

    @Override
    public Integer visitRelop(calcParser.RelopContext ctx) {
        Integer result = null;

        if (ctx.EQ() != null)  result = 0;
        if (ctx.GT() != null ) result = 1;
        if (ctx.LT() != null ) result = 2;
        return result;
        //return super.visitRelop(ctx);
    }

    @Override
    public Integer visitStala(calcParser.StalaContext ctx) {
        Integer result = 0;
        if (memory.keySet().contains(ctx.atom().getText())) {
            result = memory.get(ctx.atom().getText());
        } else
            result = Integer.parseInt(ctx.atom().getText());
        return result;
    }

    @Override
    public Integer visitAtom(calcParser.AtomContext ctx) {

        return super.visitAtom(ctx);
    }

    @Override
    public Integer visitScientific(calcParser.ScientificContext ctx) {
        return Integer.parseInt(ctx.SCIENTIFIC_NUMBER().getText());
    }

    @Override
    public Integer visitPow(calcParser.PowContext ctx) {
        Integer result = 1;
        for (int i = 0; i < visit(ctx.expression(1)); i++) {
            result = result * visit(ctx.expression(0));

        }
        return result;
    }
}