package Observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<EventListerners> listerners = new ArrayList();
    private List<EventListerners> listernersAdd = new ArrayList();
    private List<EventListerners> listernersRemove = new ArrayList();

    public void subscribe(EventListerners el) {
        if (el != null) {
            listernersAdd.add(el);
        }
    }

    public void unsubcribe(EventListerners el) {
        if (el != null) {
            listernersRemove.add(el);
        }
    }

    private void remove() {
        if (listernersRemove.size() > 0) {
            for (var nr : listernersRemove) {
                listerners.remove(nr);
            }

            listernersRemove.clear();
        }
    }

    private void adicionar() {
        if (listernersAdd.size() > 0) {
            for (var nr : listernersAdd) {
                listerners.add(nr);
            }

            listernersAdd.clear();
        }
    }

    public void notify(String mensagem) {
        remove();
        adicionar();
        for (var l : listerners) {
            l.update(mensagem);
        }
    }
}
