package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f7164a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxMediatedNetworkInfo f7165b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f7166c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7167d;

    /* renamed from: e  reason: collision with root package name */
    private final MaxError f7168e;

    /* renamed from: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7169a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f7169a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7169a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, Bundle bundle, MaxMediatedNetworkInfo maxMediatedNetworkInfo, long j10, MaxError maxError) {
        this.f7164a = adLoadState;
        this.f7165b = maxMediatedNetworkInfo;
        this.f7166c = bundle;
        this.f7167d = j10;
        this.f7168e = maxError;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f7164a;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f7166c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxError getError() {
        return this.f7168e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f7167d;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f7165b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r1 != 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.append(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.f7164a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r4.f7165b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r4.f7166c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.AnonymousClass1.f7169a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r4.f7164a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L3d
            r2 = 2
            if (r1 == r2) goto L53
            goto L69
        L3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", error="
            r1.append(r2)
            com.applovin.mediation.MaxError r2 = r4.f7168e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", latencyMillis="
            r1.append(r2)
            long r2 = r4.f7167d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L69:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
