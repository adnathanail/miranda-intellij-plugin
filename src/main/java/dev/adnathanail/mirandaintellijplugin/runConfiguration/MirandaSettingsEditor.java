package dev.adnathanail.mirandaintellijplugin.runConfiguration;

import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MirandaSettingsEditor extends SettingsEditor<MirandaRunConfiguration> {

  private JPanel myPanel;
  private LabeledComponent<TextFieldWithBrowseButton> myScriptName;

  @Override
  protected void resetEditorFrom(MirandaRunConfiguration demoRunConfiguration) {
    myScriptName.getComponent().setText(demoRunConfiguration.getScriptName());
  }

  @Override
  protected void applyEditorTo(@NotNull MirandaRunConfiguration mirandaRunConfiguration) {
    mirandaRunConfiguration.setScriptName(myScriptName.getComponent().getText());
  }

  @NotNull
  @Override
  protected JComponent createEditor() {
    return myPanel;
  }

  private void createUIComponents() {
    myScriptName = new LabeledComponent<>();
    myScriptName.setComponent(new TextFieldWithBrowseButton());
  }

}
