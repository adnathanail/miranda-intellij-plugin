// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.adnathanail.mirandaintellijplugin.language.psi.*;

public class MirandaTdefImpl extends ASTWrapperPsiElement implements MirandaTdef {

  public MirandaTdefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitTdef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaConstructs getConstructs() {
    return findChildByClass(MirandaConstructs.class);
  }

  @Override
  @Nullable
  public MirandaSig getSig() {
    return findChildByClass(MirandaSig.class);
  }

  @Override
  @NotNull
  public MirandaStatementEnding getStatementEnding() {
    return findNotNullChildByClass(MirandaStatementEnding.class);
  }

  @Override
  @Nullable
  public MirandaTform getTform() {
    return findChildByClass(MirandaTform.class);
  }

  @Override
  @Nullable
  public MirandaTformList getTformList() {
    return findChildByClass(MirandaTformList.class);
  }

  @Override
  @Nullable
  public MirandaType getType() {
    return findChildByClass(MirandaType.class);
  }

}
