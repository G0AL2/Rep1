package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<e> f8816a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final o f8817b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8818c;

    private e(long j10, com.applovin.impl.sdk.m mVar, final Runnable runnable) {
        this.f8817b = o.a(j10, mVar, new Runnable() { // from class: com.applovin.impl.sdk.utils.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.a();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f8818c = mVar;
        f8816a.add(this);
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public static e a(long j10, com.applovin.impl.sdk.m mVar, Runnable runnable) {
        return new e(j10, mVar, runnable);
    }

    public void a() {
        this.f8817b.d();
        this.f8818c.aj().unregisterReceiver(this);
        f8816a.remove(this);
    }

    public long b() {
        return this.f8817b.a();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8817b.b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f8817b.c();
        }
    }
}
