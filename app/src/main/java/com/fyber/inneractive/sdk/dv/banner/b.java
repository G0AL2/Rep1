package com.fyber.inneractive.sdk.dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.flow.l;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdView;

/* loaded from: classes.dex */
public class b extends l<a, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b {

    /* renamed from: k  reason: collision with root package name */
    public ViewGroup f17090k;

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(ViewGroup viewGroup) {
        AdContent adcontent;
        if (this.f17246a == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
        } else if (viewGroup == null || (adcontent = this.f17247b) == 0) {
        } else {
            a aVar = (a) adcontent;
            if (aVar.f17083i != 0) {
                aVar.f17082h = this;
                if (aVar.f17086j) {
                    v();
                    aVar.f17086j = false;
                }
                this.f17090k = viewGroup;
                viewGroup.addView((View) ((a) this.f17247b).f17083i);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            T t10 = ((a) adcontent).f17083i;
            if (t10 != 0) {
                ((AdView) t10).destroy();
            }
            ((a) this.f17247b).a();
        }
        ViewGroup viewGroup = this.f17090k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f17090k = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        T t10;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (t10 = ((a) adcontent).f17083i) == 0 || ((AdView) t10).getAdSize() == null) {
            return 0;
        }
        return com.fyber.inneractive.sdk.util.l.b(((AdView) ((a) this.f17247b).f17083i).getAdSize().getWidth());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        T t10;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (t10 = ((a) adcontent).f17083i) == 0 || ((AdView) t10).getAdSize() == null) {
            return 0;
        }
        return com.fyber.inneractive.sdk.util.l.b(((AdView) ((a) this.f17247b).f17083i).getAdSize().getHeight());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void t() {
        ViewGroup viewGroup = this.f17090k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f17090k = null;
        }
    }

    public void v() {
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        A();
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            e eVar = ((a) adcontent).f17240b;
            if (((f) eVar) != null) {
                b((f) eVar);
                z zVar = ((a) this.f17247b).f17242d;
                if (zVar == null || ((y) zVar).f17074c == null) {
                    return;
                }
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                if (((y) zVar).f17074c.f17018b == UnitDisplayType.MRECT) {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16854e;
                } else {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16856g;
                }
                a(aVar, bVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(j jVar) {
        return jVar instanceof com.fyber.inneractive.sdk.dv.a;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        ViewGroup viewGroup = this.f17090k;
        return viewGroup != null && viewGroup.equals(view);
    }
}
