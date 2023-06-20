package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: AdNetworkResponse.java */
/* loaded from: classes3.dex */
public final class cn {

    /* renamed from: a  reason: collision with root package name */
    public gy f24943a;

    /* renamed from: b  reason: collision with root package name */
    public InMobiAdRequestStatus f24944b;

    /* renamed from: c  reason: collision with root package name */
    private cm f24945c;

    public cn(cm cmVar, gy gyVar) {
        this.f24945c = cmVar;
        this.f24943a = gyVar;
        gw gwVar = gyVar.f25627a;
        if (gwVar != null) {
            int i10 = gwVar.f25605a;
            if (i10 == -8) {
                this.f24944b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
            } else if (i10 == -7) {
                InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                this.f24944b = inMobiAdRequestStatus;
                String str = this.f24943a.f25627a.f25606b;
                if (str != null) {
                    inMobiAdRequestStatus.setCustomMessage(str);
                }
            } else if (i10 != 0) {
                switch (i10) {
                    case 500:
                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /* 501 */:
                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /* 502 */:
                    case 503:
                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /* 505 */:
                        this.f24944b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                        return;
                    case ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOK_GUEST /* 504 */:
                        this.f24944b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                        return;
                    default:
                        this.f24944b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                        return;
                }
            } else {
                this.f24944b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
            }
        }
    }
}
