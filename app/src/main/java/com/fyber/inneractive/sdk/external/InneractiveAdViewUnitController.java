package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.flow.v;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.s;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class InneractiveAdViewUnitController extends x<InneractiveAdViewEventsListener> implements m.c, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a  reason: collision with root package name */
    public Set<InneractiveAdRenderer> f17149a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17150b;

    /* renamed from: c  reason: collision with root package name */
    public View f17151c;

    /* renamed from: d  reason: collision with root package name */
    public int f17152d;
    public int mAdContentHeight;
    public int mAdContentWidth;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InneractiveAdViewUnitController.this.a();
        }
    }

    public InneractiveAdViewUnitController() {
        this.f17150b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f17152d = 0;
        this.f17149a = new HashSet();
    }

    public final void a() {
        this.f17150b = true;
        Iterator it = new HashSet(this.f17149a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f17149a.clear();
        this.f17151c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.b bVar;
        IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.f17149a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                com.fyber.inneractive.sdk.interfaces.b bVar2 = (com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer;
                if (bVar2.a((View) viewGroup)) {
                    bVar2.n();
                    IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar2);
                    return;
                }
            }
        }
        this.f17151c = viewGroup;
        Iterator<a.InterfaceC0233a> it2 = a.b.f17182a.f17181a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            a.InterfaceC0233a next = it2.next();
            if (next.a(adSpot)) {
                bVar = next.b(adSpot);
                break;
            }
        }
        int i10 = this.f17152d;
        if (i10 != 0) {
            bVar.a(i10);
        }
        if (bVar == null) {
            IAlog.e("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
            return;
        }
        bVar.initialize(adSpot);
        selectContentController();
        bVar.a(viewGroup);
        this.f17149a.add(bVar);
        IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean canRefreshAd() {
        if (supportsRefresh()) {
            for (InneractiveAdRenderer inneractiveAdRenderer : this.f17149a) {
                if (!inneractiveAdRenderer.canRefreshAd()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            a();
        } else {
            n.f20310b.post(new a());
        }
    }

    public int getAdContentHeight() {
        int p10;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f17149a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) && (p10 = ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).p()) > 0) {
                return p10;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int f10;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f17149a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) && (f10 = ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).f()) > 0) {
                return f10;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public c getFullscreenRenderer() {
        c a10 = c.b.f17186a.a((InneractiveAdSpot) s.a(this.mAdSpot));
        this.f17149a.add(a10);
        return a10;
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.m.c
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.f17149a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).q();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.m.c
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.b bVar;
        Iterator it = new HashSet(this.f17149a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                bVar = (com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer;
                if (bVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof m) {
                int i10 = IAlog.f20222a;
                IAlog.a(1, null, "%s %s", "AD_REFRESH", ((m) inneractiveAdSpot).f17265h.f17209g.f17621f.a());
            }
        } catch (Exception unused) {
        }
        IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) s.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof v)) {
            return;
        }
        ((v) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        y yVar = (y) inneractiveAdSpot.getAdContent().f17242d;
        if (yVar.f17076e != null) {
            return false;
        }
        r rVar = yVar.f17074c;
        if (rVar != null) {
            if (UnitDisplayType.BANNER.equals(rVar.f17018b) || UnitDisplayType.MRECT.equals(rVar.f17018b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(rVar.f17018b)) {
                return !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        a0 a0Var = yVar.f17077f;
        return a0Var != null && (UnitDisplayType.LANDSCAPE.equals(a0Var.f16908j) || UnitDisplayType.SQUARE.equals(a0Var.f16908j) || UnitDisplayType.MRECT.equals(a0Var.f16908j));
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.c cVar) {
        WeakReference<p> weakReference;
        IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.f17149a;
        if (set != null) {
            set.remove(cVar);
        }
        if (this.f17150b) {
            return;
        }
        Iterator it = new HashSet(this.f17149a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).a();
                if (this.mEventsListener != 0 && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                    ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f17151c != view) {
            IAlog.e("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f17151c, view);
        } else {
            this.f17151c = null;
        }
        IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.f17149a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                com.fyber.inneractive.sdk.interfaces.b bVar = (com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer;
                if (bVar.a(view)) {
                    IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.t();
                    this.f17149a.remove(bVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i10) {
        this();
        if (i10 >= 30) {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i10));
            this.f17152d = i10;
            return;
        }
        IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i10), 30);
        this.f17152d = 30;
    }

    public InneractiveAdViewUnitController(boolean z10) {
        this();
        if (z10) {
            this.f17152d = -1;
        }
    }
}
