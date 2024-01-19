import java.time.OffsetDateTime;

public class BuilderEvento {
    private OffsetDateTime dataEOra;
    private EnumTipoEvento tipo;
    private String note;

    public BuilderEvento(OffsetDateTime dataEOra, EnumTipoEvento tipo) {
        this.dataEOra = dataEOra;
        this.tipo = tipo;
    }

    public BuilderEvento setDataEOra(OffsetDateTime dataEOra) {
        this.dataEOra = dataEOra;
        return this;
    }


    public BuilderEvento setTipo(EnumTipoEvento tipo) {
        this.tipo = tipo;
        return this;
    }

    public BuilderEvento setNote(String note) {
        this.note = note;
        return this;
    }

    public Evento build() {

        return EventoFactory.getEvento(this.dataEOra, this.tipo, this.note);

    }

}

