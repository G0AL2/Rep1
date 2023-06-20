package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes3.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private final cb.e f22758a = new cb.e("AssetPackExtractionService");

    /* renamed from: b  reason: collision with root package name */
    Context f22759b;

    /* renamed from: c  reason: collision with root package name */
    u2 f22760c;

    /* renamed from: d  reason: collision with root package name */
    a0 f22761d;

    /* renamed from: e  reason: collision with root package name */
    private y f22762e;

    /* renamed from: f  reason: collision with root package name */
    private NotificationManager f22763f;

    private final synchronized void c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j10 = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i10 >= 26 ? new Notification.Builder(this.f22759b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10) : new Notification.Builder(this.f22759b).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (i10 >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f22758a.f("Starting foreground service.", new Object[0]);
        this.f22760c.b(true);
        if (i10 >= 26) {
            this.f22763f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i10 = bundle.getInt("action_type");
        cb.e eVar = this.f22758a;
        Integer valueOf = Integer.valueOf(i10);
        eVar.c("updateServiceState: %d", valueOf);
        if (i10 == 1) {
            c(bundle);
        } else if (i10 == 2) {
            b();
        } else {
            this.f22758a.e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.f22758a.f("Stopping service.", new Object[0]);
        this.f22760c.b(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f22762e;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f22758a.c("onCreate", new Object[0]);
        u1.b(getApplicationContext()).a(this);
        this.f22762e = new y(this.f22759b, this, this.f22761d);
        this.f22763f = (NotificationManager) this.f22759b.getSystemService("notification");
    }
}
