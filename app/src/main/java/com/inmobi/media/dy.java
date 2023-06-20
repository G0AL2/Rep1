package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.dw;
import java.util.Map;

/* compiled from: ViewableNativeV2DisplayAd.java */
/* loaded from: classes3.dex */
public final class dy extends dw {

    /* renamed from: d  reason: collision with root package name */
    private final n f25186d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25187e;

    /* renamed from: f  reason: collision with root package name */
    private q f25188f;

    public dy(n nVar, q qVar) {
        super(nVar);
        this.f25187e = false;
        this.f25186d = nVar;
        this.f25188f = qVar;
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        Context j10;
        if (this.f25187e || (j10 = this.f25186d.j()) == null) {
            return null;
        }
        fq fqVar = this.f25182c;
        n nVar = this.f25186d;
        this.f25181b = new fb(j10, fqVar, nVar, nVar.h());
        hu.a((byte) 2, "InMobi", "Ad markup loaded into the container will be inflated into a View.");
        View a10 = this.f25181b.a(view, viewGroup, z10, this.f25188f);
        a(a10);
        this.f25186d.s();
        return a10;
    }

    @Override // com.inmobi.media.dw
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.dw
    public final void a(Context context, byte b10) {
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
    }

    @Override // com.inmobi.media.dw
    public final void d() {
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        if (this.f25187e) {
            return;
        }
        this.f25187e = true;
        dw.a aVar = this.f25181b;
        if (aVar != null) {
            aVar.a();
            this.f25181b = null;
        }
        q qVar = this.f25188f;
        if (qVar != null) {
            qVar.destroy();
            this.f25188f = null;
        }
        super.e();
    }
}
