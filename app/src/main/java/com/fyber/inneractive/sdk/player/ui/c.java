package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.util.q0;

/* loaded from: classes2.dex */
public abstract class c extends RelativeLayout implements g {

    /* renamed from: a  reason: collision with root package name */
    public final p0 f19764a;

    /* renamed from: b  reason: collision with root package name */
    public int f19765b;

    /* renamed from: c  reason: collision with root package name */
    public z f19766c;

    /* renamed from: d  reason: collision with root package name */
    public UnitDisplayType f19767d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19768e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19769f;

    /* renamed from: g  reason: collision with root package name */
    public h f19770g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f19771h;

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19764a = p0.a();
        this.f19765b = 0;
        this.f19768e = false;
        this.f19769f = false;
        this.f19771h = false;
        this.f19765b = Math.min(l.e(), l.d());
    }

    public String a() {
        return IAlog.a(this);
    }

    public abstract void a(q0 q0Var, int i10, int i11);

    public void b() {
        boolean z10 = isShown() && hasWindowFocus() && this.f19769f && !this.f19771h;
        if (z10) {
            z10 = getGlobalVisibleRect(new Rect());
        }
        if (z10 == this.f19768e || this.f19770g == null) {
            return;
        }
        IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(z10));
        this.f19768e = z10;
        this.f19770g.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.g
    public void destroy() {
        if (this.f19770g != null) {
            this.f19770g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f19769f));
        this.f19769f = true;
        h hVar = this.f19770g;
        if (hVar != null) {
            hVar.b();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f19769f));
        this.f19769f = false;
        h hVar = this.f19770g;
        if (hVar != null) {
            hVar.d();
        }
        b();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i10));
            b();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z10));
        b();
    }

    public void setListener(h hVar) {
        this.f19770g = hVar;
    }

    public void setUnitConfig(z zVar) {
        UnitDisplayType unitDisplayType;
        this.f19766c = zVar;
        y yVar = (y) zVar;
        if (yVar.f17076e == null) {
            unitDisplayType = yVar.f17077f.f16908j;
        } else {
            unitDisplayType = UnitDisplayType.DEFAULT;
        }
        this.f19767d = unitDisplayType;
    }
}
