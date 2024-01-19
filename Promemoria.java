import java.time.OffsetDateTime;

public class Promemoria implements Evento {
    private final OffsetDateTime dataEOra;
    private final EnumTipoEvento tipo;
    private String note;

    public Promemoria(OffsetDateTime dataEOra, EnumTipoEvento tipo, String note) {
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

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Promemoria{" +
                "dataEOra=" + dataEOra +
                ", tipo=" + tipo +
                '}';
    }
}
