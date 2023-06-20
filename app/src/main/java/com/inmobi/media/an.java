package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadWithResponseWorker.java */
/* loaded from: classes3.dex */
public final class an extends as<bb> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<cj> f24567a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f24568b;

    /* renamed from: c  reason: collision with root package name */
    private long f24569c;

    /* renamed from: d  reason: collision with root package name */
    private byte f24570d;

    /* renamed from: e  reason: collision with root package name */
    private String f24571e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public an(ad adVar, cj cjVar, byte[] bArr, long j10) {
        super(adVar, (byte) 3);
        this.f24570d = (byte) 0;
        this.f24571e = null;
        this.f24567a = new WeakReference<>(cjVar);
        this.f24568b = bArr;
        this.f24569c = j10;
    }

    private void c() {
        String str = ad.f24451a;
        this.f24570d = (byte) 1;
        b(null);
    }

    @Override // com.inmobi.media.as
    final /* synthetic */ void a(bb bbVar) {
        bb bbVar2 = bbVar;
        cj cjVar = this.f24567a.get();
        if (cjVar != null) {
            if (bbVar2 == null) {
                if (this.f24570d != 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(this.f24570d));
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, this.f24571e);
                    cjVar.f24929a.b((Map<String, Object>) hashMap);
                }
                cjVar.f24929a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 0);
                return;
            }
            cjVar.f24929a.c(bbVar2);
        }
    }

    @Override // com.inmobi.media.af
    public final void b() {
        super.b();
        cj cjVar = this.f24567a.get();
        if (cjVar != null) {
            cjVar.f24929a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (byte) 40);
        }
    }

    @Override // com.inmobi.media.af
    public final void a() {
        cj cjVar = this.f24567a.get();
        if (cjVar == null) {
            b(null);
            return;
        }
        byte[] bArr = this.f24568b;
        gy gyVar = new gy();
        gyVar.a(bArr);
        try {
            JSONObject jSONObject = new JSONObject(new cn(null, gyVar).f24943a.b());
            if (this.f24569c == jSONObject.getLong("placementId")) {
                b(cjVar.f24929a.r().a(jSONObject));
                return;
            }
            hu.a((byte) 1, "InMobi", "Placement Id of Request and response doesn't match");
            this.f24570d = (byte) 46;
            throw new bp(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f24570d);
        } catch (bp unused) {
            c();
        } catch (JSONException e10) {
            this.f24571e = e10.getMessage();
            c();
        }
    }
}
