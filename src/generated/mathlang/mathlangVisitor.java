// Generated from C:/Users/rinkl/Downloads/mathlang\mathlang.g4 by ANTLR 4.8
package mathlang;

package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mathlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mathlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mathlangParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(mathlangParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(mathlangParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mathlangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(mathlangParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(mathlangParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#create_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_int(mathlangParser.Create_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#create_const_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_int(mathlangParser.Create_const_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#create_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_float(mathlangParser.Create_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#create_const_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_float(mathlangParser.Create_const_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mathlangParser#name_object_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectInt(mathlangParser.NameObjectIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mathlangParser#name_object_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectFloat(mathlangParser.NameObjectFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(mathlangParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(mathlangParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(mathlangParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(mathlangParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(mathlangParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mathlangParser#condition_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(mathlangParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mathlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(mathlangParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mathlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(mathlangParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(mathlangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mathlangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(mathlangParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mathlangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(mathlangParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mathlangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFloat(mathlangParser.PrintFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(mathlangParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(mathlangParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mathlangParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(mathlangParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mathlangParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(mathlangParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mathlangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(mathlangParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mathlangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(mathlangParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(mathlangParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMulDiv(mathlangParser.ModMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(mathlangParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(mathlangParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(mathlangParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExrp(mathlangParser.IntExrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(mathlangParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(mathlangParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(mathlangParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(mathlangParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mathlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(mathlangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(mathlangParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(mathlangParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(mathlangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mathlangParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(mathlangParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mathlangParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(mathlangParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mathlangParser.TypeContext ctx);
}