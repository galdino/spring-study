package com.galdino.ufood.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("email.notifier")
public class NotifierProperties {

    /**
     * E-mail server host
     */
    private String serverHost;
    /**
     * E-mail server port
     */
    private int serverPort = 25;

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }
}
