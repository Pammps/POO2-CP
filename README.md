#  Refatoração Orientada a Objetos

## Objetivo

Refatorar um código legado aplicando conceitos de Programação Orientada a Objetos e práticas de Clean Code.

---

## 🚨 Problemas encontrados no código original

* Uso de atributos públicos (falta de encapsulamento)
* Nomes de variáveis sem significado
* Duplicação de código (ausência de herança)
* Associação rígida (Rota dependia apenas de Caminhão)
* Falta de validação de dados

---

## ✅ Soluções aplicadas

### 🔒 Encapsulamento

* Atributos privados
* Uso de getters e setters

---

### 🧬 Herança

* Criação da classe abstrata `Veiculo`
* `Caminhao` e `Moto` herdam de `Veiculo`

---

### 🔗 Associação

* Classe `Rota` agora trabalha com `Veiculo`
* Permite flexibilidade (Moto ou Caminhão)

---

### 🏗️ Construtores

* Inicialização segura dos objetos
* Eliminação de atributos soltos

---

### 🧹 Clean Code

* Nomes descritivos
* Código organizado em pacotes

---

### ⚠️ Validação

* Capacidade de carga não pode ser negativa

---

## 📂 Estrutura do projeto

```
src/
 ├── model/
 ├── service/
 └── main/
```

---

## ▶️ Execução

Ao executar o sistema, a saída esperada é:

```
Levando pacote BR999 no veículo ABC1234
```

---

## 🧩 Diagrama UML

O diagrama foi desenvolvido utilizando o Astah UML, representando:

* Herança entre classes
* Associações entre objetos

---

## 🚀 Tecnologias utilizadas

* Java
* Astah UML
* IntelliJ IDEA
