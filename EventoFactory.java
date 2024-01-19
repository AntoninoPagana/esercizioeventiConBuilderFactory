import java.time.OffsetDateTime;

//Prova Pattern Factory *Non consegna dell'esercizio*
public class EventoFactory {
    public static Evento getEvento(OffsetDateTime dateTime, EnumTipoEvento enumTipoEvento, String note) {
        return switch (enumTipoEvento) {
            case PROMEMORIA -> new Promemoria(dateTime, enumTipoEvento, note);
            case RIUNIONE -> new Riunione(dateTime, enumTipoEvento, note);
        };
    }
}


