// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import dev.adnathanail.mirandaintellijplugin.language.MirandaReference;

public interface MirandaTypename extends MirandaNamedElement {

  @NotNull
  PsiElement getIdentifierLower();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  MirandaReference getReference();

}
