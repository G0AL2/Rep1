package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1734h;
import com.ironsource.mediationsdk.C1735i;
import com.ironsource.mediationsdk.D;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ac;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.c.e;
import com.ironsource.mediationsdk.adunit.d.a.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d<Smash extends com.ironsource.mediationsdk.adunit.d.a.a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends e<Smash, Adapter> implements com.ironsource.mediationsdk.adunit.c.a.a {
    public d(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    private void a(IronSourceError ironSourceError, String str) {
        this.f26894q.f26840d.a(h(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f26892o.b();
        b bVar = this.f26895r;
        com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.f26878a;
        bVar.a(ironSourceError, aVar.a(aVar.f26947b));
        if (this.f26890m.f26863h.b()) {
            a(false, false);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void a(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m()));
        b bVar = this.f26895r;
        AdInfo a10 = this.f26878a.a(aVar.o());
        IronSource.AD_UNIT ad_unit = bVar.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().d(a10);
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            ironLog.warning("ad unit not supported - " + bVar.f26865a);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void a(IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        com.ironsource.mediationsdk.server.b bVar;
        if (this.f26890m.a() && (bVar = this.f26879b.get(aVar.k())) != null) {
            com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.f26878a;
            aVar2.a(aVar2.f26947b, bVar.a(h()));
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m() + " - error = " + ironSourceError));
        this.f26880c.put(aVar.k(), C1735i.a.ISAuctionPerformanceFailedToShow);
        a(e.a.READY_TO_LOAD);
        a(ironSourceError, "");
    }

    public final void a(Placement placement) {
        com.ironsource.mediationsdk.adunit.d.a.a aVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("state = " + this.f26891n));
        synchronized (this.f26897t) {
            this.f26887j = placement;
            this.f26894q.f26840d.a(h());
            e.a aVar2 = this.f26891n;
            e.a aVar3 = e.a.SHOWING;
            int i10 = IronSourceError.ERROR_CODE_GENERIC;
            aVar = null;
            if (aVar2 == aVar3) {
                IronSource.AD_UNIT ad_unit = this.f26890m.f26856a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i10 = IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i10 = IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i10, "can't show ad while an ad is already showing");
            } else if (aVar2 != e.a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.f26890m.f26856a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i10 = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i10 = IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i10, "empty default placement");
            } else if (k.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.f26890m.f26856a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(a(ironSourceError.getErrorMessage()));
                a(ironSourceError, "");
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = this.f26878a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.ironsource.mediationsdk.adunit.d.a.a aVar4 = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                    if (aVar4.a()) {
                        a(e.a.SHOWING);
                        aVar4.a(true);
                        aVar = aVar4;
                        break;
                    }
                    if (aVar4.h() != null) {
                        stringBuffer.append(aVar4.k() + ":" + aVar4.h() + ",");
                    }
                    aVar4.a(false);
                    IronLog.INTERNAL.verbose(a(aVar4.m() + " - not ready to show"));
                }
                if (aVar == null) {
                    a(ErrorBuilder.buildNoAdsToShowError(this.f26890m.f26856a.toString()), stringBuffer.toString());
                }
            }
        }
        if (aVar != null) {
            Placement placement2 = this.f26887j;
            if (this.f26890m.f26863h.b()) {
                this.f26893p.a();
            }
            aVar.a(placement2);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void b(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m()));
        this.f26878a.a(aVar);
        this.f26889l.a(aVar);
        if (this.f26889l.b(aVar)) {
            ironLog.verbose(a(aVar.k() + " was session capped"));
            aVar.g();
            IronSourceUtils.sendAutomationLog(aVar.k() + " was session capped");
        }
        k.b(ContextProvider.getInstance().getApplicationContext(), h(), this.f26890m.f26856a);
        if (k.a(ContextProvider.getInstance().getApplicationContext(), h(), this.f26890m.f26856a)) {
            ironLog.verbose(a("placement " + h() + " is capped"));
            this.f26894q.f26840d.h(h());
        }
        o.a().a(this.f26890m.f26856a);
        if (this.f26890m.a()) {
            com.ironsource.mediationsdk.server.b bVar = this.f26879b.get(aVar.k());
            if (bVar != null) {
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.f26878a;
                aVar2.a(aVar2.f26947b, bVar.a(h()));
                C1734h.a(bVar, aVar.l(), this.f26886i, h());
                this.f26880c.put(aVar.k(), C1735i.a.ISAuctionPerformanceShowedSuccessfully);
                a(bVar, h());
            } else {
                String k10 = aVar.k();
                String str = "showing instance missing from waterfall - " + k10;
                ironLog.verbose(a(str));
                this.f26894q.f26841e.a(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, str, k10);
            }
        }
        b bVar2 = this.f26895r;
        AdInfo a10 = this.f26878a.a(aVar.o());
        IronSource.AD_UNIT ad_unit = bVar2.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().b(a10);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().a(a10);
        } else {
            ironLog.warning("ad unit not supported - " + bVar2.f26865a);
        }
        if (this.f26890m.f26863h.b()) {
            a(false, false);
        }
        c cVar = this.f26892o;
        com.ironsource.mediationsdk.adunit.c.b.a aVar3 = cVar.f26874a;
        if (aVar3.f26866a == a.EnumC0342a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.a(aVar3.f26867b);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final boolean b() {
        if (f()) {
            if (!this.f26888k || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
                Iterator it = this.f26878a.a().iterator();
                while (it.hasNext()) {
                    if (((com.ironsource.mediationsdk.adunit.d.a.a) it.next()).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f26891n == e.a.READY_TO_SHOW) {
            Iterator it = this.f26878a.a().iterator();
            while (it.hasNext()) {
                com.ironsource.mediationsdk.adunit.d.a.a aVar = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                if (aVar.e()) {
                    sb2.append(aVar.k() + ";");
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void c(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m()));
        if (this.f26891n == e.a.SHOWING) {
            a(e.a.READY_TO_LOAD);
        }
        c cVar = this.f26892o;
        com.ironsource.mediationsdk.adunit.c.b.a aVar2 = cVar.f26874a;
        if (aVar2.f26866a == a.EnumC0342a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.a(aVar2.f26867b);
        }
        b bVar = this.f26895r;
        AdInfo a10 = this.f26878a.a(aVar.o());
        IronSource.AD_UNIT ad_unit = bVar.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().c(a10);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().b(a10);
        } else {
            ironLog.warning("ad unit not supported - " + bVar.f26865a);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void d(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m()));
        b bVar = this.f26895r;
        if (bVar.f26865a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().b();
            return;
        }
        ironLog.warning("ad unit not supported - " + bVar.f26865a);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void e(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(aVar.m()));
        b bVar = this.f26895r;
        if (bVar.f26865a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().c();
            return;
        }
        ironLog.warning("ad unit not supported - " + bVar.f26865a);
    }
}
