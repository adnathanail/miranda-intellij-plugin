package dev.adnathanail.mirandaintellijplugin.runConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MirandaRunConfigurationType implements ConfigurationType {

  static final String ID = "MirandaRunConfiguration";

  @NotNull
  @Override
  public String getDisplayName() {
    return "Miranda";
  }

  @Override
  public String getConfigurationTypeDescription() {
    return "Miranda run configuration type";
  }

  @Override
  public Icon getIcon() {
    return AllIcons.General.Information;
  }

  @NotNull
  @Override
  public String getId() {
    return ID;
  }

  @Override
  public ConfigurationFactory[] getConfigurationFactories() {
    return new ConfigurationFactory[]{new MirandaConfigurationFactory(this)};
  }

}
