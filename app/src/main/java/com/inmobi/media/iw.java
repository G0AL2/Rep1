package com.inmobi.media;

import android.location.LocationManager;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiClient;
import com.inmobi.media.ge;
import com.inmobi.media.it;
import java.util.UUID;

/* compiled from: SignalsComponent.java */
/* loaded from: classes3.dex */
public class iw {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25808a = "iw";

    /* renamed from: b  reason: collision with root package name */
    private it f25809b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25810c;

    /* compiled from: SignalsComponent.java */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final iw f25811a = new iw((byte) 0);
    }

    /* synthetic */ iw(byte b10) {
        this();
    }

    public static iw a() {
        return a.f25811a;
    }

    public static ir d() {
        return new ir(((ge) fs.a("signals", ho.f(), null)).f());
    }

    public static ge.b e() {
        return ((ge) fs.a("signals", ho.f(), null)).ice;
    }

    public static ge.c f() {
        return ((ge) fs.a("signals", ho.f(), null)).unifiedIdServiceConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g() {
        String m10 = ho.m();
        jd c10 = jf.c();
        String e10 = c10 != null ? c10.e() : null;
        return (m10 == null || a(m10).locationEnabled) && (e10 == null || c10.a()) && (!(c10 != null && c10.d()) || a(e10).locationEnabled);
    }

    public static boolean h() {
        String m10 = ho.m();
        jd c10 = jf.c();
        String e10 = c10 != null ? c10.e() : null;
        return (m10 == null || a(m10).f25528w.vwe) && (e10 == null || c10.b()) && (!(c10 != null && c10.d()) || a(e10).f25528w.vwe);
    }

    private synchronized void i() {
        if (this.f25810c) {
            return;
        }
        this.f25810c = true;
        if (this.f25809b == null) {
            this.f25809b = new it();
        }
        this.f25809b.a();
    }

    public final synchronized void b() {
        fs.a("signals", ho.f(), null);
        ih a10 = ih.a();
        boolean z10 = e().sessionEnabled;
        a10.f25772d = z10;
        if (!z10) {
            a10.f25769a = null;
            a10.f25770b = 0L;
            a10.f25771c = 0L;
        }
        iv a11 = iv.a();
        iw iwVar = a.f25811a;
        if (e().sessionEnabled) {
            ih.a().f25769a = UUID.randomUUID().toString();
            ih.a().f25770b = System.currentTimeMillis();
            ih.a().f25771c = 0L;
            a11.f25806f = SystemClock.elapsedRealtime();
            a11.f25801a = 0L;
            a11.f25802b = 0L;
            a11.f25803c = 0L;
            a11.f25804d = 0L;
            a11.f25805e = 0L;
            a11.f25806f = 0L;
        }
        if (h()) {
            i();
        }
        if (g()) {
            iu.a().b();
        }
    }

    public final synchronized void c() {
        iv.a();
        iv.b();
        if (this.f25810c) {
            this.f25810c = false;
            it itVar = this.f25809b;
            if (itVar != null) {
                it.a.a(itVar.f25790a, true);
                it.a aVar = itVar.f25790a;
                iw iwVar = a.f25811a;
                aVar.sendEmptyMessageDelayed(2, e().stopRequestTimeout * 1000);
            }
        }
        iu a10 = iu.a();
        if (iu.c()) {
            LocationManager locationManager = a10.f25794a;
            if (locationManager != null) {
                locationManager.removeUpdates(a10);
            }
            GoogleApiClient googleApiClient = a10.f25795b;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        a10.f25795b = null;
    }

    private iw() {
    }

    public static ge.b a(String str) {
        return ((ge) fs.a("signals", str, null)).ice;
    }
}
