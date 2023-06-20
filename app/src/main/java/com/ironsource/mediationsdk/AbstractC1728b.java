package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1728b {

    /* renamed from: b  reason: collision with root package name */
    public AbstractAdapter f26979b;

    /* renamed from: c  reason: collision with root package name */
    NetworkSettings f26980c;

    /* renamed from: d  reason: collision with root package name */
    String f26981d;

    /* renamed from: e  reason: collision with root package name */
    boolean f26982e;

    /* renamed from: f  reason: collision with root package name */
    public String f26983f;

    /* renamed from: g  reason: collision with root package name */
    public String f26984g;

    /* renamed from: i  reason: collision with root package name */
    Timer f26986i;

    /* renamed from: j  reason: collision with root package name */
    Timer f26987j;

    /* renamed from: k  reason: collision with root package name */
    int f26988k;

    /* renamed from: l  reason: collision with root package name */
    int f26989l;

    /* renamed from: m  reason: collision with root package name */
    public int f26990m;

    /* renamed from: n  reason: collision with root package name */
    public int f26991n;

    /* renamed from: r  reason: collision with root package name */
    private String f26995r;

    /* renamed from: t  reason: collision with root package name */
    private String f26997t = "maxAdsPerSession";

    /* renamed from: u  reason: collision with root package name */
    private String f26998u = "maxAdsPerIteration";

    /* renamed from: v  reason: collision with root package name */
    private String f26999v = "maxAdsPerDay";

    /* renamed from: h  reason: collision with root package name */
    int f26985h = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f26996s = 0;

    /* renamed from: a  reason: collision with root package name */
    a f26978a = a.NOT_INITIATED;

    /* renamed from: q  reason: collision with root package name */
    IronSourceLoggerManager f26994q = IronSourceLoggerManager.getLogger();

    /* renamed from: o  reason: collision with root package name */
    protected Long f26992o = null;

    /* renamed from: p  reason: collision with root package name */
    protected Long f26993p = null;

    /* renamed from: com.ironsource.mediationsdk.b$a */
    /* loaded from: classes3.dex */
    public enum a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        

        /* renamed from: l  reason: collision with root package name */
        public int f27015l;

        a(int i10) {
            this.f27015l = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1728b(NetworkSettings networkSettings) {
        this.f26995r = networkSettings.getProviderTypeForReflection();
        this.f26981d = networkSettings.getProviderInstanceName();
        this.f26982e = networkSettings.isMultipleInstances();
        this.f26980c = networkSettings;
        this.f26983f = networkSettings.getSubProviderId();
        this.f26984g = networkSettings.getAdSourceNameForEvents();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(a aVar) {
        if (this.f26978a == aVar) {
            return;
        }
        this.f26978a = aVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.f26994q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "Smart Loading - " + this.f26981d + " state changed to " + aVar.toString(), 0);
        AbstractAdapter abstractAdapter = this.f26979b;
        if (abstractAdapter != null && (aVar == a.CAPPED_PER_SESSION || aVar == a.CAPPED_PER_DAY)) {
            abstractAdapter.setMediationState(aVar, k());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26994q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f26981d + " | " + str2, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.f26985h >= this.f26988k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.f26996s >= this.f26989l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        if (!a() && !b()) {
            if (!(this.f26978a == a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.f26985h++;
        this.f26996s++;
        if (b()) {
            a(a.CAPPED_PER_SESSION);
        } else if (a()) {
            a(a.EXHAUSTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        try {
            Timer timer = this.f26986i;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a("stopInitTimer", e10.getLocalizedMessage());
        } finally {
            this.f26986i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            Timer timer = this.f26987j;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a("stopLoadTimer", e10.getLocalizedMessage());
        } finally {
            this.f26987j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    abstract void h();

    abstract void i();

    public final String j() {
        return this.f26982e ? this.f26995r : this.f26981d;
    }

    protected abstract String k();

    public final Long l() {
        return this.f26992o;
    }

    public final Long m() {
        return this.f26993p;
    }
}
