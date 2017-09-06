
package Model;

public class ar {
    private String indice;
    private String categoria;
    private String endereco;
    private String mensagem;

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public ar(String indice, String categoria, String endereco, String mensagem) {
        this.indice = indice;
        this.categoria = categoria;
        this.endereco = endereco;
        this.mensagem = mensagem;
    }
    
    
    public ar(){
        this("",",","","");
    }
}
