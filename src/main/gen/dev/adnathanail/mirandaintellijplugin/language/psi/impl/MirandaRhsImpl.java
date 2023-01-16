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

public class MirandaRhsImpl extends ASTWrapperPsiElement implements MirandaRhs {

  public MirandaRhsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitRhs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaCases getCases() {
    return findChildByClass(MirandaCases.class);
  }

  @Override
  @Nullable
  public MirandaSimpleRhs getSimpleRhs() {
    return findChildByClass(MirandaSimpleRhs.class);
  }

  @Override
  @Nullable
  public MirandaStatementEnding getStatementEnding() {
    return findChildByClass(MirandaStatementEnding.class);
  }

}
