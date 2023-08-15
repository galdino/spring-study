package com.galdino.ufood;

import com.galdino.ufood.notification.EmailNotifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Bean
    public EmailNotifier emailNotifier() {
        EmailNotifier notifier = new EmailNotifier("smtp.gmail.com");
        notifier.setUpperCase(true);

        return notifier;
    }
}
