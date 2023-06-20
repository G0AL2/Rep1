package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    public static int f8485a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f8486b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8487c;

    /* renamed from: d  reason: collision with root package name */
    private final m f8488d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<a> f8489e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f8490f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f8491g;

    /* renamed from: h  reason: collision with root package name */
    private int f8492h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(m mVar) {
        this.f8488d = mVar;
        Context L = mVar.L();
        this.f8487c = L;
        this.f8486b = (AudioManager) L.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void b() {
        if (v.a()) {
            this.f8488d.A().b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f8492h = f8485a;
        this.f8487c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f8488d.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        this.f8488d.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    private void b(final int i10) {
        if (this.f8491g) {
            return;
        }
        if (v.a()) {
            v A = this.f8488d.A();
            A.b("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f8490f) {
            for (final a aVar : this.f8489e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.h.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.a(i10);
                    }
                });
            }
        }
    }

    private void c() {
        if (v.a()) {
            this.f8488d.A().b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f8487c.unregisterReceiver(this);
        this.f8488d.aj().unregisterReceiver(this);
    }

    public int a() {
        return this.f8486b.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f8490f) {
            if (this.f8489e.contains(aVar)) {
                return;
            }
            this.f8489e.add(aVar);
            if (this.f8489e.size() == 1) {
                b();
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f8490f) {
            if (this.f8489e.contains(aVar)) {
                this.f8489e.remove(aVar);
                if (this.f8489e.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f8486b.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8491g = true;
            this.f8492h = this.f8486b.getRingerMode();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f8491g = false;
            if (this.f8492h != this.f8486b.getRingerMode()) {
                this.f8492h = f8485a;
                b(this.f8486b.getRingerMode());
            }
        }
    }
}
