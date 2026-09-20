package com.kundan.day16june2026;

public class NotificationService {
    public static String send(Notification n){
        return  switch (n) {
            case Email e ->
                "Email sent to "+e.email();
            case SMS s ->
                "SMS sent to "+s.mobile();
            case Push p ->
                "Push notification sent to "+p.deviceId();
        };
    }
}
