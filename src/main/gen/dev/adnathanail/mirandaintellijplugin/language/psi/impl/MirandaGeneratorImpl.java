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

public class MirandaGeneratorImpl extends ASTWrapperPsiElement implements MirandaGenerator {

  public MirandaGeneratorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitGenerator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MirandaExp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaExp.class);
  }

  @Override
  @Nullable
  public MirandaPat getPat() {
    return findChildByClass(MirandaPat.class);
  }

  @Override
  @Nullable
  public MirandaPatList getPatList() {
    return findChildByClass(MirandaPatList.class);
  }

}
