package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztn  reason: invalid package */
/* loaded from: classes2.dex */
public final class zztn {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            boolean z10 = true;
            if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                z10 = false;
            }
            zza = Boolean.valueOf(z10);
        }
        return zza.booleanValue();
    }
}
