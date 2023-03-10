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

public class MirandaConstructImpl extends ASTWrapperPsiElement implements MirandaConstruct {

  public MirandaConstructImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitConstruct(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MirandaArgtype> getArgtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaArgtype.class);
  }

  @Override
  @Nullable
  public MirandaConstruct getConstruct() {
    return findChildByClass(MirandaConstruct.class);
  }

  @Override
  @Nullable
  public MirandaConstructor getConstructor() {
    return findChildByClass(MirandaConstructor.class);
  }

  @Override
  @NotNull
  public List<MirandaType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaType.class);
  }

}
