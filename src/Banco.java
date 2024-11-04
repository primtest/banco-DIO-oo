import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;

    private List<String> listaClientes;

    public Banco() {
        this.listaClientes = new ArrayList<>();
    }

    public void addCliente(String nome) {
        listaClientes.add(nome);
    }

    public String verClientes() {
        return listaClientes.toString();
    }



}
