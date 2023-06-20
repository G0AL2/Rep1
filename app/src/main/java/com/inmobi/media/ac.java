package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdFetcherTask.java */
/* loaded from: classes3.dex */
public final class ac extends as<bb> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ad> f24449a;

    /* renamed from: b  reason: collision with root package name */
    private bp f24450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(ad adVar) {
        super(adVar, (byte) 0);
        this.f24449a = new WeakReference<>(adVar);
    }

    @Override // com.inmobi.media.as
    final /* synthetic */ void a(bb bbVar) {
        bb bbVar2 = bbVar;
        ad adVar = this.f24449a.get();
        if (adVar == null) {
            return;
        }
        adVar.f((byte) 0);
        if (this.f24450b != null) {
            ba i10 = adVar.i();
            bp bpVar = this.f24450b;
            adVar.a(i10, bpVar.f24804a, bpVar.f24805b);
        } else if (bbVar2 == null) {
            adVar.a(adVar.i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
        } else if (bbVar2.c()) {
            adVar.a(bbVar2);
        } else if (adVar.f24462l || adVar.h() == null || adVar.j() != 1) {
        } else {
            adVar.f24466p = bbVar2;
            adVar.f24472v = bbVar2.d();
            ad.a p10 = adVar.p();
            if (p10 != null) {
                p10.a(adVar.f24465o, bbVar2);
            }
        }
    }

    @Override // com.inmobi.media.af
    public final void b() {
        super.b();
        ad adVar = this.f24449a.get();
        if (adVar == null) {
            return;
        }
        adVar.a(adVar.i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (byte) 56);
    }

    @Override // com.inmobi.media.af
    public final void a() {
        ad adVar = this.f24449a.get();
        if (adVar == null) {
            this.f24450b = new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            b(null);
            return;
        }
        boolean z10 = true;
        if (!((gd) fs.a("root", ho.f(), null)).i()) {
            adVar.f24455e = System.currentTimeMillis();
            try {
                bc r10 = adVar.r();
                cm C = adVar.C();
                Integer w10 = adVar.w();
                if (w10 != null) {
                    if (SystemClock.elapsedRealtime() - r10.f24693c >= w10.intValue() * 1000) {
                        z10 = false;
                    }
                    if (z10) {
                        throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST), (byte) 16);
                    }
                }
                bc.a(C);
                r10.f24693c = SystemClock.elapsedRealtime();
                cn a10 = new cl(C).a();
                if (a10 != null) {
                    if (a10.f24943a.f25627a == null) {
                        b(r10.a(a10));
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(a10.f24943a.f25627a.f25605a));
                    r10.a(hashMap);
                    throw new bp(a10.f24944b, (byte) 0);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 7);
                r10.a(hashMap2);
                throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 0);
            } catch (bp e10) {
                String str = ad.f24451a;
                this.f24450b = e10;
                b(null);
                return;
            }
        }
        hu.a((byte) 1, ad.f24451a, "SDK will not perform this load operation as monetization has been disabled. Please contact InMobi for further info.");
        this.f24450b = new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (byte) 9);
        b(null);
    }
}
