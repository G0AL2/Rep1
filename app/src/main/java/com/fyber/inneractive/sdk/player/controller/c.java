package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.web.d;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public IAmraidWebViewController f17864a;

    /* renamed from: c  reason: collision with root package name */
    public UnitDisplayType f17866c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17868e;

    /* renamed from: b  reason: collision with root package name */
    public d.g f17865b = d.g.INLINE;

    /* renamed from: d  reason: collision with root package name */
    public d.EnumC0274d f17867d = d.EnumC0274d.ENABLED;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17869a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f17870b;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.model.vast.g.values().length];
            f17870b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17870b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17870b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[UnitDisplayType.values().length];
            f17869a = iArr2;
            try {
                iArr2[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17869a[UnitDisplayType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public c(Context context, UnitDisplayType unitDisplayType, boolean z10, int i10, int i11, z zVar, com.fyber.inneractive.sdk.model.vast.g gVar) {
        a(unitDisplayType, z10);
        try {
            this.f17864a = new IAmraidWebViewController(context, com.fyber.inneractive.sdk.util.g.a(unitDisplayType, IAConfigManager.b().a()), this.f17865b, this.f17867d, d.h.AD_CONTROLLED, true, null);
            a(gVar);
            f0.a().a(context, this.f17864a.a(), this.f17864a);
            this.f17864a.c();
            q0 a10 = com.fyber.inneractive.sdk.renderers.g.a(i10, i11, zVar);
            this.f17864a.setAdDefaultSize(a10.f20323a, a10.f20324b);
        } catch (Throwable unused) {
            this.f17864a = null;
        }
    }

    public void a(UnitDisplayType unitDisplayType, boolean z10) {
        this.f17866c = unitDisplayType;
        this.f17868e = z10;
        int i10 = a.f17869a[unitDisplayType.ordinal()];
        if (i10 != 1 && i10 != 2) {
            this.f17867d = d.EnumC0274d.ENABLED;
            return;
        }
        this.f17867d = d.EnumC0274d.ENABLED;
        if (z10) {
            this.f17865b = d.g.INTERSTITIAL;
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.g gVar) {
        com.fyber.inneractive.sdk.web.c cVar = this.f17864a.f20365b;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            cVar.setId(R.id.inneractive_vast_endcard_gif);
        } else if (ordinal == 1) {
            cVar.setId(R.id.inneractive_vast_endcard_iframe);
        } else if (ordinal != 2) {
        } else {
            cVar.setId(R.id.inneractive_vast_endcard_html);
        }
    }
}
