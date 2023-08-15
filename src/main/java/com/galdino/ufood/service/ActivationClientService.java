package com.galdino.ufood.service;

import com.galdino.ufood.model.Client;
import com.galdino.ufood.notification.Notifier;

public class ActivationClientService {
    private Notifier notifier;

    public ActivationClientService(Notifier notifier) {
        this.notifier = notifier;
        System.out.println("ActivationClientService" + notifier);
    }

    public void activate(Client client) {
        client.activate();

        notifier.notify(client, "Your registration in the system is active!");
    }
}
