package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqv implements zzetf {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public zzeqv(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
    }
}
