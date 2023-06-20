package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeoz implements zzetf {
    @VisibleForTesting
    final String zza;
    @VisibleForTesting
    final int zzb;

    public zzeoz(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        Bundle zza = zzfco.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", this.zza);
        zza.putInt("pvid_s", this.zzb);
    }
}
