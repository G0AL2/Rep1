package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: AuctionCloseWorker.java */
/* loaded from: classes3.dex */
final class ae extends as<InMobiAdRequestStatus> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ad> f24507a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f24508b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(ad adVar, JSONObject jSONObject) {
        super(adVar, (byte) 4);
        this.f24507a = new WeakReference<>(adVar);
        this.f24508b = jSONObject;
    }

    @Override // com.inmobi.media.as
    final /* synthetic */ void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        ad.a p10;
        InMobiAdRequestStatus inMobiAdRequestStatus2 = inMobiAdRequestStatus;
        ad adVar = this.f24507a.get();
        if (adVar == null || (p10 = adVar.p()) == null) {
            return;
        }
        if (inMobiAdRequestStatus2 == null) {
            adVar.f24452b = (byte) 2;
            adVar.b(p10);
            return;
        }
        p10.a(inMobiAdRequestStatus2);
    }

    @Override // com.inmobi.media.af
    public final void b() {
        ad.a p10;
        super.b();
        ad adVar = this.f24507a.get();
        if (adVar == null || (p10 = adVar.p()) == null) {
            return;
        }
        p10.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
    }

    @Override // com.inmobi.media.af
    public final void a() {
        bb bbVar;
        ad adVar = this.f24507a.get();
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (adVar != null && (bbVar = adVar.f24466p) != null) {
            try {
                bbVar.a(this.f24508b, adVar.f24453c);
                b(null);
                return;
            } catch (Exception unused) {
                String str = ad.f24451a;
                b(inMobiAdRequestStatus);
                return;
            }
        }
        b(inMobiAdRequestStatus);
    }
}
