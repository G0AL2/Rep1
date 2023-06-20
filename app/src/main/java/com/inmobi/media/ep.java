package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.er;
import java.util.List;
import java.util.Map;

/* compiled from: OmidTrackedNativeDisplayAd.java */
/* loaded from: classes3.dex */
public class ep extends dv {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25277d = "ep";

    /* renamed from: e  reason: collision with root package name */
    private final dw f25278e;

    /* renamed from: f  reason: collision with root package name */
    private ek f25279f;

    public ep(j jVar, dw dwVar, ek ekVar) {
        super(jVar);
        this.f25278e = dwVar;
        this.f25279f = ekVar;
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        return this.f25278e.a(view, viewGroup, z10);
    }

    @Override // com.inmobi.media.dw
    public final View b() {
        return this.f25278e.b();
    }

    @Override // com.inmobi.media.dw
    public final View c() {
        return this.f25278e.c();
    }

    @Override // com.inmobi.media.dw
    public final void d() {
        try {
            this.f25279f.a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25278e.d();
            throw th;
        }
        this.f25278e.d();
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        super.e();
        try {
            this.f25279f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25278e.e();
            throw th;
        }
        this.f25278e.e();
    }

    @Override // com.inmobi.media.dw
    public final void a(byte b10) {
        try {
            this.f25279f.a(b10);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25278e.a(b10);
            throw th;
        }
        this.f25278e.a(b10);
    }

    @Override // com.inmobi.media.dw
    public final void a(Context context, byte b10) {
        this.f25278e.a(context, b10);
    }

    public static ek a(List<VerificationScriptResource> list, String str, String str2) {
        return new el("native_display_ad", ImpressionType.VIEWABLE, er.a.f25286a.a(list, str, str2));
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
        View f10;
        try {
            if (this.f25182c.viewability.omidConfig.omidEnabled && er.a.f25286a.a()) {
                j jVar = this.f25180a;
                if ((jVar instanceof n) && (f10 = ((n) jVar).f()) != null) {
                    this.f25279f.a(f10, map, this.f25278e.b());
                }
                a((byte) 19);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25278e.a(map);
            throw th;
        }
        this.f25278e.a(map);
    }
}
