package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class InneractiveFullscreenUnitController extends x<InneractiveFullscreenAdEventsListener> implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* renamed from: b  reason: collision with root package name */
    public InneractiveFullScreenAdRewardedListener f17160b;
    public c mRenderer;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17159a = false;

    /* renamed from: c  reason: collision with root package name */
    public final c.b f17161c = new a();

    /* loaded from: classes.dex */
    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public class a implements c.b {
        public a() {
        }

        public void a() {
            p pVar = (p) s.a(InneractiveFullscreenUnitController.this.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = InneractiveFullscreenUnitController.this.f17160b;
            if (inneractiveFullScreenAdRewardedListener == null || pVar == null) {
                return;
            }
            inneractiveFullScreenAdRewardedListener.onAdRewarded(pVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        c cVar = this.mRenderer;
        if (cVar != null) {
            cVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public c getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f17160b;
    }

    public boolean isAvailable() {
        p pVar = (p) s.a(this.mAdSpot);
        return pVar != null && pVar.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f17159a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f17160b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        com.fyber.inneractive.sdk.display.a cVar;
        if (activity == null) {
            IAlog.e("show() called with a null activity", new Object[0]);
        } else if (!this.f17159a) {
            InneractiveAdSpot adSpot = getAdSpot();
            if (adSpot == null) {
                IAlog.e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
                return;
            }
            j adContent = adSpot.getAdContent();
            if (adContent != null) {
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.IA_PUBLISHER_REQUESTED_SHOW;
                InneractiveAdRequest inneractiveAdRequest = adContent.f17239a;
                e c10 = adContent.c();
                JSONArray c11 = adContent.f17241c.c();
                q.a aVar = new q.a(c10);
                aVar.f17683c = pVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = c11;
                aVar.a((String) null);
            }
            if (!adSpot.isReady()) {
                EL el = this.mEventsListener;
                if (el != 0) {
                    ((InneractiveFullscreenAdEventsListener) el).onAdEnteredErrorState(adSpot, new AdExpiredError("Ad Expired"));
                    return;
                }
                return;
            }
            if (this.mRenderer == null) {
                this.mRenderer = c.b.f17186a.a(getAdSpot());
            }
            selectContentController();
            if (adContent instanceof com.fyber.inneractive.sdk.dv.a) {
                cVar = new com.fyber.inneractive.sdk.display.b();
            } else {
                cVar = new com.fyber.inneractive.sdk.display.c();
            }
            cVar.a(activity, adSpot, adSpot.getLocalUniqueId());
            this.f17159a = true;
            com.fyber.inneractive.sdk.interfaces.c cVar2 = this.mRenderer;
            if (cVar2 != null) {
                cVar2.a(this.f17161c);
            }
        } else {
            IAlog.e("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        y yVar = (y) inneractiveAdSpot.getAdContent().f17242d;
        if (yVar.f17076e != null) {
            return false;
        }
        r rVar = yVar.f17074c;
        if (rVar == null || !UnitDisplayType.INTERSTITIAL.equals(rVar.f17018b)) {
            a0 a0Var = yVar.f17077f;
            return a0Var != null && (UnitDisplayType.REWARDED.equals(a0Var.f16908j) || UnitDisplayType.INTERSTITIAL.equals(a0Var.f16908j) || UnitDisplayType.VERTICAL.equals(a0Var.f16908j));
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean supportsRefresh() {
        return false;
    }
}
