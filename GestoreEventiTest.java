import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GestoreEventiTest {
    GestoreEventi testing = new GestoreEventi();

    @Test
    void stampaInformazioniEventi() {

        List<Evento> listaEventi = new ArrayList<>();
        Evento eventoTest = new Promemoria(OffsetDateTime.parse("2024-01-24T18:00:00Z"), EnumTipoEvento.PROMEMORIA, "Nota");
        try {
            listaEventi.add(eventoTest);
            testing.stampaInformazioniEventi(listaEventi);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertTrue(listaEventi.contains(eventoTest));
    }

    @Test
    void ordinaPerDataEOra() {
        //dubbio
        List<Evento> listaEventi = new ArrayList<>();
        List<Evento> listaEventiOrdinata = new ArrayList<>();

        Evento evento1 = new Riunione(OffsetDateTime.parse("2024-01-12T15:30:00Z"), EnumTipoEvento.RIUNIONE, "Nota");
        Evento evento2 = new Riunione(OffsetDateTime.parse("2024-01-22T17:30:00Z"), EnumTipoEvento.RIUNIONE, "Nota");
        Evento evento3 = new Promemoria(OffsetDateTime.parse("2024-01-24T18:00:00Z"), EnumTipoEvento.PROMEMORIA, "Nota");
        Evento evento4 = new Promemoria(OffsetDateTime.parse("2024-02-05T11:00:00Z"), EnumTipoEvento.PROMEMORIA, "Nota");

        listaEventi.add(evento4);
        listaEventi.add(evento2);
        listaEventi.add(evento3);
        listaEventi.add(evento1);

        // Inserisco gia in ordine
        listaEventiOrdinata.add((evento1));
        listaEventiOrdinata.add(evento2);
        listaEventiOrdinata.add(evento3);
        listaEventiOrdinata.add(evento4);

        try {
            testing.ordinaPerDataEOra(listaEventi);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(listaEventiOrdinata, listaEventi);
    }

    @Test
    void filtraEventiFuturi() {
    }
}