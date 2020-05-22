package compiler;

import compiler.grammar.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visitor extends mathlangBaseVisitor<String> {
    public ContextMemory contextMemory = new ContextMemory();

    @Override
    public String visitMath(mathlangParser.MathContext ctx) {
        String buffer = "";
        buffer += "public class Main {\n";
        List<mathlangParser.CreateContext> createContextList = ctx.create();
        for (mathlangParser.CreateContext aCreateContextList : createContextList) {
            buffer += "\tstatic " + this.visit(aCreateContextList);
            buffer += "\n";
        }

        if (createContextList.size() > 0) buffer += "\n";

        List<mathlangParser.FunctionContext> functionContextList = ctx.function();
        for (mathlangParser.FunctionContext aFunctionContextList : functionContextList) {
            buffer += this.visit(aFunctionContextList);
            buffer += "\n";
        }
        buffer += this.visit(ctx.main());
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(mathlangParser.MainContext ctx) {
        contextMemory.clearLocals();
        return "\tpublic static void main() throws Exception {\n" +
                this.visit(ctx.start()) +
                "\t}\n";
    }

    @Override
    public String visitStart(mathlangParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++) {
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }


    @Override
    public String visitCreate_int(mathlangParser.Create_intContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (contextMemory.isNotLocal(name)) {
            contextMemory.addVariable(ctx, name, VariableType.INTEGER);
            newVariable = VariableType.INTEGER.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_int(mathlangParser.Create_const_intContext ctx) {
        String newInt = visit(ctx.create_int());
        return "final " + newInt;
    }

    @Override
    public String visitCreate_float(mathlangParser.Create_floatContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (contextMemory.isNotLocal(name)) {
            contextMemory.addVariable(ctx, name, VariableType.FLOAT);
            newVariable = VariableType.FLOAT.toString() + " ";
        }
        String nameObject = visit(ctx.expr());
        return newVariable + name + " = " + nameObject + ";";
    }

    @Override
    public String visitCreate_const_float(mathlangParser.Create_const_floatContext ctx) {
        String newfloat = visit(ctx.create_float());
        return "final " + newfloat;
    }

    @Override
    public String visitForCond(mathlangParser.ForCondContext ctx) {
        String leftArg = ctx.ID(0).getText();
        String rightArg = ctx.ID(1).getText();
        String expression = visit(ctx.expr());
        String condition = visit(ctx.condition());

        switch (ctx.oper.getType()) {
            case mathlangParser.INCR:
                return leftArg + " = " + expression + "; " + condition + "; " + rightArg + "++";
            case mathlangParser.DECR:
                return leftArg + " = " + expression + "; " + condition + "; " + rightArg + "--";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.oper.getText());
        }
    }

    @Override
    public String visitNameObjectInt(mathlangParser.NameObjectIntContext ctx) {
        return ctx.INT().getText();
    }

    public String visitNameObjectFloat(mathlangParser.NameObjectFloatContext ctx) {
        return ctx.FLOAT().getText();
    }

    @Override
    public String visitPrint(mathlangParser.PrintContext ctx) {
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }

    @Override
    public String visitPrintId(mathlangParser.PrintIdContext ctx) {
        String name = ctx.ID().toString();

        try {
            contextMemory.isVariableExists(name);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return name;
    }

    @Override
    public String visitPrintInt(mathlangParser.PrintIntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitPrintFloat(mathlangParser.PrintFloatContext ctx) {
        return ctx.FLOAT().getText();
    }


    @Override
    public String visitStat_block(mathlangParser.Stat_blockContext ctx) {
        Map<String, VariableType> beforeStatBlock = new HashMap(contextMemory.locals);
        String block = "{\n" + this.visit(ctx.start()) + "}";
        contextMemory.locals = beforeStatBlock;
        return block;
    }


    @Override
    public String visitIf_stat(mathlangParser.If_statContext ctx) {
        String buffer = "";
        List<mathlangParser.Condition_blockContext> conditions = ctx.condition_block();
        for (int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation = "";
            if (conditions.get(index).NEGATION() != null) {
                negation = "!";
            }
            buffer += "if (" + negation + conditionString + ")";
            buffer += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()) {
                buffer += " else ";
            }
        }
        if (ctx.stat_block() != null) {
            buffer += " else " + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override
    public String visitCondition_block(mathlangParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(mathlangParser.EqualityExprContext ctx) {
        String left = ctx.ID().getText();
        String right = visit(ctx.expr());
        switch (ctx.op.getType()) {
            case mathlangParser.EQ:
                return left + " == " + right;
            case mathlangParser.NEQ:
                return left + " != " + right;
            case mathlangParser.OANGLEBR:
                return left + " < " + right;
            case mathlangParser.CANGLEBR:
                return left + " > " + right;
            case mathlangParser.EQOANGLEBR:
                return left + " <= " + right;
            case mathlangParser.EQCANGLEBR:
                return left + " >= " + right;
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override
    public String visitCheckType(mathlangParser.CheckTypeContext ctx) {
        String left = ctx.ID().getText();

        try {
            contextMemory.isVariableExists(left);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        String right = ctx.type().getText();
        return left + ".getClass().getSimpleName().equals(\"" + right + "\")";
    }

    @Override
    public String visitWhile_stat(mathlangParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }


    @Override
    public String visitFor_stat(mathlangParser.For_statContext ctx) {
        String cond = visit(ctx.condition_for());
        return "for (" + cond + ")" + this.visit(ctx.stat_block());
    }


    @Override
    public String visitVoidFunction(mathlangParser.VoidFunctionContext ctx) {
        contextMemory.clearLocals();
        String name = ctx.ID().getText();
        contextMemory.addFunction(name, VariableType.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitReturnFunction(mathlangParser.ReturnFunctionContext ctx) {
        contextMemory.clearLocals();
        var name = ctx.ID().getText();
        var returnType = VariableType.getTypeByString(ctx.type().getText());

        contextMemory.addFunction(name, returnType);
        return "private static " + returnType.toString() + " " + name +
                this.visit(ctx.param()) +
                this.visit(ctx.stat_block_with_return());
    }


    @Override
    public String visitStat_block_with_return(mathlangParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) + "}";
    }

    @Override
    public String visitReturn_id(mathlangParser.Return_idContext ctx) {
        String id = ctx.ID().getText();

        try {
            contextMemory.isVariableExists(id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        mathlangParser.ReturnFunctionContext context =
                (mathlangParser.ReturnFunctionContext) ctx.getParent().getParent();
        var type = context.type().getText();

        try {
            contextMemory.isCastValid(id, VariableType.getTypeByString(type));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return "return " + id + ";\n";
    }

    @Override
    public String visitFunction_call(mathlangParser.Function_callContext ctx) {
        String name = ctx.ID().getText();

        try {
            contextMemory.isFunctionExists(name);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return name + this.visit(ctx.param_call());
    }

    @Override
    public String visitCall(mathlangParser.CallContext ctx) {
        String name = ctx.ID().getText();
        String arg = visit(ctx.expr());

        try {
            contextMemory.isFunctionExists(name);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return name + "(" + arg + ")" ;
    }

    @Override
    public String visitParam_call(mathlangParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null) {
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitParamCallArgs(mathlangParser.ParamCallArgsContext ctx) {
        String name = ctx.ID().getText();

        try {
            contextMemory.isVariableExists(name);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return name + ", " + this.visit(ctx.arg_call());
    }

    @Override
    public String visitParamCallArg(mathlangParser.ParamCallArgContext ctx) {
        String name = ctx.ID().getText();

        try {
            contextMemory.isVariableExists(name);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return name;
    }

    @Override
    public String visitParam(mathlangParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null) {
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamArgs(mathlangParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.ID().getText();
        contextMemory.addLocal(name, VariableType.getTypeByString(type));
        return type + " " + name + ", " + this.visit(ctx.arg());
    }

    @Override
    public String visitParamArg(mathlangParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.ID().getText();
        contextMemory.addLocal(name, VariableType.getTypeByString(type));
        if (type.equals("FLOAT")) {
            type = "float";
        } else if (type.equals("INTEGER")) {
            type = "int";
        }
        return type + " " + name;
    }

    @Override
    public String visitAddSub(mathlangParser.AddSubContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == mathlangParser.ADD) return left + "+" + right;
        return left + " - " + right; // must be SUB
    }

    @Override
    public String visitUnary(mathlangParser.UnaryContext ctx) {
        String buff = visit(ctx.expr());
        if (ctx.op.getType() == mathlangParser.ADD) return " + " + buff;
        return "-" + buff;
    }

    @Override
    public String visitPowExpr(mathlangParser.PowExprContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        return left + "^" + right;
    }

    @Override
    public String visitAssignExpr(mathlangParser.AssignExprContext ctx) {
        String left = ctx.ID().getText();
        ;  // get value of left subexpression
        String right = visit(ctx.expr()); // get value of right subexpression
        return left + " = " + right + ";";
    }

    @Override
    public String visitPrim(mathlangParser.PrimContext ctx) {
        String buff = visit(ctx.expr());
        return "(" + buff + ")";
    }

    @Override
    public String visitModMulDiv(mathlangParser.ModMulDivContext ctx) {
        String left = visit(ctx.expr(0));  // get value of left subexpression
        String right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == mathlangParser.MOD) return left + " % " + right;
        if (ctx.op.getType() == mathlangParser.MUL) return left + " * " + right;
        return left + " / " + right; // must be DIV
    }


    @Override
    public String visitFloatExpr(mathlangParser.FloatExprContext ctx) {
        String buff = this.visit(ctx.name_object_float());
        return buff + "f";
    }

    @Override
    public String visitIntExrp(mathlangParser.IntExrpContext ctx) {
        String buff = this.visit(ctx.name_object_int());
        return buff;
    }

    @Override
    public String visitIdExpr(mathlangParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        return name;
    }


    @Override
    public String visitTypeConversion(mathlangParser.TypeConversionContext ctx) {
        String type = "";
        String buffer = visit(ctx.expr());
        if (ctx.tp.getType() == mathlangParser.FLOAT_TYPE) type = "float";
        else type = "int";
        return "(" + type + ")" + buffer;
    }
}
