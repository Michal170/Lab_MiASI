import java.util.HashMap;
import java.util.Map;

public class myVisitor extends arithmeticBaseVisitor<Integer>{

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(arithmeticParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expression());
//        System.out.println("visitAssign value: " + value + " id: " + id);
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitId(arithmeticParser.IdContext ctx) {
        String id = ctx.ID().getText();
        return memory.get(id);
    }

    @Override
    public Integer visitParen(arithmeticParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Integer visitInt(arithmeticParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitPrintExpr(arithmeticParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expression());
        System.out.println("Wynik: " + value);
        return value;
    }


    @Override
    public Integer visitPlus_min(arithmeticParser.Plus_minContext ctx) {
        Integer result = 0;
//        System.out.println("VisitPlus");
        switch (ctx.op.getType()){
            case arithmeticLexer.PLUS -> {
                System.out.println(visit(ctx.expression(0)));
                result = visit(ctx.expression(0)) + visit(ctx.expression(1));
            }
            case arithmeticLexer.MINUS -> {
                result = visit(ctx.expression(0)) - visit(ctx.expression(1));
            }
        }
        return result;
    }

    @Override
    public Integer visitPow(arithmeticParser.PowContext ctx) {
        Integer result = 1;
        for (int i = 0; i < visit(ctx.expression(1)); i++) {
            result = result * visit(ctx.expression(0));

        }
        return result;
    }

    @Override
    public Integer visitMul_div(arithmeticParser.Mul_divContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()){
            case arithmeticLexer.TIMES -> {
                result = visit(ctx.expression(0)) * visit(ctx.expression(1));
            }
            case arithmeticLexer.DIV -> {
                result = visit(ctx.expression(0)) / visit(ctx.expression(1));
            }
        }
        return result;
    }


    @Override
    public Integer visitRelop(arithmeticParser.RelopContext ctx) {
        return super.visitRelop(ctx);
    }
}