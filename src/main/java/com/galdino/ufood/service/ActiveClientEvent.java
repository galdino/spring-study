package com.galdino.ufood.service;

import com.galdino.ufood.model.Client;

public class ActiveClientEvent {
    private Client client;

    public ActiveClientEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
