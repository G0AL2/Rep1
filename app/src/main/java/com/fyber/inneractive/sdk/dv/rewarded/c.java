package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.s;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class c extends s<com.fyber.inneractive.sdk.a, InneractiveFullscreenAdEventsListener> implements com.fyber.inneractive.sdk.interfaces.c {

    /* renamed from: w  reason: collision with root package name */
    public c.b f17123w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f17124x = false;

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

    @Override // com.fyber.inneractive.sdk.flow.s
    public long a(long j10) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.a(aVar, activity);
        if (activity != null) {
            AdContent adcontent = this.f17247b;
            if (adcontent != 0) {
                com.fyber.inneractive.sdk.a aVar2 = (com.fyber.inneractive.sdk.a) adcontent;
                if (aVar2.f17083i != 0) {
                    aVar2.a(this, activity);
                    return;
                }
            }
            IAlog.e("%sad content is null aborting", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        }
        IAlog.e("%sYou must pass activity in order to show rewarded", IAlog.a(this));
        throw new InneractiveUnitController.AdDisplayError("No activity context");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.a aVar) {
        return false;
    }

    public void d() {
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            e eVar = ((com.fyber.inneractive.sdk.a) adcontent).f17240b;
            if (((f) eVar) != null) {
                a((f) eVar);
            }
        }
        a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, com.fyber.inneractive.sdk.cache.session.enums.b.f16852c);
        z();
    }

    public void i() {
        EventsListener eventslistener;
        if (this.f17124x || (eventslistener = this.f17248c) == 0) {
            return;
        }
        this.f17124x = true;
        ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f17246a);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
    }

    public void onReward() {
        c.b bVar = this.f17123w;
        if (bVar != null) {
            ((InneractiveFullscreenUnitController.a) bVar).a();
            D();
        }
        a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.b.f16852c);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean u() {
        return false;
    }

    public void v() {
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            b((f) ((com.fyber.inneractive.sdk.a) adcontent).f17240b);
        }
        a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, com.fyber.inneractive.sdk.cache.session.enums.b.f16852c);
        A();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
        this.f17123w = bVar;
    }
}
