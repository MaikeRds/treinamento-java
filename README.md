# Treinamento de java

## Instalação de ambiente

Instalando o Java 10

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

Instalando o Java 10 com SDKMAN

Siga as instruções na tela para concluir a instalação.

Abra um novo terminal ou digite o comando:

```bash
curl -s get.sdkman.io | bash
```

```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

Versões Java Disponíveis

```bash
sdk list java
```

Use o identificador para instalação:

```bash
sdk install java 11.0.3.hs-adpt
```

Você ainda pode baixar o Oracle JDK e extraí-lo manualmente na pasta apropriada. Depois disso, você pode usar todos os comandos sdkman como se ele fosse instalado automaticamente.

baixe o [jdk-10.0.2_linux-x64_bin.tar.gz](https://www.oracle.com/br/java/technologies/java-archive-javase10-downloads.html#license-lightbox)

```bash
tar -xf jdk-10.0.2_linux-x64_bin.tar.gz -C  ~/.sdkman/candidates/java/
```

```bash
sdk use java jdk-10.0.2 
```
