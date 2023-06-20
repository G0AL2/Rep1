package com.applovin.impl.sdk.d;

import android.annotation.TargetApi;
import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.d.c;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.h;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final m f8303a;

    /* renamed from: b  reason: collision with root package name */
    private final g f8304b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f8305c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8306d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final long f8307e;

    /* renamed from: f  reason: collision with root package name */
    private long f8308f;

    /* renamed from: g  reason: collision with root package name */
    private long f8309g;

    /* renamed from: h  reason: collision with root package name */
    private long f8310h;

    public d(AppLovinAdImpl appLovinAdImpl, m mVar) {
        if (appLovinAdImpl == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8303a = mVar;
        this.f8304b = mVar.T();
        c.a a10 = mVar.ac().a(appLovinAdImpl);
        this.f8305c = a10;
        a10.a(b.f8273a, appLovinAdImpl.getSource().ordinal()).a();
        this.f8307e = appLovinAdImpl.getCreatedAtMillis();
    }

    public static void a(long j10, AppLovinAdBase appLovinAdBase, m mVar) {
        if (appLovinAdBase == null || mVar == null) {
            return;
        }
        mVar.ac().a(appLovinAdBase).a(b.f8274b, j10).a();
    }

    public static void a(AppLovinAdBase appLovinAdBase, m mVar) {
        if (appLovinAdBase == null || mVar == null) {
            return;
        }
        mVar.ac().a(appLovinAdBase).a(b.f8275c, appLovinAdBase.getFetchLatencyMillis()).a(b.f8276d, appLovinAdBase.getFetchResponseSize()).a();
    }

    private void a(b bVar) {
        synchronized (this.f8306d) {
            if (this.f8308f > 0) {
                this.f8305c.a(bVar, System.currentTimeMillis() - this.f8308f).a();
            }
        }
    }

    public static void a(e eVar, AppLovinAdBase appLovinAdBase, m mVar) {
        if (appLovinAdBase == null || mVar == null || eVar == null) {
            return;
        }
        mVar.ac().a(appLovinAdBase).a(b.f8277e, eVar.c()).a(b.f8278f, eVar.d()).a(b.f8293u, eVar.g()).a(b.f8294v, eVar.h()).a(b.f8295w, eVar.b() ? 1L : 0L).a();
    }

    @TargetApi(24)
    public void a() {
        this.f8305c.a(b.f8282j, this.f8304b.a(f.f8319b)).a(b.f8281i, this.f8304b.a(f.f8321d));
        synchronized (this.f8306d) {
            long j10 = 0;
            if (this.f8307e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f8308f = currentTimeMillis;
                long O = currentTimeMillis - this.f8303a.O();
                long j11 = this.f8308f - this.f8307e;
                long j12 = h.a(this.f8303a.L()) ? 1L : 0L;
                Activity a10 = this.f8303a.af().a();
                if (com.applovin.impl.sdk.utils.g.f() && a10 != null && a10.isInMultiWindowMode()) {
                    j10 = 1;
                }
                this.f8305c.a(b.f8280h, O).a(b.f8279g, j11).a(b.f8288p, j12).a(b.f8296x, j10);
            }
        }
        this.f8305c.a();
    }

    public void a(long j10) {
        this.f8305c.a(b.f8290r, j10).a();
    }

    public void b() {
        synchronized (this.f8306d) {
            if (this.f8309g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f8309g = currentTimeMillis;
                long j10 = this.f8308f;
                if (j10 > 0) {
                    this.f8305c.a(b.f8285m, currentTimeMillis - j10).a();
                }
            }
        }
    }

    public void b(long j10) {
        this.f8305c.a(b.f8289q, j10).a();
    }

    public void c() {
        a(b.f8283k);
    }

    public void c(long j10) {
        this.f8305c.a(b.f8291s, j10).a();
    }

    public void d() {
        a(b.f8286n);
    }

    public void d(long j10) {
        synchronized (this.f8306d) {
            if (this.f8310h < 1) {
                this.f8310h = j10;
                this.f8305c.a(b.f8292t, j10).a();
            }
        }
    }

    public void e() {
        a(b.f8287o);
    }

    public void f() {
        a(b.f8284l);
    }

    public void g() {
        this.f8305c.a(b.f8297y).a();
    }
}
