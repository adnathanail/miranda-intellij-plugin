// This is a generated file. Not intended for manual editing.
package dev.adnathanail.mirandaintellijplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaSpec extends PsiElement {

  @NotNull
  MirandaStatementEnding getStatementEnding();

  @Nullable
  MirandaTformList getTformList();

  @NotNull
  MirandaType getType();

  @Nullable
  MirandaVarList getVarList();

}
