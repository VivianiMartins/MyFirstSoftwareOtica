package view;

import java.util.EventListener;

public interface LoginListener extends EventListener {

    /**
     * Invocado quando um novo voto � contabilizado na Enquete.
     * @param event Evento gerado pela Enquete.
     */
    public void novoLogin(LoginListener event);
    
  
}
