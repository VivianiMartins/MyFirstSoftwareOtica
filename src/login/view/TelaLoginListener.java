package login.view;

import java.util.EventListener;

public interface TelaLoginListener extends EventListener {

    /**
     * Invocado quando um novo voto � contabilizado na Enquete.
     * @param event Evento gerado pela Enquete.
     */
    public void novoLogin(TelaLoginListener event);
    
  
}
