package com.galdino.ufood.notification;

import com.galdino.ufood.model.Client;

public interface Notifier {
    void notify(Client client, String message);
}
