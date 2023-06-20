package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeyf implements zzfej {
    public final zzeyz zza;
    public final zzezb zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfdy zzg;

    public zzeyf(zzeyz zzeyzVar, zzezb zzezbVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfdy zzfdyVar) {
        this.zza = zzeyzVar;
        this.zzb = zzezbVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfej
    public final zzfdy zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfej
    public final Executor zzb() {
        return this.zze;
    }
}
