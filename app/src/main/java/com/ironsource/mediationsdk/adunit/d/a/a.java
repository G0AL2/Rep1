package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes3.dex */
public abstract class a<Listener extends com.ironsource.mediationsdk.adunit.c.a.a> extends c<Listener> implements AdapterAdInteractionListener {

    /* renamed from: h  reason: collision with root package name */
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> f26922h;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.f26922h = baseAdInteractionAdapter;
    }

    public final void a(Placement placement) {
        int i10;
        IronLog.INTERNAL.verbose(c("placementName = " + placement.getPlacementName()));
        try {
            this.f26928e = placement;
            a(c.a.SHOWING);
            this.f26926c.f26840d.a(q());
            this.f26922h.showAd(this.f26929f, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(c(str));
            a(c.a.FAILED);
            d dVar = this.f26926c;
            if (dVar != null) {
                dVar.f26841e.m(str);
            }
            IronSource.AD_UNIT ad_unit = this.f26924a.f26913a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i10 = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i10 = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else {
                ironLog.warning("ad unit not supported - " + ad_unit);
                i10 = IronSourceError.ERROR_CODE_GENERIC;
            }
            onAdShowFailed(i10, str);
        }
    }

    public final void a(boolean z10) {
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.a(z10);
        }
    }

    public final boolean a() {
        if (this.f26929f != null) {
            try {
                return i() ? this.f26927d == c.a.LOADED && this.f26922h.isAdAvailable(this.f26929f) : this.f26922h.isAdAvailable(this.f26929f);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.m(str);
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.c
    public final void c() {
        super.c();
        BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter = this.f26922h;
        if (baseAdInteractionAdapter != null) {
            try {
                baseAdInteractionAdapter.releaseMemory();
            } catch (Exception e10) {
                String format = String.format("releaseMemory - exception = ", e10);
                IronLog.INTERNAL.verbose(c(format));
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.m(format);
                }
            }
            this.f26922h = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        String str;
        IronLog.INTERNAL.verbose(c(""));
        synchronized (this.f26930g) {
            if (this.f26927d != c.a.SHOWING) {
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.k("unexpected closed for " + m());
                }
                return;
            }
            a(c.a.NONE);
            if (this.f26926c != null) {
                String str2 = "";
                if (this.f26924a.f26913a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    String c10 = ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).c();
                    StringBuilder sb2 = new StringBuilder("otherInstanceAvailable = ");
                    if (c10.length() > 0) {
                        str = "true|" + c10;
                    } else {
                        str = "false";
                    }
                    sb2.append(str);
                    str2 = sb2.toString();
                }
                this.f26926c.f26840d.a(q(), str2);
            }
            ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.f(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).e(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.c(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).b((a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i10 + ", " + str));
        if (this.f26927d != c.a.SHOWING) {
            d dVar = this.f26926c;
            if (dVar != null) {
                dVar.f26841e.j(String.format("unexpected show failed for %s, error - %d, %s", m(), Integer.valueOf(i10), str));
                return;
            }
            return;
        }
        a(c.a.FAILED);
        d dVar2 = this.f26926c;
        if (dVar2 != null) {
            dVar2.f26840d.a(q(), i10, str, "");
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).a(new IronSourceError(i10, str), (a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.b(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).a((a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.e(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.f26925b).d(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.g(q());
        }
    }
}
