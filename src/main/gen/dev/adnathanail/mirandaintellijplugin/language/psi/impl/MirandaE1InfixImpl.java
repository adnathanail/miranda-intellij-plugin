// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTypes.*;
import dev.adnathanail.mirandaintellijplugin.language.psi.*;

public class MirandaE1InfixImpl extends MirandaE1Impl implements MirandaE1Infix {

  public MirandaE1InfixImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitE1Infix(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MirandaE1> getE1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaE1.class);
  }

  @Override
  @NotNull
  public MirandaInfix getInfix() {
    return findNotNullChildByClass(MirandaInfix.class);
  }

}
