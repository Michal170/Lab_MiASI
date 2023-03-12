public class myVisitor extends arithmeticBaseVisitor<Integer>{
    @Override
    public Integer visitFile_(arithmeticParser.File_Context ctx) {
//        System.out.println("visitFile_: " + visit(ctx.equation(0)));
        return visit(ctx.expression(0));

//        return super.visitFile_(ctx);
    }

//    @Override
//    public Integer visitEquation(arithmeticParser.EquationContext ctx) {
////        System.out.println("visitEqation_0: " + visit(ctx.expression(0)));
////        System.out.println("visitEqation_1: " + visit(ctx.expression(1)));
//
////        if (visit(ctx.expression(0)) == visit(ctx.expression(1))) {
////            boolean result = true;
////            return result.compare(result, true);
////
////        }
//        return visit(ctx.expression(0));
//    }

    @Override
    public Integer visitPlus_min(arithmeticParser.Plus_minContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()){
            case arithmeticLexer.PLUS -> {
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
//        System.out.println("Pierwszy: " + visit(ctx.expression(0)) + " Drugi: " + visit(ctx.expression(1)));
        for (int i = 0; i < visit(ctx.expression(1)); i++) {
            result = result * visit(ctx.expression(0));
//            System.out.println("Rezultat cząstkowy " + i + ": " + result);
            
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
    public Integer visitAtom(arithmeticParser.AtomContext ctx) {
        return super.visitAtom(ctx);
    }

    @Override
    public Integer visitScientific(arithmeticParser.ScientificContext ctx) {
//        System.out.println("Scientifi number: " + Integer.parseInt(ctx.SCIENTIFIC_NUMBER().getText()));
        return Integer.parseInt(ctx.SCIENTIFIC_NUMBER().getText());
//        return super.visitScientific(ctx);
    }

    @Override
    public Integer visitVariable(arithmeticParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Integer visitRelop(arithmeticParser.RelopContext ctx) {
        return super.visitRelop(ctx);
    }
}