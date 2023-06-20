package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public int f14108a;

    /* renamed from: b  reason: collision with root package name */
    public String f14109b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ContentValues"
            r4.<init>()
            r1 = 0
            com.chartboost.sdk.impl.l r2 = com.chartboost.sdk.impl.l.b()     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Lf com.google.android.gms.common.GooglePlayServicesRepairableException -> L15 java.io.IOException -> L1b java.lang.IllegalStateException -> L21
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r2.a(r5)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> Lf com.google.android.gms.common.GooglePlayServicesRepairableException -> L15 java.io.IOException -> L1b java.lang.IllegalStateException -> L21
            goto L27
        Lf:
            java.lang.String r2 = "Google play service is not available."
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r2)
            goto L26
        L15:
            java.lang.String r2 = "There was a recoverable error connecting to Google Play Services."
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r2)
            goto L26
        L1b:
            java.lang.String r2 = "The connection to Google Play Services failed."
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r2)
            goto L26
        L21:
            java.lang.String r2 = "This should have been called off the main thread."
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r2)
        L26:
            r0 = r1
        L27:
            r2 = 1
            if (r0 != 0) goto L30
            r0 = -1
            r4.f14108a = r0
            r4.f14109b = r1
            goto L44
        L30:
            boolean r3 = r0.isLimitAdTrackingEnabled()
            if (r3 == 0) goto L3b
            r4.f14108a = r2
            r4.f14109b = r1
            goto L44
        L3b:
            r3 = 0
            r4.f14108a = r3
            java.lang.String r0 = r0.getId()
            r4.f14109b = r0
        L44:
            java.lang.String r0 = r4.f14109b
            if (r0 == 0) goto L54
            java.lang.String r3 = "00000000-0000-0000-0000-000000000000"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L54
            r4.f14108a = r2
            r4.f14109b = r1
        L54:
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L5e
            r4.f14108a = r2
            r4.f14109b = r1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.k.<init>(android.content.Context):void");
    }

    private boolean a(Context context) {
        DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(context, COPPA.COPPA_STANDARD);
        if (dataUseConsent != null) {
            return ((Boolean) dataUseConsent.getConsent()).booleanValue();
        }
        return false;
    }
}
