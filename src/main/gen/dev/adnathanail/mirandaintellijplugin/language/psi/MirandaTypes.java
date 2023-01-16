// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.adnathanail.mirandaintellijplugin.language.psi.impl.*;

public interface MirandaTypes {

  IElementType PROPERTY = new MirandaElementType("PROPERTY");

  IElementType COMMENT = new MirandaTokenType("COMMENT");
  IElementType CRLF = new MirandaTokenType("CRLF");
  IElementType KEY = new MirandaTokenType("KEY");
  IElementType SEPARATOR = new MirandaTokenType("SEPARATOR");
  IElementType VALUE = new MirandaTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new MirandaPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
