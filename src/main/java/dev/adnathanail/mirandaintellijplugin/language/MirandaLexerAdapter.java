package dev.adnathanail.mirandaintellijplugin.language;

import com.intellij.lexer.FlexAdapter;

public class MirandaLexerAdapter extends FlexAdapter {

    public MirandaLexerAdapter() {
        super(new MirandaLexer(null));
    }

}
