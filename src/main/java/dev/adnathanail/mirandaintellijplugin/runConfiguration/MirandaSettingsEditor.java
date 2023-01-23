package dev.adnathanail.mirandaintellijplugin.runConfiguration;

import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MirandaSettingsEditor extends SettingsEditor<MirandaRunConfiguration> {

  private JPanel myPanel;

  @Override
  protected void resetEditorFrom(@NotNull MirandaRunConfiguration demoRunConfiguration) {
  }

  @Override
  protected void applyEditorTo(@NotNull MirandaRunConfiguration demoRunConfiguration) {
  }

  @NotNull
  @Override
  protected JComponent createEditor() {
    return myPanel;
  }
}
