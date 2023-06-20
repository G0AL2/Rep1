package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import ba.u;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.n0;
import fa.v;
import i9.y0;
import j8.b2;
import j8.j3;
import j8.m2;
import j8.n3;
import j8.o2;
import j8.p2;
import j8.q2;
import j8.x1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r9.b;

/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout implements p2.d {

    /* renamed from: a  reason: collision with root package name */
    private List<r9.b> f21649a;

    /* renamed from: b  reason: collision with root package name */
    private ca.b f21650b;

    /* renamed from: c  reason: collision with root package name */
    private int f21651c;

    /* renamed from: d  reason: collision with root package name */
    private float f21652d;

    /* renamed from: e  reason: collision with root package name */
    private float f21653e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21654f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21655g;

    /* renamed from: h  reason: collision with root package name */
    private int f21656h;

    /* renamed from: i  reason: collision with root package name */
    private a f21657i;

    /* renamed from: j  reason: collision with root package name */
    private View f21658j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void a(List<r9.b> list, ca.b bVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private void F(int i10, float f10) {
        this.f21651c = i10;
        this.f21652d = f10;
        M();
    }

    private void M() {
        this.f21657i.a(getCuesWithStylingPreferencesApplied(), this.f21650b, this.f21652d, this.f21651c, this.f21653e);
    }

    private List<r9.b> getCuesWithStylingPreferencesApplied() {
        if (this.f21654f && this.f21655g) {
            return this.f21649a;
        }
        ArrayList arrayList = new ArrayList(this.f21649a.size());
        for (int i10 = 0; i10 < this.f21649a.size(); i10++) {
            arrayList.add(h(this.f21649a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (n0.f29709a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private ca.b getUserCaptionStyle() {
        if (n0.f29709a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return ca.b.a(captioningManager.getUserStyle());
            }
            return ca.b.f5334g;
        }
        return ca.b.f5334g;
    }

    private r9.b h(r9.b bVar) {
        b.C0490b b10 = bVar.b();
        if (!this.f21654f) {
            k.e(b10);
        } else if (!this.f21655g) {
            k.f(b10);
        }
        return b10.a();
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f21658j);
        View view = this.f21658j;
        if (view instanceof m) {
            ((m) view).g();
        }
        this.f21658j = t10;
        this.f21657i = t10;
        addView(t10);
    }

    public void A(float f10, boolean z10) {
        F(z10 ? 1 : 0, f10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void C(boolean z10) {
        q2.x(this, z10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void D(p2.b bVar) {
        q2.a(this, bVar);
    }

    @Override // j8.p2.d
    public /* synthetic */ void E(j8.m mVar) {
        q2.c(this, mVar);
    }

    public void G() {
        setStyle(getUserCaptionStyle());
    }

    @Override // j8.p2.d
    public /* synthetic */ void H(int i10, boolean z10) {
        q2.d(this, i10, z10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void J() {
        q2.u(this);
    }

    @Override // j8.p2.d
    public /* synthetic */ void K(m2 m2Var) {
        q2.p(this, m2Var);
    }

    public void L() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    @Override // j8.p2.d
    public /* synthetic */ void N(b2 b2Var) {
        q2.j(this, b2Var);
    }

    @Override // j8.p2.d
    public /* synthetic */ void O(n3 n3Var) {
        q2.C(this, n3Var);
    }

    @Override // j8.p2.d
    public /* synthetic */ void P(int i10, int i11) {
        q2.z(this, i10, i11);
    }

    @Override // j8.p2.d
    public /* synthetic */ void T(p2 p2Var, p2.c cVar) {
        q2.e(this, p2Var, cVar);
    }

    @Override // j8.p2.d
    public /* synthetic */ void U(int i10) {
        q2.s(this, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void V(p2.e eVar, p2.e eVar2, int i10) {
        q2.t(this, eVar, eVar2, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void W(boolean z10) {
        q2.f(this, z10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void X() {
        q2.w(this);
    }

    @Override // j8.p2.d
    public /* synthetic */ void Y(float f10) {
        q2.E(this, f10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void Z(y0 y0Var, u uVar) {
        q2.B(this, y0Var, uVar);
    }

    @Override // j8.p2.d
    public /* synthetic */ void a(boolean z10) {
        q2.y(this, z10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void d(o2 o2Var) {
        q2.m(this, o2Var);
    }

    @Override // j8.p2.d
    public /* synthetic */ void d0(boolean z10, int i10) {
        q2.r(this, z10, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void e0(m2 m2Var) {
        q2.q(this, m2Var);
    }

    @Override // j8.p2.d
    public /* synthetic */ void g(Metadata metadata) {
        q2.k(this, metadata);
    }

    @Override // j8.p2.d
    public /* synthetic */ void g0(j3 j3Var, int i10) {
        q2.A(this, j3Var, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void h0(boolean z10, int i10) {
        q2.l(this, z10, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void j(v vVar) {
        q2.D(this, vVar);
    }

    @Override // j8.p2.d
    public void k(List<r9.b> list) {
        setCues(list);
    }

    @Override // j8.p2.d
    public /* synthetic */ void k0(boolean z10) {
        q2.g(this, z10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void r(int i10) {
        q2.v(this, i10);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f21655g = z10;
        M();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f21654f = z10;
        M();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f21653e = f10;
        M();
    }

    public void setCues(List<r9.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f21649a = list;
        M();
    }

    public void setFractionalTextSize(float f10) {
        A(f10, false);
    }

    public void setStyle(ca.b bVar) {
        this.f21650b = bVar;
        M();
    }

    public void setViewType(int i10) {
        if (this.f21656h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else if (i10 == 2) {
            setView(new m(getContext()));
        } else {
            throw new IllegalArgumentException();
        }
        this.f21656h = i10;
    }

    @Override // j8.p2.d
    public /* synthetic */ void w(int i10) {
        q2.o(this, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void x(boolean z10) {
        q2.h(this, z10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void y(x1 x1Var, int i10) {
        q2.i(this, x1Var, i10);
    }

    @Override // j8.p2.d
    public /* synthetic */ void z(int i10) {
        q2.n(this, i10);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21649a = Collections.emptyList();
        this.f21650b = ca.b.f5334g;
        this.f21651c = 0;
        this.f21652d = 0.0533f;
        this.f21653e = 0.08f;
        this.f21654f = true;
        this.f21655g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f21657i = aVar;
        this.f21658j = aVar;
        addView(aVar);
        this.f21656h = 1;
    }
}
