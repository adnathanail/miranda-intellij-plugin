// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaFnform extends PsiElement {

  @Nullable
  MirandaFnform getFnform();

  @NotNull
  List<MirandaFormal> getFormalList();

  @NotNull
  List<MirandaPat> getPatList();

  @Nullable
  MirandaVarDecl getVarDecl();

}
