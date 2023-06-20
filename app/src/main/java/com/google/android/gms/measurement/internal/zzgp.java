package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgp implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzha zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgp(zzha zzhaVar, String str, String str2, String str3) {
        this.zzd = zzhaVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzli zzliVar;
        zzli zzliVar2;
        zzliVar = this.zzd.zza;
        zzliVar.zzA();
        zzliVar2 = this.zzd.zza;
        return zzliVar2.zzi().zzs(this.zza, this.zzb, this.zzc);
    }
}
