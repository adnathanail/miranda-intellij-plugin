package dev.adnathanail.mirandaintellijplugin.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class MirandaColorSettingsPage implements ColorSettingsPage {

  private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
          new AttributesDescriptor("Operator", MirandaSyntaxHighlighter.OPERATOR),
          new AttributesDescriptor("Keyword", MirandaSyntaxHighlighter.KEYWORD),
          new AttributesDescriptor("Identifier", MirandaSyntaxHighlighter.IDENTIFIER),
          new AttributesDescriptor("Number", MirandaSyntaxHighlighter.NUMBER),
          new AttributesDescriptor("String", MirandaSyntaxHighlighter.STRING),
          new AttributesDescriptor("Character", MirandaSyntaxHighlighter.CHAR),
          new AttributesDescriptor("Comment", MirandaSyntaxHighlighter.COMMENT),
          new AttributesDescriptor("Typevar", MirandaSyntaxHighlighter.TYPEVAR),
          new AttributesDescriptor("Bad value", MirandaSyntaxHighlighter.BAD_CHARACTER)
  };

  @Nullable
  @Override
  public Icon getIcon() {
    return MirandaIcons.FILE;
  }

  @NotNull
  @Override
  public SyntaxHighlighter getHighlighter() {
    return new MirandaSyntaxHighlighter();
  }

  @NotNull
  @Override
  public String getDemoText() {
    return "|| Exercise 2.1\n" +
            "isnum c = (c >= '0') & (c <= '9')\n" +
            "islower c = (c >= 'a') & (c <= 'z')\n" +
            "isupper c = (c >= 'A') & (c <= 'Z')\n" +
            "isalphanumeric c = isupper c \\/ islower c \\/ isupper c\n" +
            "random a = \"test\", if a = 1\n" +
            "         = \"fish\", otherwise\n" +
            "\n" +
            "error\n";
  }

  @Nullable
  @Override
  public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @Override
  public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  @Override
  public ColorDescriptor @NotNull [] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @NotNull
  @Override
  public String getDisplayName() {
    return "Miranda";
  }

}
