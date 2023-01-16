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

public class MirandaCasesImpl extends ASTWrapperPsiElement implements MirandaCases {

  public MirandaCasesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitCases(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaAlt getAlt() {
    return findChildByClass(MirandaAlt.class);
  }

  @Override
  @Nullable
  public MirandaCases getCases() {
    return findChildByClass(MirandaCases.class);
  }

  @Override
  @Nullable
  public MirandaLastcase getLastcase() {
    return findChildByClass(MirandaLastcase.class);
  }

  @Override
  @Nullable
  public MirandaStatementEnding getStatementEnding() {
    return findChildByClass(MirandaStatementEnding.class);
  }

  @Override
  @Nullable
  public PsiElement getLineEnding() {
    return findChildByType(LINE_ENDING);
  }

}
