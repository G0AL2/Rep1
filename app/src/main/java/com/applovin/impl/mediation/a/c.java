package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.m;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f7210c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f7211d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f7212e;

    private c(c cVar, com.applovin.impl.mediation.g gVar) {
        super(cVar.T(), cVar.J(), cVar.I(), gVar, cVar.f7216b);
        this.f7212e = new AtomicBoolean();
        this.f7210c = cVar.f7210c;
        this.f7211d = cVar.f7211d;
    }

    public c(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, null, mVar);
        this.f7212e = new AtomicBoolean();
        this.f7210c = new AtomicReference<>();
        this.f7211d = new AtomicBoolean();
    }

    public long A() {
        return b("ahdm", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.f8188x)).longValue());
    }

    public boolean B() {
        return b("susaode", (Boolean) this.f7216b.a(com.applovin.impl.sdk.c.a.f8187w)).booleanValue();
    }

    public String C() {
        return b("bcode", "");
    }

    public String D() {
        return a("mcode", "");
    }

    public boolean E() {
        return this.f7211d.get();
    }

    public void F() {
        this.f7211d.set(true);
    }

    public com.applovin.impl.sdk.b.c G() {
        return this.f7210c.getAndSet(null);
    }

    public AtomicBoolean H() {
        return this.f7212e;
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new c(this, gVar);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f7210c.set(cVar);
    }

    public long u() {
        long b10 = b("ad_expiration_ms", -1L);
        return b10 >= 0 ? b10 : a("ad_expiration_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.D)).longValue());
    }

    public long v() {
        long b10 = b("ad_hidden_timeout_ms", -1L);
        return b10 >= 0 ? b10 : a("ad_hidden_timeout_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.G)).longValue());
    }

    public boolean w() {
        if (b("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f7216b.a(com.applovin.impl.sdk.c.a.H)).booleanValue();
    }

    public long x() {
        long b10 = b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return b10 >= 0 ? b10 : a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.I)).longValue());
    }

    public long y() {
        if (q() > 0) {
            return SystemClock.elapsedRealtime() - q();
        }
        return -1L;
    }

    public long z() {
        long b10 = b("fullscreen_display_delay_ms", -1L);
        return b10 >= 0 ? b10 : ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.f8186v)).longValue();
    }
}
