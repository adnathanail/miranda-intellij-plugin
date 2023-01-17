# miranda-intellij-plugin

![Build](https://github.com/adnathanail/miranda-intellij-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/20871-miranda-language-support.svg)](https://plugins.jetbrains.com/plugin/20871-miranda-language-support)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/20871-miranda-language-support.svg)](https://plugins.jetbrains.com/plugin/20871-miranda-language-support)

_Parser/Lexer heavily based on [dennisylyung/miranda-intellij](https://github.com/dennisylyung/miranda-intellij)_

<!-- Plugin description -->
This plugin adds syntax highlighting for the [Miranda language](https://www.cs.kent.ac.uk/people/staff/dat/miranda/) to IntelliJ IDEs
<!-- Plugin description end -->

## Functionality

- Syntax highlighting
- Go to reference
- Comment keyboard shortcut (`cmd + /` / `ctrl + x`)

## To do list

- [ ] Bring back Qodana
- [ ] [Code completion](https://plugins.jetbrains.com/docs/intellij/completion-contributor.html)
- [ ] [Run configuration support](https://plugins.jetbrains.com/docs/intellij/run-configurations.html?from=jetbrains.org#implement-a-run-configuration)
- [ ] [Refactoring](https://plugins.jetbrains.com/docs/intellij/reference-contributor.html#define-a-refactoring-support-provider)
- [ ] [Find usages](https://plugins.jetbrains.com/docs/intellij/find-usages-provider.html)
- [ ] [Folding](https://plugins.jetbrains.com/docs/intellij/folding-builder.html)
- [ ] [Go to symbol](https://plugins.jetbrains.com/docs/intellij/go-to-symbol-contributor.html)
- [ ] [Structure view](https://plugins.jetbrains.com/docs/intellij/structure-view-factory.html) / [Structure aware navbar](https://plugins.jetbrains.com/docs/intellij/structure-aware-navbar.htm)
- [ ] [Formatter](https://plugins.jetbrains.com/docs/intellij/formatter.html)
- [ ] [Documentation](https://plugins.jetbrains.com/docs/intellij/documentation-provider.html)
- [ ] [Spell check](https://plugins.jetbrains.com/docs/intellij/spell-checking-strategy.html)

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
