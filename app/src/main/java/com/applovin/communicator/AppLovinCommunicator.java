package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.communicator.a;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: a  reason: collision with root package name */
    private static AppLovinCommunicator f6699a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f6700b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private m f6701c;

    /* renamed from: d  reason: collision with root package name */
    private v f6702d;

    /* renamed from: e  reason: collision with root package name */
    private final a f6703e;

    /* renamed from: f  reason: collision with root package name */
    private final MessagingServiceImpl f6704f;

    private AppLovinCommunicator(Context context) {
        this.f6703e = new a(context);
        this.f6704f = new MessagingServiceImpl(context);
    }

    private void a(String str) {
        v vVar = this.f6702d;
        if (vVar != null) {
            vVar.b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f6700b) {
            if (f6699a == null) {
                f6699a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f6699a;
    }

    public void a(m mVar) {
        this.f6701c = mVar;
        this.f6702d = mVar.A();
        if (v.a()) {
            a("Attached SDK instance: " + mVar + "...");
        }
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f6704f;
    }

    public boolean hasSubscriber(String str) {
        return this.f6703e.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f6701c.ag().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f6703e.a(appLovinCommunicatorSubscriber, str)) {
                this.f6704f.maybeFlushStickyMessages(str);
            } else if (v.a()) {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f6701c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (v.a()) {
                a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            }
            this.f6703e.b(appLovinCommunicatorSubscriber, str);
        }
    }
}
