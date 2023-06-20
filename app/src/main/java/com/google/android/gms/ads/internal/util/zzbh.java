package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzcfi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbh implements zzajf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zza(zzajk zzajkVar) {
        String str = this.zza;
        String exc = zzajkVar.toString();
        zzcfi.zzj("Failed to load URL: " + str + "\n" + exc);
        this.zzb.zza((Object) null);
    }
}
