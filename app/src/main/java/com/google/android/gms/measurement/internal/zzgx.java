package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgx implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzha zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(zzha zzhaVar, String str) {
        this.zzb = zzhaVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzli zzliVar;
        zzli zzliVar2;
        zzliVar = this.zzb.zza;
        zzliVar.zzA();
        zzliVar2 = this.zzb.zza;
        return zzliVar2.zzi().zzu(this.zza);
    }
}
