// Generated from E:/Try2/Ex4/Exerc-cio-4---ASTs-MiniJava/04-MiniJavaAST/src/br/ufpe/cin/if688/minijava/Antlr\AST.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASTParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(ASTParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ASTParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(ASTParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ASTParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ASTParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ASTParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ASTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ASTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ASTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASTParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ASTParser.IdentifierContext ctx);
}