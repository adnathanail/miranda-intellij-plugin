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

public class MirandaLibdirImpl extends ASTWrapperPsiElement implements MirandaLibdir {

  public MirandaLibdirImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitLibdir(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaEnv getEnv() {
    return findChildByClass(MirandaEnv.class);
  }

  @Override
  @Nullable
  public MirandaParts getParts() {
    return findChildByClass(MirandaParts.class);
  }

  @Override
  @Nullable
  public MirandaSig getSig() {
    return findChildByClass(MirandaSig.class);
  }

  @Override
  @Nullable
  public MirandaStatementEnding getStatementEnding() {
    return findChildByClass(MirandaStatementEnding.class);
  }

}
