package Es3.entities3;

public class Client {
    private int codiceCliente;
    private String nome, cognome;
    private String email;
    private String dataEntry;
//    Costruct

    public Client(int _codiceCliente, String _nome, String _cognome, String _email, String _dataEntry) {
        this.codiceCliente = _codiceCliente;
        this.nome = _nome;
        this.cognome = _cognome;
        this.email = _email;
        this.dataEntry = _dataEntry;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}