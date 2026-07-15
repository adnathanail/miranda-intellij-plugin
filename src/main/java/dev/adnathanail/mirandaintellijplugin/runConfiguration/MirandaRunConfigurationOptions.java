package dev.adnathanail.mirandaintellijplugin.runConfiguration;

import com.intellij.execution.configurations.RunConfigurationOptions;
import com.intellij.openapi.components.StoredProperty;

public class MirandaRunConfigurationOptions extends RunConfigurationOptions {

  private final StoredProperty<String> myScriptName = string("").provideDelegate(this, "scriptName");

  public String getScriptName() {
    return myScriptName.getValue(this);
  }

  public void setScriptName(String scriptName) {
    myScriptName.setValue(this, scriptName);
  }

}
