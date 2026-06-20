<h1 style="text-align:center;">Instituto Federal do Acre</h1>

# Instituto Federal do Acre
# Campus Rio Branco
# Curso de Sistemas para Internete

## Projeto Final — Programação Orientada a Objetos com Java

### Objetivo

Aplicar os conceitos discutidos durante a disciplina de Orientação a Objetos, desenvolvendo em grupo de até quatro pessoas uma aplicação Java completa. O projeto deverá contemplar documentação, modelagem, armazenamento de dados (simulado) e apresentação final.

---

### Tema do Projeto

O grupo deve identificar um problema do mundo real e propor uma solução automatizada por meio de um sistema orientado a objetos. 

---

### 📄 Entregáveis

#### 1. Documentação

A documentação deve ser entregue em formato PDF ou arquivo de markdown e conter:
- **Título do projeto**
- **Integrantes do grupo** (nomes completos)
- **Descrição geral do problema e da solução**
- **Requisitos funcionais** (mínimo quatro)
- **Casos de uso** (mínimo quatro, em diagrama ou descrição textual dos fluxos principais)
- **Diagrama de classes** com:
  - Classes de modelo
  - Relacionamentos (associação, herança, composição, etc.)
  - Atributos e métodos principais
- **Diagrama de máquina de estados**

Não há um template padrão para este documento, mas o grupo deve apresentar um documento organizado e bem formatado. 

---

#### 2. Protótipo funcional (código)

- Linguagem: Java
- Armazenamento: simulação de persistência de dados em mapas ou listas.
- Interface com o usuário: escolha do grupo. Minimamente textual (menus interativos), que foi a abordagem usada nas aulas. A qualidade da interface **não é** um item de avaliação 
- O projeto deve seguir **boas práticas de programação orientada a objetos**, como:
  - Encapsulamento;
  - Herança; 
  - Polimorfismo;
  - Uso de interfaces;
  - Uso de coleções (`List`, `Map`, etc. se fizer sentido);
  - Lançamento e tratamento de exceções, com ao menos dois tipos de exceções customizadas.

### Organização sugerida de pacotes:

O projeto deve estar organizado em pacotes, de acordo com a necessidade do projeto. Um sugestão de árvore do projeto é a seguinte:
```textplan
projeto/
model/ → classes de domínio
view/ → classe principal (main) e interface com o usuário (menus ou GUI)
control/ → classe(s) de controle e regras de negócios
persistencia/ → CRUD simulado

```


---

### Apresentação

Cada grupo deverá apresentar o projeto na forma de seminário, com duração máxima de 30 minutos.

A apresentação deve incluir:

- Descrição do problema abordado
- Explicação da modelagem (casos de uso e diagrama de classes)
- Demonstração do protótipo em funcionamento
- Pontos positivos e dificuldades enfrentadas durante o desenvolvimento

---

### Data de Entrega

**Todos os materiais deverão ser entregues no dia 06/07/2026.**

O grupo deverá publicar o projeto no GitHub, incluindo um arquivo `README.md` com instruções de execução do sistema. O projeto deve ser público para consulta, com o link compartilhado com o professor como resposta ao trabalho da disciplina no Suap.

### Avaliação

Esse projeto contempla duas das três avaliações da etapa 2 da disciplina de Orientação a Objetos. As entregas da documentação e do protótipo funcional forma uma avaliação, que tem nota em grupo. A apresentação é outra avaliação, sendo esta individual. 