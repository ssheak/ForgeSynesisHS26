// Generated from /home/shahriar/Schreibtisch/SoftwareEngineering/Project/ForgeSynesisHS26/JabRef/src/main/antlr4/org/jabref/bst/Bst.g4 by ANTLR 4.13.1
package org.jabref.logic.bst;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BstParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BstVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BstParser#bstFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBstFile(BstParser.BstFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringsCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringsCommand(BstParser.StringsCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integersCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegersCommand(BstParser.IntegersCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCommand(BstParser.FunctionCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code macroCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroCommand(BstParser.MacroCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCommand(BstParser.ReadCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code executeCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteCommand(BstParser.ExecuteCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterateCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateCommand(BstParser.IterateCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reverseCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverseCommand(BstParser.ReverseCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entryCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryCommand(BstParser.EntryCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortCommand}
	 * labeled alternative in {@link BstParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCommand(BstParser.SortCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BstParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(BstParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BstParser#idListObl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListObl(BstParser.IdListOblContext ctx);
	/**
	 * Visit a parse tree produced by {@link BstParser#idListOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListOpt(BstParser.IdListOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link BstParser#bstFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBstFunction(BstParser.BstFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BstParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(BstParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link BstParser#stackitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackitem(BstParser.StackitemContext ctx);
}