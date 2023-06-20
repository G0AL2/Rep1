package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.dw;
import com.inmobi.media.fc;

/* compiled from: NativeInflater.java */
/* loaded from: classes3.dex */
public class fb extends dw.a implements fc.b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f25338c = "fb";

    /* renamed from: b  reason: collision with root package name */
    public final fc f25339b;

    /* renamed from: d  reason: collision with root package name */
    private final n f25340d;

    public fb(Context context, fq fqVar, n nVar, bx bxVar) {
        this.f25340d = nVar;
        this.f25339b = new fc(context, fqVar, nVar, bxVar, new fc.c() { // from class: com.inmobi.media.fb.1
            @Override // com.inmobi.media.fc.c
            public final void a(int i10, bt btVar) {
                fb fbVar = fb.this;
                if (fbVar.f25184a) {
                    return;
                }
                fbVar.f25340d.a(i10, btVar);
            }
        }, new fc.a() { // from class: com.inmobi.media.fb.2
            @Override // com.inmobi.media.fc.a
            public final void a(View view, bt btVar) {
                fb fbVar = fb.this;
                if (fbVar.f25184a) {
                    return;
                }
                fbVar.f25340d.a(view, btVar);
                fb.this.f25340d.a(btVar, false);
            }
        }, this);
        fl.a(nVar.f25912q);
    }

    @Override // com.inmobi.media.dw.a
    public final View a(View view, ViewGroup viewGroup, boolean z10, q qVar) {
        fe a10;
        if (view != null) {
            View findViewWithTag = view.findViewWithTag("InMobiAdView");
            if (findViewWithTag != null) {
                fe feVar = (fe) findViewWithTag;
                if (z10) {
                    a10 = this.f25339b.b(feVar, viewGroup, qVar);
                } else {
                    a10 = this.f25339b.a(feVar, viewGroup, qVar);
                }
            } else if (z10) {
                a10 = this.f25339b.b(null, viewGroup, qVar);
            } else {
                a10 = this.f25339b.a(null, viewGroup, qVar);
            }
        } else if (z10) {
            a10 = this.f25339b.b(null, viewGroup, qVar);
        } else {
            a10 = this.f25339b.a(null, viewGroup, qVar);
        }
        a10.setNativeStrandAd(this.f25340d);
        a10.setTag("InMobiAdView");
        return a10;
    }

    @Override // com.inmobi.media.dw.a
    public final void a() {
        this.f25339b.a();
        super.a();
    }

    @Override // com.inmobi.media.fc.b
    public final void a(cd cdVar) {
        if (cdVar.f24819k == 1) {
            this.f25340d.b();
        }
    }
}
