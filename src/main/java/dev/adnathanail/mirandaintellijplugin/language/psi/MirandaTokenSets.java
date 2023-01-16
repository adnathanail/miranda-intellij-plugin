package dev.adnathanail.mirandaintellijplugin.language.psi;

import com.intellij.psi.tree.TokenSet;

public interface MirandaTokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(MirandaTypes.KEY);

  TokenSet COMMENTS = TokenSet.create(MirandaTypes.COMMENT);

}
