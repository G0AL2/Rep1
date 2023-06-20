package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbkp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbkp zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, Location location, int i10, int i11, String str2, String str3, zzbkp zzbkpVar) {
        super(context, str, bundle, bundle2, z10, location, i10, i11, str2, str3);
        this.zza = zzbkpVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbkp.zza(this.zza);
    }
}
