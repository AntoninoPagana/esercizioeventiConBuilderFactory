import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestoreEventi {
    public void stampaInformazioniEventi(List<Evento> listaEventi) throws Exception {
        if (!listaEventi.isEmpty()) {
            for (Evento evento : listaEventi) {
                System.out.println("Data e Ora: " + evento.getDataOra().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + " |" + " Tipo: " + evento.getTipo() + " | " + " Nota: " + evento.getNote());
            }
        } else {
            throw new Exception("Lista vuota!");
        }
    }

    public void ordinaPerDataEOra(List<Evento> listaEventi) throws Exception {
        if (!listaEventi.isEmpty()) {
            listaEventi.sort(Comparator.comparing(Evento::getDataOra));
        } else {
            throw new Exception("Lista vuota!");
        }
    }

    public void filtraEventiFuturi(List<Evento> listaEventi) throws Exception {
        OffsetDateTime adesso = OffsetDateTime.now();
        List<Evento> eventiFuturi = new ArrayList<>();

        if (!listaEventi.isEmpty()) {
            for (Evento evento : listaEventi) {
                if (evento.getDataOra().isAfter(adesso)) {
                    eventiFuturi.add(evento);
                }
            }
            listaEventi.clear();
            listaEventi.addAll(eventiFuturi);
        } else {
            throw new Exception("Lista vuota!");
        }
    }
}
