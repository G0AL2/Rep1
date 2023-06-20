package com.vehiclecloud.app.videofetch.firebase.messaging;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.i;
import androidx.core.app.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.extensions.FirebaseAnalyticsExtensionsKt;
import com.vehiclecloud.app.videofetch.rnnotification.RNNotificationModule;
import downloader.video.download.free.R;
import ee.u;
import free.files.downloader.save.video.manager.MainActivity;
import qe.k;
import timber.log.a;
import we.e;
import we.e0;
import we.f0;
import we.n1;
import we.q;
import we.s0;
import we.u1;

/* compiled from: DownloadFirebaseMessagingService.kt */
/* loaded from: classes3.dex */
public final class DownloadFirebaseMessagingService extends FirebaseMessagingService {
    private FirebaseAnalytics mFirebaseAnalytics;
    private l mNotificationManager;
    private e0 scope;

    /* JADX INFO: Access modifiers changed from: private */
    public final void notify(RemoteMessage remoteMessage) {
        Bundle bundle = new Bundle();
        FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "title", remoteMessage.getData().get("title"));
        FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "body", remoteMessage.getData().get("body"));
        FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "type", remoteMessage.getData().get("type"));
        FirebaseAnalyticsExtensionsKt.putAnalyticsString(bundle, "uri", remoteMessage.getData().get("uri"));
        i.e eVar = new i.e(getApplicationContext(), RNNotificationModule.PUSH_CHANNEL);
        String str = remoteMessage.getData().get("title");
        if (str != null) {
            eVar.k(str);
        }
        String str2 = remoteMessage.getData().get("body");
        if (str2 != null) {
            eVar.j(str2);
        }
        eVar.B(getString(R.string.app_name));
        eVar.w(true);
        eVar.E(remoteMessage.getSentTime());
        eVar.x(R.mipmap.ic_notification);
        eVar.h(16750848);
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        String str3 = remoteMessage.getData().get("uri");
        if (str3 != null) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        intent.putExtra(RNNotificationModule.EXTRA_NOTIFICATION, bundle);
        intent.putExtra(RNNotificationModule.EXTRA_SERVER_PARAMS, remoteMessage.getData().get("serverParams"));
        u uVar = u.f29813a;
        eVar.i(PendingIntent.getActivity(applicationContext, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728));
        Notification b10 = eVar.b();
        k.e(b10, "Builder(applicationConte…                }.build()");
        l lVar = this.mNotificationManager;
        FirebaseAnalytics firebaseAnalytics = null;
        if (lVar == null) {
            k.s("mNotificationManager");
            lVar = null;
        }
        lVar.h(-1, b10);
        RNNotificationModule.Companion companion = RNNotificationModule.Companion;
        FirebaseAnalytics firebaseAnalytics2 = this.mFirebaseAnalytics;
        if (firebaseAnalytics2 == null) {
            k.s("mFirebaseAnalytics");
        } else {
            firebaseAnalytics = firebaseAnalytics2;
        }
        companion.logEvent$app_orangeRelease(firebaseAnalytics, "push_receive", bundle);
        companion.postCastboxEvent$app_orangeRelease(this, "DeviceReceive", remoteMessage.getData().get("serverParams"));
    }

    @Override // android.app.Service
    public void onCreate() {
        q b10;
        super.onCreate();
        l lVar = null;
        b10 = n1.b(null, 1, null);
        this.scope = f0.a(b10.plus(s0.b()));
        l f10 = l.f(this);
        k.e(f10, "from(this)");
        this.mNotificationManager = f10;
        RNNotificationModule.Companion companion = RNNotificationModule.Companion;
        if (f10 == null) {
            k.s("mNotificationManager");
        } else {
            lVar = f10;
        }
        companion.createChannel$app_orangeRelease(this, lVar);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        k.e(firebaseAnalytics, "getInstance(this)");
        this.mFirebaseAnalytics = firebaseAnalytics;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        e0 e0Var;
        k.f(remoteMessage, "message");
        e0 e0Var2 = this.scope;
        if (e0Var2 == null) {
            k.s("scope");
            e0Var = null;
        } else {
            e0Var = e0Var2;
        }
        e.b(e0Var, u1.f38661a, null, new DownloadFirebaseMessagingService$onMessageReceived$1(this, remoteMessage, null), 2, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        e0 e0Var;
        k.f(str, IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY);
        a.f37331a.d("onNewToken: %s", str);
        e0 e0Var2 = this.scope;
        if (e0Var2 == null) {
            k.s("scope");
            e0Var = null;
        } else {
            e0Var = e0Var2;
        }
        e.b(e0Var, u1.f38661a, null, new DownloadFirebaseMessagingService$onNewToken$1(this, str, null), 2, null);
    }
}
