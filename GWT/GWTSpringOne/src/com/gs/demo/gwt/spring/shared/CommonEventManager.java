/**
 * File :: com.gs.demo.gwt.spring.client.CommonEventManager
 * Date :: 07-May-2013
 */
package com.gs.demo.gwt.spring.shared;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.gs.demo.gwt.spring.shared.evt.MessageUpdateListener;
import com.gs.demo.gwt.spring.shared.evt.MessageUpdatedEvent;

/**
 * @author Sabuj Das | sabuj.das@gmail.com
 *
 */
public final class CommonEventManager implements HasHandlers{

	private static CommonEventManager manager;
	private HandlerManager handlerManager;
	
	private CommonEventManager() {
		handlerManager = new HandlerManager(this);
	}
	
	/**
	 * Thread-safe instance creator
	 * @return
	 */
	public static CommonEventManager getInstance() {
		if(null != manager)
			return manager;
		synchronized (CommonEventManager.class) {
			if(null == manager)
				manager = new CommonEventManager();
		}
		return manager;
	}



	public void fireEvent(GwtEvent<?> event) {
		handlerManager.fireEvent(event);
	}

	public HandlerRegistration addMessageUpdateListener(
            MessageUpdateListener handler) {
        return handlerManager.addHandler(MessageUpdatedEvent.TYPE, handler);
    }


}
