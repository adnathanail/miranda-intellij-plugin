# miranda-intellij-plugin

![Build](https://github.com/adnathanail/miranda-intellij-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

_Parser/Lexer heavily based on [dennisylyung/miranda-intellij](https://github.com/dennisylyung/miranda-intellij)_

<!-- Plugin description -->
This plugin adds syntax highlighting for the [Miranda language](https://www.cs.kent.ac.uk/people/staff/dat/miranda/) to IntelliJ IDEs
<!-- Plugin description end -->

## Current functionality

- Syntax highlighting

## To do list

Implemented up to (not including) [PSI Helpers and Utilities](https://plugins.jetbrains.com/docs/intellij/psi-helper-and-utilities.html)

- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the Plugin ID in the above README badges.
- [ ] Set the [Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html?from=IJPluginTemplate) related [secrets](https://github.com/JetBrains/intellij-platform-plugin-template#environment-variables).
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html?from=IJPluginTemplate).
- [ ] Add a plugin logo
- [ ] Bring back Qodana

---

- [ ] [Run configuration support](https://plugins.jetbrains.com/docs/intellij/run-configurations.html?from=jetbrains.org#implement-a-run-configuration)

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "miranda-intellij-plugin"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/adnathanail/miranda-intellij-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
