package com.applovin.adview;

import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.m;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements o {

    /* renamed from: a  reason: collision with root package name */
    private final m f6694a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f6695b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private a f6696c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.o f6697d;

    public AppLovinFullscreenAdViewObserver(i iVar, com.applovin.impl.adview.o oVar, m mVar) {
        this.f6697d = oVar;
        this.f6694a = mVar;
        iVar.a(this);
    }

    @y(i.b.ON_DESTROY)
    public void onDestroy() {
        com.applovin.impl.adview.o oVar = this.f6697d;
        if (oVar != null) {
            oVar.e();
            this.f6697d = null;
        }
        a aVar = this.f6696c;
        if (aVar != null) {
            aVar.h();
            this.f6696c.k();
            this.f6696c = null;
        }
    }

    @y(i.b.ON_PAUSE)
    public void onPause() {
        a aVar = this.f6696c;
        if (aVar != null) {
            aVar.g();
            this.f6696c.e();
        }
    }

    @y(i.b.ON_RESUME)
    public void onResume() {
        a aVar;
        if (this.f6695b.getAndSet(false) || (aVar = this.f6696c) == null) {
            return;
        }
        aVar.f();
        this.f6696c.a(0L);
    }

    @y(i.b.ON_STOP)
    public void onStop() {
        a aVar = this.f6696c;
        if (aVar != null) {
            aVar.j();
        }
    }

    public void setPresenter(a aVar) {
        this.f6696c = aVar;
    }
}
