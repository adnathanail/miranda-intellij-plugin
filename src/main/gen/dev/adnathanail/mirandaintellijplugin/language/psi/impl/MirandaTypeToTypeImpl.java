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

public class MirandaTypeToTypeImpl extends MirandaTypeImpl implements MirandaTypeToType {

  public MirandaTypeToTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitTypeToType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MirandaType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaType.class);
  }

}
