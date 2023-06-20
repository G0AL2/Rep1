package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ic;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;

/* compiled from: InMobiActivityAdViewHandler.java */
/* loaded from: classes3.dex */
public final class ct implements cw {

    /* renamed from: a */
    WeakReference<Activity> f25012a;

    /* renamed from: b */
    public cr f25013b;

    /* renamed from: d */
    u f25015d;

    /* renamed from: h */
    private RelativeLayout f25019h;

    /* renamed from: g */
    private final String f25018g = "InMobiActivityViewHandler";

    /* renamed from: c */
    public j f25014c = null;

    /* renamed from: i */
    private df f25020i = df.a(ic.b());

    /* renamed from: e */
    float f25016e = 1.0f;

    /* renamed from: f */
    final x f25017f = new x() { // from class: com.inmobi.media.d0
        @Override // com.inmobi.media.x
        public final void finish() {
            ct.a(ct.this);
        }
    };

    /* renamed from: j */
    private final w f25021j = new w() { // from class: com.inmobi.media.ct.1
        {
            ct.this = this;
        }

        @Override // com.inmobi.media.w
        public final void a(String str, v vVar, float f10, boolean z10) {
            ct ctVar = ct.this;
            Activity activity = ctVar.f25012a.get();
            if (activity != null) {
                if (ctVar.f25015d == null) {
                    u uVar = new u(activity);
                    ctVar.f25015d = uVar;
                    uVar.setId(i.f25724g);
                    ctVar.f25015d.setEmbeddedBrowserUpdateListener(ctVar.f25017f);
                }
                ctVar.a(ctVar.f25014c);
                ctVar.f25015d.a(str, vVar, z10);
                float f11 = 1.0f - f10;
                ctVar.f25016e = f11;
                cr crVar = ctVar.f25013b;
                if (crVar != null) {
                    crVar.a(f11);
                    ctVar.f25013b.g();
                }
                ctVar.b();
            }
        }

        @Override // com.inmobi.media.w
        public final void a() {
            ct.this.h();
        }
    };

    public ct(Activity activity) {
        this.f25012a = new WeakReference<>(activity);
    }

    public static /* synthetic */ void a(ct ctVar) {
        ctVar.h();
    }

