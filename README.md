# 📊 Sistema de Cadastro de Notas - Java Swing

![Language](https://img.shields.io/badge/Language-Java-orange.svg)
![GUI](https://img.shields.io/badge/GUI-Swing-blue.svg)
![Status](https://img.shields.io/badge/Status-Completed-green.svg)
![Course](https://img.shields.io/badge/Disciplina-Programação%20II-red.svg)

Este repositório contém a implementação de um Mini Sistema de Cadastro de Notas de Alunos, desenvolvido como atividade prática da disciplina de Programação II da Universidade Federal do Espírito Santo (UFES).

O projeto representa meu primeiro contato com desenvolvimento de interfaces gráficas (GUI) em Java utilizando Swing, aplicando conceitos fundamentais de Programação Orientada a Objetos.

---

## 🚀 Funcionalidades e Conceitos

O sistema permite o cadastro individual, cálculo de média e exibição de histórico, implementando os seguintes requisitos:

| Categoria | Detalhes da Implementação |
| :--- | :--- |
| **Lógica de Negócio** | • Cálculo de Média Aritmética<br>• Verificação de Situação (Aprovado $\ge$ 7, Recuperação 5-6.9, Reprovado < 5) |
| **Interface Gráfica** | • Uso de `JFrame` com gerenciador de layout `FlowLayout`<br>• Componentes: `JLabel`, `JTextField`, `JButton`, `JTextArea` |
| **Estrutura de Dados** | • Armazenamento dinâmico de objetos `Aluno` utilizando `ArrayList`  |
| **Tratamento de Erros** | • `try-catch` para entradas não numéricas (`NumberFormatException`)<br>• Exceção Personalizada `NotaInvalidaException` para notas fora de 0-10  |

---

## ⚙️ Como Compilar e Executar

Siga os passos abaixo para testar a aplicação via terminal:

### 1. Compilar o Código
Abra o terminal na pasta onde estão os arquivos `.java` e execute:

    javac *.java

### 2. Executar a Aplicação
Após a compilação, inicie o sistema com o comando:

    java SistemaNotas

O sistema abrirá uma janela onde você poderá inserir o nome e as duas notas do aluno. O histórico será atualizado automaticamente na área de texto inferior.

---


## 👨‍💻 Autor

**Alexandre Cesar de Souza Rangel**
Aluno de Ciência da Computação

---

*Projeto desenvolvido para a disciplina de Programação II - 2025/2.*
