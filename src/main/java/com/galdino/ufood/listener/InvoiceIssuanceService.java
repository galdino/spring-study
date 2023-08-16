package com.galdino.ufood.listener;

import com.galdino.ufood.service.ActiveClientEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InvoiceIssuanceService {
    @EventListener
    public void activeClientListener(ActiveClientEvent event) {
        System.out.println("Issuing invoice to client " + event.getClient().getName());
    }
}
