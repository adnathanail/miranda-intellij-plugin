package dev.adnathanail.mirandaintellijplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import dev.adnathanail.mirandaintellijplugin.language.MirandaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MirandaTokenType extends IElementType {

    public MirandaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MirandaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MirandaTokenType." + super.toString();
    }

}
