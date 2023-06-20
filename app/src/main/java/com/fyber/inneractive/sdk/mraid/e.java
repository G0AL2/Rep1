package com.fyber.inneractive.sdk.mraid;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends a {
    public e(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        int a10 = a("w");
        int a11 = a("h");
        String str = this.f17489b.get(ImagesContract.URL);
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f17489b.get("shouldUseCustomClose"));
        boolean equals2 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f17489b.get("lockOrientation"));
        if (a10 <= 0) {
            a10 = -1;
        }
        if (a11 <= 0) {
            a11 = -1;
        }
        com.fyber.inneractive.sdk.web.d dVar = this.f17490c;
        if (dVar.f20365b == null || dVar.f20407z == d.EnumC0274d.DISABLED || dVar.f20406y != a0.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            dVar.a(f.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        int i10 = 0;
        try {
            ViewGroup viewGroup = (ViewGroup) dVar.f20365b.getRootView().findViewById(16908290);
            dVar.C = viewGroup;
            if (viewGroup == null) {
                IAlog.e("Couldn't find content in the view tree", new Object[0]);
                dVar.a(f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            dVar.I = equals;
            L l10 = dVar.f20370g;
            if (l10 != 0) {
                ((d.f) l10).a(dVar, equals);
            }
            dVar.d(equals2);
            if (dVar.P >= 0) {
                dVar.P = com.fyber.inneractive.sdk.util.l.b(a11);
            }
            if (dVar.O >= 0) {
                dVar.O = com.fyber.inneractive.sdk.util.l.b(a10);
            }
            com.fyber.inneractive.sdk.web.c cVar = dVar.f20365b;
            if (str != null) {
                com.fyber.inneractive.sdk.web.c cVar2 = new com.fyber.inneractive.sdk.web.c(dVar.g());
                dVar.D = cVar2;
                cVar2.setId(R.id.inneractive_webview_mraid);
                dVar.D.loadUrl(str);
                dVar.D.setWebChromeClient(dVar.f20366c);
                dVar.D.setWebViewClient(dVar.f20367d);
                cVar = dVar.D;
                cVar.setOnKeyListener(new com.fyber.inneractive.sdk.web.h(dVar));
            } else {
                ViewGroup viewGroup2 = (ViewGroup) cVar.getParent();
                if (viewGroup2 != null) {
                    int childCount = viewGroup2.getChildCount();
                    while (i10 < childCount && viewGroup2.getChildAt(i10) != dVar.f20365b) {
                        i10++;
                    }
                    dVar.R = i10;
                    com.fyber.inneractive.sdk.util.s.a(dVar.S);
                    viewGroup2.addView(dVar.S, i10, new ViewGroup.LayoutParams(dVar.f20365b.getWidth(), dVar.f20365b.getHeight()));
                    viewGroup2.removeView(dVar.f20365b);
                }
            }
            float f10 = dVar.J;
            int i11 = (int) ((50.0f * f10) + 0.5f);
            if (a11 >= 0 && a10 >= 0) {
                a10 = (int) (a10 * f10);
                a11 = (int) (a11 * f10);
                if (a10 < i11) {
                    a10 = i11;
                }
                if (a11 < i11) {
                    a11 = i11;
                }
            }
            View view = new View(dVar.g());
            view.setBackgroundColor(dVar.g().getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
            view.setOnTouchListener(new com.fyber.inneractive.sdk.web.l(dVar));
            dVar.U.addView(view, new RelativeLayout.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.util.s.a(cVar);
            dVar.T.addView(cVar, new RelativeLayout.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.util.s.a(dVar.T);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a11);
            layoutParams.addRule(13);
            dVar.U.addView(dVar.T, layoutParams);
            com.fyber.inneractive.sdk.util.s.a(dVar.U);
            dVar.C.addView(dVar.U, new ViewGroup.LayoutParams(-1, -1));
            if (!cVar.hasFocus()) {
                cVar.requestFocus();
            }
            d.h hVar = dVar.A;
            if (hVar == d.h.ALWAYS_VISIBLE || (!dVar.I && hVar != d.h.ALWAYS_HIDDEN)) {
                dVar.c(true);
            }
            a0 a0Var = a0.EXPANDED;
            dVar.f20406y = a0Var;
            dVar.a(new y(a0Var));
            int i12 = dVar.O;
            if (i12 != -1 && dVar.P != -1) {
                dVar.a(new s(com.fyber.inneractive.sdk.util.l.c(i12), com.fyber.inneractive.sdk.util.l.c(dVar.P)));
            }
            L l11 = dVar.f20370g;
            if (l11 != 0) {
                ((d.f) l11).a(dVar);
            }
        } catch (Exception unused) {
            IAlog.e("Couldn't find content in the view tree", new Object[0]);
            dVar.a(f.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.f17489b.get(ImagesContract.URL);
    }
}
