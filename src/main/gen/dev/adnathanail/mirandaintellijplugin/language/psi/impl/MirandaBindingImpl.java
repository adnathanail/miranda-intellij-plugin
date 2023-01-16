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

public class MirandaBindingImpl extends ASTWrapperPsiElement implements MirandaBinding {

  public MirandaBindingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitBinding(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaExp getExp() {
    return findChildByClass(MirandaExp.class);
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
  public MirandaType getType() {
    return findChildByClass(MirandaType.class);
  }

  @Override
  @Nullable
  public MirandaVar getVar() {
    return findChildByClass(MirandaVar.class);
  }

}
