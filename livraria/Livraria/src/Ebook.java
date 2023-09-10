public class Ebook extends Livraria {
    private String formato;

    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
}
