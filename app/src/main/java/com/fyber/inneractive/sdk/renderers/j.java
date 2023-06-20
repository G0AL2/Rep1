package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveNativeAdEventsListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.s;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;

/* loaded from: classes2.dex */
public class j extends s<y, InneractiveNativeAdEventsListener> implements com.fyber.inneractive.sdk.interfaces.c {

    /* renamed from: w  reason: collision with root package name */
    public boolean f20130w = false;

    @Override // com.fyber.inneractive.sdk.flow.s
    public boolean E() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public int G() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public int H() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public long I() {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public boolean J() {
        return false;
    }

    public final void L() {
        z zVar;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (zVar = ((y) adcontent).f17242d) == null || ((com.fyber.inneractive.sdk.config.y) zVar).f17074c == null) {
            return;
        }
        IAConfigManager.J.f16888x.a(((com.fyber.inneractive.sdk.config.y) zVar).f17074c.f17018b == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.b.f16852c : com.fyber.inneractive.sdk.cache.session.enums.b.f16853d, com.fyber.inneractive.sdk.cache.session.enums.a.CLICK);
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public long a(long j10) {
        return 0L;
    }

    public d0.a a(p0 p0Var, com.fyber.inneractive.sdk.util.e eVar) {
        L();
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
    }

    public void a(boolean z10) {
    }

    public void a(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public /* bridge */ /* synthetic */ boolean b(y yVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (!this.f20130w) {
            m();
        }
        this.f17247b = null;
        super.destroy();
    }

    public void e() {
    }

    public void g() {
        T t10;
        com.fyber.inneractive.sdk.model.vast.c cVar;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            y yVar = (y) adcontent;
            if (yVar.f17239a == null || (t10 = yVar.f17240b) == 0) {
                return;
            }
            String str = null;
            com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) t10).C;
            if (bVar != null && (cVar = bVar.f17392g) != null && (hVar = cVar.f17396b) != null) {
                str = hVar.toString();
            }
            a(str);
        }
    }

    public void h() {
        IAlog.a("%snShownCloseButton", IAlog.a(this));
    }

    public void j() {
        a(new WebViewRendererProcessHasGoneError());
    }

    public void k() {
    }

    public void l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
        this.f20130w = true;
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            y yVar = (y) adcontent;
        }
        IAlog.a("%sunit controller is null!", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void o() {
    }

    public void onCompleted() {
    }

    public void onPlayerError() {
    }

    public void onProgress(int i10, int i11) {
    }

    public void r() {
        z();
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void s() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean u() {
        return false;
    }

    public void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    public d0.a a(String str, p0 p0Var) {
        com.fyber.inneractive.sdk.model.vast.c cVar;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            y yVar = (y) adcontent;
            if (yVar.f17239a != null && yVar.f17240b != 0) {
                L();
                com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) ((y) this.f17247b).f17240b).C;
                a((bVar == null || (cVar = bVar.f17392g) == null || (hVar = cVar.f17396b) == null) ? null : hVar.toString());
            }
        }
        throw null;
    }

    public void a(View view, String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        z();
    }
}
