// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaTdef extends PsiElement {

  @Nullable
  MirandaConstructs getConstructs();

  @Nullable
  MirandaSig getSig();

  @NotNull
  MirandaStatementEnding getStatementEnding();

  @Nullable
  MirandaTform getTform();

  @Nullable
  MirandaTformList getTformList();

  @Nullable
  MirandaType getType();

}
