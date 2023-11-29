package Es3.entities3;

public class Client {
    private String codiceCliente;
    private String nome, cognome;
    private String email;
    private String dataEntry;
//    Costruct

    public Client(String _codiceCliente, String _nome, String _cognome, String _email, String _dataEntry) {
        this.codiceCliente = _codiceCliente;
        this.nome = _nome;
        this.cognome = _cognome;
        this.email = _email;
        this.dataEntry = _dataEntry;
    }
}

