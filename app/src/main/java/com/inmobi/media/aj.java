package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetSignalsWorker.java */
/* loaded from: classes3.dex */
public final class aj extends as<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ad> f24539a;

    /* renamed from: b  reason: collision with root package name */
    private bp f24540b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24541c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aj(ad adVar, long j10) {
        super(adVar, (byte) 2);
        this.f24539a = new WeakReference<>(adVar);
        this.f24541c = j10;
    }

    @Override // com.inmobi.media.as
    final /* synthetic */ void a(byte[] bArr) {
        byte[] bArr2 = bArr;
        ad adVar = this.f24539a.get();
        if (adVar == null) {
            return;
        }
        if (this.f24540b != null) {
            adVar.f24452b = (byte) 3;
        }
        ad.a p10 = adVar.p();
        if (p10 == null) {
            return;
        }
        bp bpVar = this.f24540b;
        if (bpVar != null) {
            adVar.a(bpVar.f24805b, this.f24541c);
            p10.b(new InMobiAdRequestStatus(this.f24540b.f24804a.getStatusCode()));
        } else if (bArr2 == null) {
            adVar.f24452b = (byte) 3;
            adVar.a(13, this.f24541c);
            p10.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            long j10 = this.f24541c;
            adVar.f24463m = false;
            HashMap hashMap = new HashMap();
            hashMap.put("adType", adVar.k());
            hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j10));
            hashMap.put("networkType", ib.b());
            adVar.c("AdGetSignalsSucceeded", hashMap);
            p10.a(bArr2);
        }
    }

    @Override // com.inmobi.media.af
    public final void b() {
        ad.a p10;
        super.b();
        ad adVar = this.f24539a.get();
        if (adVar == null || (p10 = adVar.p()) == null) {
            return;
        }
        p10.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.af
    public final void a() {
        ad adVar = this.f24539a.get();
        if (adVar != null && adVar.f24464n != null) {
            if (adVar.p() == null) {
                b(null);
                return;
            }
            try {
                cj cjVar = adVar.f24464n;
                ck ckVar = new ck(cjVar.f24929a);
                cjVar.f24930b = ckVar;
                cm C = ckVar.f24931a.C();
                HashMap hashMap = new HashMap();
                hashMap.put("h-user-agent", ho.i());
                C.c(hashMap);
                C.a();
                if (!((gd) fs.a("root", ho.f(), null)).i()) {
                    if (C.f25622q) {
                        b(C.f().getBytes());
                        return;
                    }
                    throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), (byte) 21);
                }
                throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (byte) 9);
            } catch (bp e10) {
                this.f24540b = e10;
                b(null);
                return;
            }
        }
        b(null);
    }
}
