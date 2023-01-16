package dev.adnathanail.mirandaintellijplugin.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import dev.adnathanail.mirandaintellijplugin.language.parser.MirandaParser;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaFile;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTokenSets;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTypes;
import org.jetbrains.annotations.NotNull;

public class MirandaParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(MirandaLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new MirandaLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return MirandaTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new MirandaParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new MirandaFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return MirandaTypes.Factory.createElement(node);
    }

}
