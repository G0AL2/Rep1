package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.h3;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final h3 f14031a;

    /* renamed from: b */
    private WeakReference<g> f14032b;

    public h(h3 h3Var) {
        qe.k.f(h3Var, "videoRepository");
        this.f14031a = h3Var;
    }

    public static /* synthetic */ void b(h hVar, n nVar, String str) {
        a(hVar, nVar, str);
    }

    private final void d(n nVar) {
        WeakReference<g> weakReference;
        g gVar;
        nVar.f14207c = 6;
        if (nVar.f14208d == null || (weakReference = this.f14032b) == null || (gVar = weakReference.get()) == null) {
            return;
        }
        gVar.a(nVar);
    }

    public final h3 a() {
        return this.f14031a;
    }

    public void b(n nVar) {
        g gVar;
        g gVar2;
        g gVar3;
        if (nVar == null) {
            WeakReference<g> weakReference = this.f14032b;
            if (weakReference == null || (gVar3 = weakReference.get()) == null) {
                return;
            }
            gVar3.a(null, CBError.CBImpressionError.NO_AD_FOUND);
            return;
        }
        com.chartboost.sdk.Model.a aVar = nVar.f14208d;
        if (aVar == null) {
            WeakReference<g> weakReference2 = this.f14032b;
            if (weakReference2 == null || (gVar2 = weakReference2.get()) == null) {
                return;
            }
            gVar2.a(nVar, CBError.CBImpressionError.NO_AD_FOUND);
            return;
        }
        String str = aVar.f13668i;
        int i10 = nVar.f14207c;
        h3 h3Var = this.f14031a;
        qe.k.e(str, "videoFileName");
        boolean f10 = h3Var.f(str);
        if (i10 == 4) {
            a(nVar, f10);
        } else if (i10 != 5 && i10 != 6) {
            WeakReference<g> weakReference3 = this.f14032b;
            if (weakReference3 == null || (gVar = weakReference3.get()) == null) {
                return;
            }
            gVar.a(nVar, CBError.CBImpressionError.ERROR_PLAYING_VIDEO);
        } else {
            b(nVar, f10);
        }
    }

    public void c(n nVar) {
        g gVar;
        g gVar2;
        if (nVar == null) {
            WeakReference<g> weakReference = this.f14032b;
            if (weakReference == null || (gVar2 = weakReference.get()) == null) {
                return;
            }
            gVar2.a(null, CBError.CBImpressionError.NO_AD_FOUND);
            return;
        }
        com.chartboost.sdk.Model.a aVar = nVar.f14208d;
        if (aVar == null) {
            WeakReference<g> weakReference2 = this.f14032b;
            if (weakReference2 == null || (gVar = weakReference2.get()) == null) {
                return;
            }
            gVar.a(nVar, CBError.CBImpressionError.NO_AD_FOUND);
            return;
        }
        h3 h3Var = this.f14031a;
        String str = aVar.f13667h;
        qe.k.e(str, "appRequest.adUnit.videoUrl");
        String str2 = nVar.f14208d.f13668i;
        qe.k.e(str2, "appRequest.adUnit.videoFilename");
        h3Var.a(str, str2, false, (h3.a) null);
    }

    public void a(g gVar) {
        qe.k.f(gVar, "callback");
        this.f14032b = new WeakReference<>(gVar);
    }

    public boolean a(com.chartboost.sdk.Model.a aVar) {
        if (aVar == null) {
            return false;
        }
        String str = aVar.f13667h;
        if (str == null || str.length() == 0) {
            return false;
        }
        String str2 = aVar.f13668i;
        return !(str2 == null || str2.length() == 0);
    }

    private final void a(n nVar, boolean z10) {
        nVar.f14207c = 6;
        if (z10) {
            return;
        }
        h3 h3Var = this.f14031a;
        String str = nVar.f14208d.f13667h;
        qe.k.e(str, "appRequest.adUnit.videoUrl");
        String str2 = nVar.f14208d.f13668i;
        qe.k.e(str2, "appRequest.adUnit.videoFilename");
        h3Var.a(str, str2, false, (h3.a) null);
    }

    private final void a(final n nVar) {
        com.chartboost.sdk.Model.a aVar = nVar.f14208d;
        String str = aVar.f13667h;
        String str2 = aVar.f13668i;
        int i10 = nVar.f14207c;
        boolean z10 = i10 == 5 || i10 == 6;
        h3 h3Var = this.f14031a;
        qe.k.e(str, "videoUrl");
        qe.k.e(str2, "filename");
        h3Var.a(str, str2, z10, new h3.a() { // from class: com.chartboost.sdk.impl.r3
            @Override // com.chartboost.sdk.impl.h3.a
            public final void a(String str3) {
                h.b(h.this, nVar, str3);
            }
        });
    }

    private final void b(n nVar, boolean z10) {
        if (z10) {
            d(nVar);
        } else {
            a(nVar);
        }
    }

    public static final void a(h hVar, n nVar, String str) {
        qe.k.f(hVar, "this$0");
        qe.k.f(nVar, "$appRequest");
        qe.k.f(str, ImagesContract.URL);
        hVar.a(str, nVar);
    }

    public void a(String str, n nVar) {
        WeakReference<g> weakReference;
        g gVar;
        qe.k.f(str, ImagesContract.URL);
        qe.k.f(nVar, "appRequest");
        nVar.f14207c = 6;
        if (nVar.f14208d == null || (weakReference = this.f14032b) == null || (gVar = weakReference.get()) == null) {
            return;
        }
        gVar.a(nVar);
    }
}
