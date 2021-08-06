# Instalação de ambiente

## Instalando o Java 10

Basta abrir um novo terminal e inserir:

```bash
add-apt-repository ppa:linuxuprising/java
```

```bash
apt-get update
```

```bash
apt-get install oracle-java10-installer
```

---

## Instalando SDKMAN

Siga as instruções na tela para concluir a instalação.

Abra um novo terminal ou digite o comando:

```bash
curl -s get.sdkman.io | bash
```

```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

## Instalando o Java 10 com SDKMAN

Versões Java Disponíveis

```bash
sdk list java
```

Use o identificador para instalação:

```bash
sdk install java 11.0.12-zulu
```

Você ainda pode baixar o Oracle JDK e extraí-lo manualmente na pasta apropriada. Depois disso, você pode usar todos os comandos sdkman como se ele fosse instalado automaticamente.

baixe o [jdk-10.0.2_linux-x64_bin.tar.gz](https://www.oracle.com/br/java/technologies/java-archive-javase10-downloads.html#license-lightbox)

```bash
tar -xf jdk-10.0.2_linux-x64_bin.tar.gz -C  ~/.sdkman/candidates/java/
```

```bash
sdk use java jdk-10.0.2 
```

```bash
sdk default java jdk-10.0.2 
```

## Instalando Gradle com SDKMAN

Versões Gradle Disponíveis

```bash
sdk list gradle
```

Instale a versão desejada

```bash
sdk install gradle 7.1.1
```

## Instalando Maven com SDKMAN

Versões Maven Disponíveis

```bash
sdk maven gradle
```

Instale a versão desejada

```bash
sdk install maven 3.8.1 
```

Criar Wrapper do Maven

```bash
mvn -N io.takari:maven:wrapper
```

Versão do maven local

```bash
./mvnw -v
```

---

## Instalando o IntelliJ

1 - Fazer download do IntelliJ https://www.jetbrains.com/idea/;

2 - Criar a pasta para o IntelliJ dentro da pasta /opt:

```bash
sudo mkdir /opt/intellij
```

3 - Descompactar o arquivo baixado:

```bash
sudo tar -xzf ideaIC-2021.2.tar.gz -C /opt/intellij
```

4 - Navegue para a pasta onde foi descompactado;

```bash
cd opt/intellij/idea-IC-212.4746.92/bin
```

5 - Execute o script de instalação:

```bash
./idea.sh
```
