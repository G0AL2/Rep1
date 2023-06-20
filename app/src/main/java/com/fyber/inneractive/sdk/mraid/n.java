package com.fyber.inneractive.sdk.mraid;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;
import java.util.Map;

/* loaded from: classes.dex */
public class n extends b {
    public n(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        int a10 = a("w");
        int a11 = a("h");
        int a12 = a("offsetX");
        int a13 = a("offsetY");
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f17489b.get("allowOffscreen"));
        this.f17489b.get("customClosePosition");
        if (a10 <= 0) {
            a10 = this.f17490c.K;
        }
        if (a11 <= 0) {
            a11 = this.f17490c.L;
        }
        com.fyber.inneractive.sdk.web.d dVar = this.f17490c;
        com.fyber.inneractive.sdk.web.c cVar = dVar.f20365b;
        if (cVar == null) {
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) cVar.getRootView().findViewById(16908290);
            dVar.C = viewGroup;
            if (viewGroup == null) {
                IAlog.e("Couldn't find content in the view tree", new Object[0]);
                dVar.a(f.RESIZE, "Ad can be resized only if it's state is default or resized.");
            } else if (dVar.f20407z == d.EnumC0274d.DISABLED) {
            } else {
                a0 a0Var = dVar.f20406y;
                if (a0Var != a0.DEFAULT && a0Var != a0.RESIZED) {
                    dVar.a(f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (a10 < 0 && a11 < 0) {
                    dVar.a(f.RESIZE, "Creative size passed to resize() was invalid.");
                } else {
                    dVar.b(false);
                    d.h hVar = dVar.A;
                    if (hVar == d.h.ALWAYS_VISIBLE || (!dVar.I && hVar != d.h.ALWAYS_HIDDEN)) {
                        dVar.c(true);
                    }
                    dVar.d(false);
                    dVar.P = com.fyber.inneractive.sdk.util.l.b(a11);
                    dVar.O = com.fyber.inneractive.sdk.util.l.b(a10);
                    if (!equals) {
                        int i10 = (a12 + a10) - dVar.K;
                        if (i10 > 0) {
                            a12 -= i10;
                        }
                        if (a12 < 0) {
                            a12 = 0;
                        }
                        int i11 = (a13 + a11) - dVar.L;
                        if (i11 > 0) {
                            a13 -= i11;
                        }
                        if (a13 < 0) {
                            a13 = 0;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.fyber.inneractive.sdk.util.l.b(a10), com.fyber.inneractive.sdk.util.l.b(a11));
                    layoutParams.leftMargin = a12;
                    layoutParams.topMargin = a13;
                    if (a12 == 0 && a13 == 0) {
                        layoutParams.gravity = 17;
                    }
                    dVar.f20365b.setLayoutParams(layoutParams);
                    a0 a0Var2 = dVar.f20406y;
                    a0 a0Var3 = a0.RESIZED;
                    if (a0Var2 != a0Var3) {
                        dVar.f20406y = a0Var3;
                        dVar.a(new y(a0Var3));
                        int i12 = dVar.O;
                        if (i12 != -1 && dVar.P != -1) {
                            dVar.a(new s(com.fyber.inneractive.sdk.util.l.c(i12), com.fyber.inneractive.sdk.util.l.c(dVar.P)));
                        }
                    }
                    L l10 = dVar.f20370g;
                    if (l10 != 0) {
                        ((d.f) l10).b(dVar);
                    }
                }
            }
        } catch (Exception unused) {
            IAlog.e("Couldn't find content in the view tree", new Object[0]);
            dVar.a(f.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return true;
    }
}
