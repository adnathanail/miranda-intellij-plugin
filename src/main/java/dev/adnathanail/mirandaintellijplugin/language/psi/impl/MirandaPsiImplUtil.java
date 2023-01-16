package dev.adnathanail.mirandaintellijplugin.language.psi.impl;

import com.intellij.psi.PsiElement;
import dev.adnathanail.mirandaintellijplugin.language.MirandaReference;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaElementFactory;

public class MirandaPsiImplUtil {

    public static String getName(PsiElement element) {
        return element.getText();
    }

    public static PsiElement setName(PsiElement element, String newName) {
        return MirandaElementFactory.createNamedElement(element.getProject(), newName);
    }

    public static PsiElement getNameIdentifier(PsiElement element) {
        return element.getNode().getPsi();
    }

    public static MirandaReference getReference(PsiElement element) {
        return new MirandaReference(element);
    }
}
