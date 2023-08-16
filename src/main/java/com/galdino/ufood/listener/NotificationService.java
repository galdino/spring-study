package com.galdino.ufood.listener;

import com.galdino.ufood.notification.Notifier;
import com.galdino.ufood.notification.NotifierType;
import com.galdino.ufood.notification.UrgencyLevel;
import com.galdino.ufood.service.ActiveClientEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    @NotifierType(UrgencyLevel.NORMAL)
    @Autowired
    private Notifier notifier;
    @EventListener
    public void activeClientListener(ActiveClientEvent event) {
//        System.out.println("Client " + event.getClient().getName() + " is activated!");
        notifier.notify(event.getClient(), "Your registration in the system is active!");
    }
}
