# Validação de Senha em Java 🔒

Este programa em Java solicita ao usuário uma senha e verifica se ela está correta.

## 📝 Descrição

O programa:

1. Pede que o usuário insira uma senha numérica.
2. Compara a senha inserida com a senha definida no código (2002).
3. Caso a senha esteja correta, exibe "Acesso Permitido" e finaliza a execução.
4. Caso esteja errada, exibe "Senha Invalida" e solicita uma nova tentativa até que a senha correta seja inserida.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac validaSenha.java
   ```
4. Execute o programa:
   ```bash
   java validaSenha
   ```

## 📌 Exemplo de Uso

### Entrada:

```
Digite a sua senha:
1234
Digite a sua senha:
2002
```

### Saída:

```
Senha Invalida
Acesso Permitido
```

## 📂 Estrutura do código

O código é composto por:

- **Leitura da senha** inserida pelo usuário.
- **Loop de validação** que continua até que a senha correta seja digitada.
- **Exibição da mensagem** informando se o acesso foi permitido ou negado.

