package dev.adnathanail.mirandaintellijplugin.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import dev.adnathanail.mirandaintellijplugin.language.MirandaFileType;
import dev.adnathanail.mirandaintellijplugin.language.MirandaLanguage;
import org.jetbrains.annotations.NotNull;

public class MirandaFile extends PsiFileBase {

  public MirandaFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, MirandaLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return MirandaFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Miranda File";
  }

}
