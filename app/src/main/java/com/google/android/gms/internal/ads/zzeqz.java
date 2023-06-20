package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqz implements zzetf {
    public final Bundle zza;

    public zzeqz(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfco.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza);
    }
}
