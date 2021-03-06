/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 05/12/2018
Objetivo sucinto do programa: Cria a classe Conta que possui um atributo encapsulado pelos métodos set e get
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 56 a 63
*/
public class Conta {
    private String nome; // variável da instância

    // Método para definir o nome do objeto
    public void setNome(String nome){
        this.nome = nome; // Armazena o parâmetro nome no atributo nome
    }

    // Método para recuperar o nome do objeto
    public String getNome(){
        return nome; // Retorna o nome para o chamador
    }
}
