package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: HtmlMarkupAdHandler.java */
/* loaded from: classes3.dex */
public class cs extends cr {

    /* renamed from: a  reason: collision with root package name */
    private final String f25003a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25004b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f25005c;

    /* renamed from: d  reason: collision with root package name */
    private j f25006d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f25007e;

    /* renamed from: f  reason: collision with root package name */
    private cp f25008f;

    /* renamed from: g  reason: collision with root package name */
    private cp f25009g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25010h;

    public cs(WeakReference<Activity> weakReference, j jVar, RelativeLayout relativeLayout) {
        super(relativeLayout);
        this.f25003a = cs.class.getSimpleName();
        this.f25004b = "InMobi";
        this.f25010h = false;
        this.f25005c = weakReference;
        this.f25006d = jVar;
        this.f25007e = relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void c() {
        if (this.f25010h) {
            return;
        }
        try {
            this.f25010h = true;
            if (this.f25006d.getFullScreenEventsListener() != null) {
                this.f25006d.getFullScreenEventsListener().a(null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void e() {
        Activity activity = this.f25005c.get();
        if (activity instanceof InMobiAdActivity ? ((InMobiAdActivity) activity).f24414b : false) {
            try {
                this.f25006d.getFullScreenEventsListener().b(null);
            } catch (Exception unused) {
                hu.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            }
        } else {
            q qVar = (q) this.f25006d;
            qVar.setFullScreenActivityContext(null);
            try {
                qVar.b();
            } catch (Exception unused2) {
                hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
        }
        this.f25006d.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void f() {
        q qVar;
        if (this.f25006d.c() || (qVar = (q) this.f25006d) == null) {
            return;
        }
        String str = qVar.f25966p;
        if (str != null) {
            qVar.a(str, "broadcastEvent('backButtonPressed')");
        }
        if (qVar.f25965o) {
            return;
        }
        try {
            qVar.b();
        } catch (Exception unused) {
            hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    @Override // com.inmobi.media.cr
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.inmobi.media.cr
    public final /* bridge */ /* synthetic */ void a(float f10) {
        super.a(f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void b() {
        if (1 == this.f25006d.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                cp cpVar = this.f25008f;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.CLOSE_AD;
                hashMap.put(cpVar, friendlyObstructionPurpose);
                hashMap.put(this.f25009g, friendlyObstructionPurpose);
                dw viewableAd = this.f25006d.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(hashMap);
                }
            } catch (Exception unused) {
                if (this.f25006d.getFullScreenEventsListener() != null) {
                    this.f25006d.getFullScreenEventsListener().a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void a() {
        float f10 = ic.a().f25747c;
        this.f25007e.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.inmobi.media.cs.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    cs.this.f25006d.b();
                } catch (Exception unused) {
                    String unused2 = cs.this.f25003a;
                    hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                }
            }
        };
        int i10 = (int) (50.0f * f10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(11);
        cp cpVar = new cp(this.f25007e.getContext(), f10, (byte) 0);
        this.f25008f = cpVar;
        cpVar.setId(i.f25721d);
        this.f25008f.setOnClickListener(onClickListener);
        cp cpVar2 = new cp(this.f25007e.getContext(), f10, (byte) 1);
        this.f25009g = cpVar2;
        cpVar2.setId(i.f25722e);
        this.f25009g.setOnClickListener(onClickListener);
        View c10 = this.f25006d.getViewableAd().c();
        if (c10 != null) {
            ViewGroup viewGroup = (ViewGroup) c10.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(c10);
            }
            this.f25007e.addView(c10, layoutParams);
            this.f25007e.addView(this.f25008f, layoutParams2);
            this.f25007e.addView(this.f25009g, layoutParams2);
            j jVar = this.f25006d;
            ((q) jVar).b(((q) jVar).f25964n);
            j jVar2 = this.f25006d;
            ((q) jVar2).c(((q) jVar2).f25962l);
        }
    }

    @Override // com.inmobi.media.cr
    public final void a(df dfVar) {
        super.a(dfVar);
        int i10 = dfVar.f25102e;
        ((q) this.f25006d).d("window.imraid.broadcastEvent('orientationChange','" + i10 + "');");
    }
}
