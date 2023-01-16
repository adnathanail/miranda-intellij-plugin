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
import dev.adnathanail.mirandaintellijplugin.language.MirandaReference;

public class MirandaTypenameImpl extends MirandaNamedElementImpl implements MirandaTypename {

  public MirandaTypenameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitTypename(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifierLower() {
    return findNotNullChildByType(IDENTIFIER_LOWER);
  }

  @Override
  public String getName() {
    return MirandaPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return MirandaPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return MirandaPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public MirandaReference getReference() {
    return MirandaPsiImplUtil.getReference(this);
  }

}
