
public class Prioridade {
    
    private String nome;
    private int prioridade;

    public Prioridade() {

    }

    public String getPrioridadeString (){
       if(this.prioridade == 1){
            return "1";
       } else if (this.prioridade == 2){
            return "2";
       }else if (this.prioridade == 3){
            return "3";
       } else {
            return "4";
       }   
    }

    public Prioridade(String tipo, int prioridade) {
        this.nome = tipo;
        this.prioridade = prioridade;
    }

    public String getTipo() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.nome = tipo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return  nome + ", com prioridade " + getPrioridadeString() ;
    }      
}