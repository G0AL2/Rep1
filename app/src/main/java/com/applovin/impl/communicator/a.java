package com.applovin.impl.communicator;

import android.content.Context;
import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7136a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f7137b = new HashSet(32);

    /* renamed from: c  reason: collision with root package name */
    private final Object f7138c = new Object();

    public a(Context context) {
        this.f7136a = context;
    }

    private b a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (b bVar : this.f7137b) {
            if (str.equals(bVar.a()) && appLovinCommunicatorSubscriber.equals(bVar.b())) {
                return bVar;
            }
        }
        return null;
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber == null || !StringUtils.isValidString(str)) {
            if (v.a()) {
                v.i("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
                return false;
            }
            return false;
        }
        synchronized (this.f7138c) {
            b a10 = a(str, appLovinCommunicatorSubscriber);
            if (a10 == null) {
                b bVar = new b(str, appLovinCommunicatorSubscriber);
                this.f7137b.add(bVar);
                AppLovinBroadcastManager.getInstance(this.f7136a).registerReceiver(bVar, new IntentFilter(str));
                return true;
            }
            if (v.a()) {
                v.i("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
            }
            if (!a10.c()) {
                a10.a(true);
                AppLovinBroadcastManager.getInstance(this.f7136a).registerReceiver(a10, new IntentFilter(str));
            }
            return true;
        }
    }

    public boolean a(String str) {
        synchronized (this.f7138c) {
            for (b bVar : this.f7137b) {
                if (str.equals(bVar.a())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        b a10;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f7138c) {
                a10 = a(str, appLovinCommunicatorSubscriber);
            }
            if (a10 != null) {
                a10.a(false);
                AppLovinBroadcastManager.getInstance(this.f7136a).unregisterReceiver(a10);
            }
        }
    }
}
