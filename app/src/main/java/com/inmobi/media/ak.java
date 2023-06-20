package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntLoadMarkupInContainerNative.java */
/* loaded from: classes3.dex */
public final class ak extends as<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<al> f24542a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<ad.a> f24543b;

    /* renamed from: c  reason: collision with root package name */
    private byte f24544c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(al alVar, ad.a aVar) {
        super(alVar, (byte) 5);
        this.f24542a = new WeakReference<>(alVar);
        this.f24543b = new WeakReference<>(aVar);
    }

    @Override // com.inmobi.media.as
    final /* synthetic */ void a(Boolean bool) {
        ad.a aVar;
        Boolean bool2 = bool;
        al alVar = this.f24542a.get();
        if (alVar == null || (aVar = this.f24543b.get()) == null) {
            return;
        }
        if (bool2.booleanValue()) {
            j s10 = alVar.s();
            q M = alVar.M();
            if (M != null) {
                if (s10 instanceof n) {
                    n nVar = (n) s10;
                    nVar.f25915t = M;
                    nVar.f25917v = alVar.f24458h;
                } else {
                    alVar.b(aVar, (byte) 84);
                    return;
                }
            }
            alVar.i(aVar);
            return;
        }
        byte b10 = this.f24544c;
        if (b10 != 0) {
            alVar.a(this.f24543b, b10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            alVar.b(aVar, (byte) 85);
        }
    }

    @Override // com.inmobi.media.af
    public final void b() {
        super.b();
        al alVar = this.f24542a.get();
        if (alVar == null || this.f24543b.get() == null) {
            return;
        }
        alVar.a(this.f24543b, (byte) 40, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.af
    public final void a() {
        al alVar = this.f24542a.get();
        if (alVar == null) {
            b(Boolean.FALSE);
            return;
        }
        ad.a aVar = this.f24543b.get();
        if (aVar == null) {
            b(Boolean.FALSE);
            return;
        }
        au u10 = alVar.u();
        if ((u10 == null || u10.a(alVar.f24453c.a(alVar.k()).timeToLive)) ? false : true) {
            byte e10 = alVar.e(aVar);
            this.f24544c = e10;
            b(Boolean.valueOf(e10 == 0));
            return;
        }
        b(Boolean.FALSE);
    }
}
