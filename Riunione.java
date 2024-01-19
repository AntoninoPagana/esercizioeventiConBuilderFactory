import java.time.OffsetDateTime;

public class Riunione implements Evento {
    private final OffsetDateTime dataEOra;
    private final EnumTipoEvento tipo;
    private String note;

    public Riunione(OffsetDateTime dataEOra, EnumTipoEvento tipo, String note) {
        this.dataEOra = dataEOra;
        this.tipo = tipo;
        this.note = note;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return dataEOra;
    }

    @Override
    public EnumTipoEvento getTipo() {
        return tipo;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Riunione{" +
                "dataEOra=" + dataEOra +
                ", tipo=" + tipo +
                '}';
    }
}
