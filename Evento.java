import java.time.OffsetDateTime;

public interface Evento {
    OffsetDateTime getDataOra();

    EnumTipoEvento getTipo();

    String getNote();

}
