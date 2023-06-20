package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.s;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class b extends a implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public InneractiveAdSpot f17079a;

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f17080b;

    /* JADX WARN: Type inference failed for: r1v0, types: [AdContent extends com.fyber.inneractive.sdk.flow.j, com.fyber.inneractive.sdk.flow.j] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener, EventsListener extends com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener] */
    @Override // com.fyber.inneractive.sdk.display.a
    public void a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot inneractiveAdSpot2 = (TextUtils.isEmpty(str) || (inneractiveAdSpot2 = InneractiveAdSpotManager.get().getSpot(str)) == null || inneractiveAdSpot2.getAdContent() == null) ? null : null;
        this.f17079a = inneractiveAdSpot2;
        if (inneractiveAdSpot2 != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot2.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                com.fyber.inneractive.sdk.interfaces.c fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f17080b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    InneractiveAdSpot inneractiveAdSpot3 = this.f17079a;
                    s sVar = (s) fullscreenRenderer;
                    sVar.f17246a = inneractiveAdSpot3;
                    sVar.f17247b = inneractiveAdSpot3.getAdContent();
                    sVar.f17248c = inneractiveAdSpot3.getSelectedUnitController().getEventsListener();
                    sVar.f17292u.f20225a = inneractiveAdSpot3;
                    try {
                        this.f17080b.a(this, activity);
                    } catch (Resources.NotFoundException e10) {
                        IAlog.e("Interstitial Activity: %s", e10.getMessage());
                    } catch (InneractiveUnitController.AdDisplayError e11) {
                        IAlog.e("Interstitial Activity: %s", e11.getMessage());
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void destroy() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void disableCloseButton() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void dismissAd(boolean z10) {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f17080b;
        if (cVar != null) {
            cVar.destroy();
            this.f17080b = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public View getCloseButton() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public ViewGroup getLayout() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean isCloseButtonDisplay() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void setActivityOrientation(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseButton(boolean z10, int i10, int i11) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseCountdown() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void updateCloseCountdown(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean wasDismissedByUser() {
        return false;
    }
}
