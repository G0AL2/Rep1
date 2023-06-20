package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b  reason: collision with root package name */
    private final String f7140b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<AppLovinCommunicatorSubscriber> f7141c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f7139a = true;

    /* renamed from: d  reason: collision with root package name */
    private final Set<CommunicatorMessageImpl> f7142d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Object f7143e = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f7140b = str;
        this.f7141c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    public String a() {
        return this.f7140b;
    }

    public void a(boolean z10) {
        this.f7139a = z10;
    }

    public AppLovinCommunicatorSubscriber b() {
        return this.f7141c.get();
    }

    public boolean c() {
        return this.f7139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f7141c.get();
            b bVar = (b) obj;
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = bVar.f7141c.get();
            if (a().equals(bVar.a())) {
                if (appLovinCommunicatorSubscriber != null) {
                    if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                        return true;
                    }
                } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f7140b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = this.f7141c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (b() == null) {
            if (v.a()) {
                v.i("AppLovinCommunicator", "Message received for GC'd subscriber");
                return;
            }
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z10 = false;
        synchronized (this.f7143e) {
            if (!this.f7142d.contains(communicatorMessageImpl)) {
                this.f7142d.add(communicatorMessageImpl);
                z10 = true;
            }
        }
        if (z10) {
            b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }
}
