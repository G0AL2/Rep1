package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcln implements zzfuy {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzclp zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcln(zzclp zzclpVar, List list, String str, Uri uri) {
        this.zzd = zzclpVar;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzcfi.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzO((Map) obj, this.zza, this.zzb);
    }
}
