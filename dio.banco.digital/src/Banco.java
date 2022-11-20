import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private final List<IConta> contas = new ArrayList<IConta>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(IConta conta){
        this.contas.add(conta);
    }

    public void getContas(){
        System.out.println(String.format("Contas registadas no banco , %s",nome));
        for (IConta con: this.contas) {
            System.out.println(con);

        }
    }

}
