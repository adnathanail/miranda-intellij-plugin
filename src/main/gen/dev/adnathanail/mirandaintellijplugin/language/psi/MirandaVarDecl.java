// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaVarDecl extends MirandaNamedElement {

  @NotNull
  MirandaVar getVar();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
