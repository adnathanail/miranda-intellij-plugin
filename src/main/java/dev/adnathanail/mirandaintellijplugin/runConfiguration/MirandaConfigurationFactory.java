package dev.adnathanail.mirandaintellijplugin.runConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.BaseState;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class MirandaConfigurationFactory extends ConfigurationFactory {

  protected MirandaConfigurationFactory(ConfigurationType type) {
    super(type);
  }

  @Override
  public @NotNull String getId() {
    return MirandaRunConfigurationType.ID;
  }

  @NotNull
  @Override
  public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
    return new MirandaRunConfiguration(project, this, "Miranda");
  }

  @Nullable
  @Override
  public Class<? extends BaseState> getOptionsClass() {
    return MirandaRunConfigurationOptions.class;
  }

}
