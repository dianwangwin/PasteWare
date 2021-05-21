package me.eskid.nhacks.manager;

import me.eskid.nhacks.NHacksWare;
import me.eskid.nhacks.features.modules.client.HUD;
import me.eskid.nhacks.features.notifications.Notifications;

import java.util.ArrayList;

public class NotificationManager {
    private final ArrayList<Notifications> notifications = new ArrayList();

    public void handleNotifications(int posY) {
        for (int i = 0; i < this.getNotifications().size(); ++i) {
            this.getNotifications().get(i).onDraw(posY);
            posY -= NHacksWare.moduleManager.getModuleByClass(HUD.class).renderer.getFontHeight() + 5;
        }
    }

    public void addNotification(String text, long duration) {
        this.getNotifications().add(new Notifications(text, duration));
    }

    public ArrayList<Notifications> getNotifications() {
        return this.notifications;
    }
}

