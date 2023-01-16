package dev.adnathanail.mirandaintellijplugin.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import dev.adnathanail.mirandaintellijplugin.language.MirandaFileType;

public class MirandaElementFactory {
    public static PsiElement createNamedElement(Project project, String name) {
        final MirandaFile file = createFile(project, name);
        return file.getFirstChild();
    }

    public static MirandaFile createFile(Project project, String text) {
        String name = "dummy.m";
        return (MirandaFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, MirandaFileType.INSTANCE, text);
    }
}
