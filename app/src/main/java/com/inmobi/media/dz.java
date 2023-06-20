package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.dw;
import java.util.Map;

/* compiled from: ViewableNativeV2VideoAd.java */
/* loaded from: classes3.dex */
public final class dz extends dw {

    /* renamed from: d  reason: collision with root package name */
    private final o f25189d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25190e;

    public dz(o oVar) {
        super(oVar);
        this.f25190e = false;
        this.f25189d = oVar;
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        Context j10;
        if (this.f25190e || (j10 = this.f25189d.j()) == null) {
            return null;
        }
        fq fqVar = this.f25182c;
        o oVar = this.f25189d;
        fb fbVar = new fb(j10, fqVar, oVar, oVar.h());
        this.f25181b = fbVar;
        View a10 = fbVar.a(view, viewGroup, false, null);
        a(a10);
        this.f25189d.s();
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
        if (this.f25190e) {
            return;
        }
        this.f25190e = true;
        dw.a aVar = this.f25181b;
        if (aVar != null) {
            aVar.a();
            this.f25181b = null;
        }
        super.e();
    }
}
