# Consultas com JDBC

Existem 3 interfaces para montar comandos SQL:

- **Statement** - Executar SQL comuns
- **PreparedStatement** - Executar SQL paraentrizáveis
- **CallableStatement** - Executar stored procedures

## PreparedStatement 
Preferir **PreparedStatement** ao **Statement** quando for parametrizar a consulta pois:

- Previne SQL Injection
- Melhora legibilidade
- Melhora desempenho

## Existem 3 métodos para executar comandos SQL:

- **execute** - Pode executar qualquer tipo de SQL
- **executeQuery** - Usado para executar "SELECT"
- **executeUpdate** - Usado para commandos de alteração de bancos
de dados (INSERT, UPDATE, DELETE, CREATE, ALTER)

## ResultSet

**ResultSet** - objeto que contem os dados de uma determinada consulta
no banco de dados (normalmente com SELECT)

São utlizados os **métodos getters para buscar dados**
 do ResultSet. Tais como: **getInt**, **getFloat** e **getString**.

O método **next()** é utilizado para percorrer os registros do **ResultSet**. (Normalmente utlizado junto com **while**)


