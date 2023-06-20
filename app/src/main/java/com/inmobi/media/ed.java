package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.dw;
import java.util.Map;

/* compiled from: InMobiTrackedHtmlAd.java */
/* loaded from: classes3.dex */
public class ed extends dw {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25213d = "ed";

    /* renamed from: e  reason: collision with root package name */
    private final dw f25214e;

    /* renamed from: f  reason: collision with root package name */
    private final ec f25215f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25216g;

    /* renamed from: h  reason: collision with root package name */
    private final int f25217h;

    public ed(j jVar, ec ecVar, dw dwVar, int i10, int i11) {
        super(jVar);
        this.f25214e = dwVar;
        this.f25215f = ecVar;
        this.f25216g = i10;
        this.f25217h = i11;
    }

    @Override // com.inmobi.media.dw
    public final dw.a a() {
        return this.f25214e.a();
    }

    @Override // com.inmobi.media.dw
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.dw
    public final View b() {
        return this.f25214e.b();
    }

    @Override // com.inmobi.media.dw
    public final View c() {
        return this.f25214e.c();
    }

    @Override // com.inmobi.media.dw
    public final void d() {
        View b10 = this.f25214e.b();
        if (b10 != null) {
            this.f25215f.a(b10);
            this.f25214e.d();
        }
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        this.f25215f.d();
        super.e();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0023 -> B:20:0x001a). Please submit an issue!!! */
    @Override // com.inmobi.media.dw
    public final void a(Context context, byte b10) {
        try {
            try {
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
            if (b10 == 0) {
                this.f25215f.b();
            } else if (b10 != 1) {
                if (b10 == 2) {
                    this.f25215f.d();
                }
            } else {
                this.f25215f.a();
            }
        } finally {
            this.f25214e.a(context, b10);
        }
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        View b10 = this.f25214e.b();
        if (b10 != null) {
            this.f25215f.a(b10);
        }
        return this.f25214e.a(view, viewGroup, z10);
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
        View b10 = this.f25214e.b();
        if (b10 != null) {
            this.f25215f.a(b10, b10, this.f25216g, this.f25217h);
            this.f25214e.a(map);
        }
    }
}
