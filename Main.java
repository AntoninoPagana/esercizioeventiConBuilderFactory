import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //Creazione lista di eventi + creazione eventi + eventi aggiunti alla lista.
        List<Evento> listaEventi = new ArrayList<>();
        Evento evento1 = new Riunione(OffsetDateTime.parse("2024-01-12T15:30:00Z"), EnumTipoEvento.RIUNIONE, "");
        Evento evento2 = new Riunione(OffsetDateTime.parse("2024-01-22T17:30:00Z"), EnumTipoEvento.RIUNIONE, "");
        Evento evento3 = new Promemoria(OffsetDateTime.parse("2024-01-24T18:00:00Z"), EnumTipoEvento.PROMEMORIA, "");
        Evento evento4 = new Promemoria(OffsetDateTime.parse("2024-02-05T11:00:00Z"), EnumTipoEvento.PROMEMORIA, "");
        listaEventi.add(evento1);
        listaEventi.add(evento2);
        listaEventi.add(evento3);
        listaEventi.add(evento4);

        //Creo istanza del GestoreEventi.
        GestoreEventi gestoreEventi = new GestoreEventi();

        //Stampa lista eventi normale.
        System.out.println("(Lista eventi)");
        gestoreEventi.stampaInformazioniEventi(listaEventi);

        System.out.println("----------------------------------------------");

        //Ordinamento per data e ora + stampa.
        gestoreEventi.ordinaPerDataEOra(listaEventi);
        System.out.println("(Lista eventi ordinata per data e ora)");
        gestoreEventi.stampaInformazioniEventi(listaEventi);

        System.out.println("----------------------------------------------");

        //Lista eventi filtrata con solo eventi futuri + stampa.
        gestoreEventi.filtraEventiFuturi(listaEventi);
        System.out.println("(Lista eventi con solo eventi futuri)");
        gestoreEventi.stampaInformazioniEventi(listaEventi);

        System.out.println("----------------------------------------------");

        //Prova Pattern Factory *Non consegna dell'esercizio*
        System.out.println("(Lista con aggiunta evento tramite Factory");
        Evento eventoProva = EventoFactory.getEvento(OffsetDateTime.parse("2024-03-15T11:30:00Z"), EnumTipoEvento.RIUNIONE, "");
        listaEventi.add(eventoProva);
        gestoreEventi.stampaInformazioniEventi(listaEventi);

        System.out.println("----------------------------------------------");

        //Prova builder
        System.out.println("(Lista con aggiunta evento tramite Builder con nota)");
        BuilderEvento builder = new BuilderEvento(OffsetDateTime.parse("2024-01-12T15:30:00Z"), EnumTipoEvento.RIUNIONE);
        Evento riunione = builder.build();

        builder.setNote("abbiamo bisogno di aiuto tanto molto");

        Evento riunioneNuovoConNote = builder.build();
        listaEventi.add(riunioneNuovoConNote);
        gestoreEventi.stampaInformazioniEventi(listaEventi);

    }
}