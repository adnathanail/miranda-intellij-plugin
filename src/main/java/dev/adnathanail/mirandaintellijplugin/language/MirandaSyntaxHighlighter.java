package dev.adnathanail.mirandaintellijplugin.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class MirandaSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("MIRANDA_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("MIRANDA_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("MIRANDA_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("MIRANDA_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("MIRANDA_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey CHAR =
            createTextAttributesKey("MIRANDA_CHAR", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("MIRANDA_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey TYPEVAR =
            createTextAttributesKey("MIRANDA_TYPEVAR", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("MIRANDA_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] CHAR_KEYS = new TextAttributesKey[]{CHAR};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MirandaLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(MirandaTypes.OP_AND)
                || tokenType.equals(MirandaTypes.OP_ARG)
                || tokenType.equals(MirandaTypes.OP_BACK_FWD_SLASH)
                || tokenType.equals(MirandaTypes.OP_DOT)
                || tokenType.equals(MirandaTypes.OP_DOTS)
                || tokenType.equals(MirandaTypes.OP_DOUBLE_ADD)
                || tokenType.equals(MirandaTypes.OP_DOUBLE_EQ)
                || tokenType.equals(MirandaTypes.OP_DOUBLE_MINUS)
                || tokenType.equals(MirandaTypes.OP_EQ)
                || tokenType.equals(MirandaTypes.OP_EXPONENT)
                || tokenType.equals(MirandaTypes.OP_GENERATE)
                || tokenType.equals(MirandaTypes.OP_GREATER)
                || tokenType.equals(MirandaTypes.OP_GREATER_EQUAL)
                || tokenType.equals(MirandaTypes.OP_HASH)
                || tokenType.equals(MirandaTypes.OP_IS)
                || tokenType.equals(MirandaTypes.OP_MINUS)
                || tokenType.equals(MirandaTypes.OP_NOT)
                || tokenType.equals(MirandaTypes.OP_ONEMORE)
                || tokenType.equals(MirandaTypes.OP_OPT)
                || tokenType.equals(MirandaTypes.OP_OR)
                || tokenType.equals(MirandaTypes.OP_SIMILAR)
                || tokenType.equals(MirandaTypes.OP_SMALLER)
                || tokenType.equals(MirandaTypes.OP_SMALLER_EQUAL)
                || tokenType.equals(MirandaTypes.OP_SNAKE_ADD)
                || tokenType.equals(MirandaTypes.OP_SPEC)
                || tokenType.equals(MirandaTypes.OP_ZEROMORE)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(MirandaTypes.ABSTYPE)
                || tokenType.equals(MirandaTypes.WITH)
                || tokenType.equals(MirandaTypes.IF)
                || tokenType.equals(MirandaTypes.OTHERWISE)
                || tokenType.equals(MirandaTypes.WHERE)
                || tokenType.equals(MirandaTypes.READVALS)
                || tokenType.equals(MirandaTypes.SHOW)
                || tokenType.equals(MirandaTypes.DIV)
                || tokenType.equals(MirandaTypes.MOD)
                || tokenType.equals(MirandaTypes.INCLUDE)
                || tokenType.equals(MirandaTypes.EXPORT)
                || tokenType.equals(MirandaTypes.FREE)
                || tokenType.equals(MirandaTypes.TRUE)
                || tokenType.equals(MirandaTypes.FALSE)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(MirandaTypes.IDENTIFIER_LOWER) | tokenType.equals(MirandaTypes.IDENTIFIER_UPPER)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(MirandaTypes.NUMBER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(MirandaTypes.STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(MirandaTypes.CHAR)) {
            return CHAR_KEYS;
        }
        if (tokenType.equals(MirandaTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