    private void b(j jVar) {
        if (this.f25012a.get() == null || this.f25019h == null) {
            return;
        }
        String markupType = jVar.getMarkupType();
        markupType.hashCode();
        char c10 = 65535;
        switch (markupType.hashCode()) {
            case -1084172778:
                if (markupType.equals("inmobiJson")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3213227:
                if (markupType.equals("html")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1236050372:
                if (markupType.equals("htmlUrl")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f25013b = new cv(this.f25012a, jVar, this.f25019h);
                break;
            case 1:
            case 2:
                this.f25013b = new cs(this.f25012a, jVar, this.f25019h);
                break;
            default:
                throw new IllegalArgumentException("Unknown Markup Type");
        }
        this.f25013b.a(this.f25016e);
        this.f25013b.a(this.f25020i);
    }

    private void c(j jVar) {
        if (jVar instanceof q) {
            ((q) jVar).setEmbeddedBrowserJSCallbacks(this.f25021j);
        }
    }

    private void d() {
        Activity activity = this.f25012a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
        if (((RelativeLayout) frameLayout.findViewById(i.f25723f)) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(i.f25723f);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void e() {
        Activity activity = this.f25012a.get();
        if (activity == null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        this.f25019h = relativeLayout;
        relativeLayout.setId(i.f25719b);
    }

    private void f() {
        RelativeLayout relativeLayout;
        Activity activity = this.f25012a.get();
        if (activity == null || (relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(i.f25723f)) == null || this.f25019h == null) {
            return;
        }
        a(relativeLayout);
        relativeLayout.addView(this.f25019h);
        this.f25013b.g();
    }

    private void g() {
        Activity activity = this.f25012a.get();
        if (activity instanceof InMobiAdActivity) {
            activity.finish();
        }
    }

    public final void a(Intent intent, SparseArray<j> sparseArray) {
        Activity activity;
        if (intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            j jVar = sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
            if (jVar == null) {
                g();
                return;
            }
            int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", -1);
            if (intExtra == -1) {
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().a();
                }
                g();
                return;
            }
            if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (activity = this.f25012a.get()) != null) {
                activity.requestWindowFeature(1);
                activity.getWindow().setFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            }
            if (a(intExtra, jVar)) {
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().a();
                }
                g();
                return;
            }
            try {
                this.f25014c = jVar;
                jVar.setFullScreenActivityContext(this.f25012a.get());
                d();
                e();
                b(jVar);
                this.f25013b.a();
                f();
                c(jVar);
                a(jVar);
            } catch (Exception e10) {
                jVar.setFullScreenActivityContext(null);
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().a();
                }
                g();
                gg.a().a(new hg(e10));
            }
        }
    }

    /* renamed from: c */
    public final void h() {
        u uVar = this.f25015d;
        if (uVar != null) {
            uVar.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        u uVar2 = this.f25015d;
        if (uVar2 != null) {
            ViewParent parent = uVar2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f25015d);
            }
            this.f25015d.b();
            this.f25015d = null;
        }
        this.f25016e = 1.0f;
        cr crVar = this.f25013b;
        if (crVar != null) {
            crVar.a(1.0f);
            this.f25013b.g();
        }
    }

    final void b() {
        u uVar = this.f25015d;
        if (uVar == null) {
            return;
        }
        ic.a b10 = ic.b(uVar.getContext());
        if (this.f25020i.a()) {
            a((int) (b10.f25743a * (1.0f - this.f25016e)), -1);
        } else {
            a(-1, (int) (b10.f25744b * (1.0f - this.f25016e)));
        }
    }

    private static boolean b(RelativeLayout relativeLayout) {
        return ((RelativeLayout) relativeLayout.findViewById(i.f25724g)) != null;
    }

    private static void a(RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(i.f25719b);
        if (relativeLayout2 != null) {
            relativeLayout.removeView(relativeLayout2);
        }
    }

    final void a(j jVar) {
        u uVar;
        if (!(jVar instanceof q) || (uVar = this.f25015d) == null) {
            return;
        }
        uVar.setUserLeftApplicationListener(((q) jVar).getListener());
    }

    public final void a() {
        cr crVar = this.f25013b;
        if (crVar != null) {
            crVar.e();
        }
        RelativeLayout relativeLayout = this.f25019h;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        u uVar = this.f25015d;
        if (uVar != null) {
            uVar.b();
        }
        this.f25012a.clear();
        this.f25014c = null;
        this.f25013b = null;
        this.f25019h = null;
        this.f25015d = null;
    }

    @Override // com.inmobi.media.cw
    public final void a(df dfVar) {
        if (this.f25012a.get() == null) {
            return;
        }
        cr crVar = this.f25013b;
        if (crVar != null) {
            crVar.a(dfVar);
        }
        if (dfVar != null && this.f25020i.a() == dfVar.a()) {
            this.f25020i = dfVar;
            return;
        }
        this.f25020i = dfVar;
        cr crVar2 = this.f25013b;
        if (crVar2 != null) {
            crVar2.g();
        }
        b();
    }

    private static boolean a(int i10, j jVar) {
        if (200 != i10 || "html".equals(jVar.getMarkupType())) {
            if (202 != i10 || "htmlUrl".equals(jVar.getMarkupType())) {
                return 201 == i10 && !"inmobiJson".equals(jVar.getMarkupType());
            }
            return true;
        }
        return true;
    }

    private void a(int i10, int i11) {
        Activity activity = this.f25012a.get();
        if (activity == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
        if (this.f25020i.a()) {
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(i.f25723f);
        if (relativeLayout == null || this.f25015d == null) {
            return;
        }
        if (b(relativeLayout)) {
            this.f25015d.setLayoutParams(layoutParams);
        } else {
            relativeLayout.addView(this.f25015d, layoutParams);
        }
    }
}
