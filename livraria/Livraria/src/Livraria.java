public abstract class Livraria {
    String titulo;
    String autor;
    boolean reservado;
    boolean emprestado;

    public Livraria(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.reservado = false;
        this.emprestado = false;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println(titulo + " foi reservado com sucesso.");
        } else {
            System.out.println(titulo + " já está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva de " + titulo + " foi cancelada.");
        } else {
            System.out.println(titulo + " não está reservado.");
        }
    }

    public void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            System.out.println(titulo + " foi emprestado com sucesso.");
        } else if (!reservado) {
            System.out.println("Você precisa reservar " + titulo + " primeiro.");
        } else {
            System.out.println(titulo + " já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println(titulo + " foi devolvido com sucesso.");
        } else {
            System.out.println(titulo + " não está emprestado.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
