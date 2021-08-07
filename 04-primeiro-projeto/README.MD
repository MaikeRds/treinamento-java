# Treinamento de JAVA

## Módulo 01

* Tipos
* Static
* Classes
* Abstracts
* Interfaces
* Finals
* Enums

## Módulo 02

* Operadores
* Ifs
* Fors
* Whiles
* String

Configuração de Style Guides usando plugin do Gradle.

* CheckStyle - Google Java Style.
* PMD

```groovy
// build.gradle

plugins {
    id 'java'
    id 'checkstyle'
    id 'pmd'
}

checkstyle {
    toolVersion = '8.45'
    showViolations = true
    // https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml
    configFile = file("config/checkstyle/checkstyle.xml")
}

pmd {
    ruleSetFiles = files("config/pmd/ruleset.xml")
    toolVersion = '6.37.0'
    ignoreFailure = true
    consoleOutput = true
}
```