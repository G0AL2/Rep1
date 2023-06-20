package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeLoadMarkupInContainerNative.java */
/* loaded from: classes3.dex */
public final class ap extends as<Byte> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ao> f24577a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ap(ao aoVar) {
        super(aoVar, (byte) 6);
        this.f24577a = new WeakReference<>(aoVar);
    }

    @Override // com.inmobi.media.as
    final /* synthetic */ void a(Byte b10) {
        Byte b11 = b10;
        ao aoVar = this.f24577a.get();
        if (aoVar == null) {
            return;
        }
        if (b11.byteValue() == 0) {
            if (2 == aoVar.j()) {
                aoVar.f24452b = (byte) 4;
                j s10 = aoVar.s();
                q M = aoVar.M();
                ad.a p10 = aoVar.p();
                if (!(s10 instanceof n)) {
                    if (p10 != null) {
                        String str = ao.f24572x;
                        p10.a(aoVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
                n nVar = (n) s10;
                nVar.f25915t = M;
                nVar.f25917v = aoVar.f24458h;
                aoVar.I();
                if (p10 != null) {
                    String str2 = ao.f24572x;
                    aoVar.c(p10);
                    return;
                }
                return;
            }
            return;
        }
        aoVar.a(new WeakReference<>(aoVar.p()), b11.byteValue(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
    }

    @Override // com.inmobi.media.af
    public final void b() {
        ad.a p10;
        super.b();
        ao aoVar = this.f24577a.get();
        if (aoVar == null || (p10 = aoVar.p()) == null) {
            return;
        }
        p10.a(aoVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.af
    public final void a() {
        ao aoVar = this.f24577a.get();
        if (aoVar == null) {
            b((byte) 13);
        } else {
            b(Byte.valueOf(aoVar.e(aoVar.p())));
        }
    }
}
