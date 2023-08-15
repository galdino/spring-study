package com.galdino.ufood.service;

import com.galdino.ufood.model.Client;
import com.galdino.ufood.notification.Notifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivationClientService {

    @Autowired
    private Notifier notifier;

//    @Autowired
//    public ActivationClientService(Notifier notifier) {
//        this.notifier = notifier;
//    }

//    public ActivationClientService(String any) {
//
//    }

    public void activate(Client client) {
        client.activate();

        notifier.notify(client, "Your registration in the system is active!");
    }

//    @Autowired
//    public void setNotifier(Notifier notifier) {
//        this.notifier = notifier;
//    }
}
