package dev.adnathanail.mirandaintellijplugin.language;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaTypename;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaVar;
import dev.adnathanail.mirandaintellijplugin.language.psi.MirandaVarDecl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MirandaReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    public MirandaReference(@NotNull PsiElement element) {
        super(element, TextRange.from(element.getStartOffsetInParent(), element.getTextLength()));
        key = element.getText();
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        List<ResolveResult> results = new ArrayList<>();
        if (myElement instanceof MirandaVar) {
            MirandaVar var = (MirandaVar) myElement;
            final List<MirandaVarDecl> vars = MirandaUtil.findFunctionDeclarations(var, key);
            for (MirandaVarDecl target : vars) {
                results.add(new PsiElementResolveResult(target));
            }
        } else if (myElement instanceof MirandaTypename) {
            MirandaTypename typename = (MirandaTypename) myElement;
            final List<MirandaTypename> typenames = MirandaUtil.findTypeDefinitions(typename, key);
            for (MirandaTypename target : typenames) {
                results.add(new PsiElementResolveResult(target));
            }
        } else {
            return ResolveResult.EMPTY_ARRAY;
        }
        return results.toArray(new ResolveResult[0]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @Override
    public Object @NotNull [] getVariants() {
        List<LookupElement> variants = new ArrayList<>();
        if (myElement instanceof MirandaVar) {
            MirandaVar var = (MirandaVar) myElement;
            final List<MirandaVarDecl> vars = MirandaUtil.findFunctionDeclarations(var, null);
            for (MirandaVarDecl target : vars) {
                if (target.getText() != null && target.getText().length() > 0) {
                    variants.add(LookupElementBuilder
                            .create(target).withIcon(MirandaIcons.FILE)
                            .withTypeText(target.getContainingFile().getName())
                    );
                }
            }
        } else if (myElement instanceof MirandaTypename) {
            MirandaTypename typename = (MirandaTypename) myElement;
            final List<MirandaTypename> typenames = MirandaUtil.findTypeDefinitions(typename, null);
            for (MirandaTypename target : typenames) {
                if (target.getText() != null && target.getText().length() > 0) {
                    variants.add(LookupElementBuilder
                            .create(target).withIcon(MirandaIcons.FILE)
                            .withTypeText(target.getContainingFile().getName())
                    );
                }
            }
        }
        return variants.toArray();
    }

}
