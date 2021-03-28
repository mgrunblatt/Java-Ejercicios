public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado=false;
    }

    public Libro (){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo(){
        this.prestado=true;
    }

    public void devolucion(){
        this.prestado=false;
    }


    @Override
    public String toString() {
        return "" + this.titulo+", "+this.isbn+", "+this.autor+"";
    }
}
