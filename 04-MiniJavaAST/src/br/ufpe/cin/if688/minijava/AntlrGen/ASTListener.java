// Generated from E:/Try2/Ex4/Exerc-cio-4---ASTs-MiniJava/04-MiniJavaAST/src/br/ufpe/cin/if688/minijava/Antlr\AST.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASTParser}.
 */
public interface ASTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASTParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(ASTParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(ASTParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ASTParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ASTParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(ASTParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(ASTParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ASTParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ASTParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ASTParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ASTParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ASTParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ASTParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ASTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ASTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ASTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ASTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ASTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ASTParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ASTParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ASTParser.IdentifierContext ctx);
}