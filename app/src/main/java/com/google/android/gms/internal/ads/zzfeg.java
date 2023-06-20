package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfeg implements zzfuy {
    final /* synthetic */ zzfej zza;
    final /* synthetic */ zzfek zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfeg(zzfek zzfekVar, zzfej zzfejVar) {
        this.zzb = zzfekVar;
        this.zza = zzfejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i10;
        Void r42 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfek zzfekVar = this.zzb;
            i10 = zzfekVar.zzf;
            if (i10 == 1) {
                zzfekVar.zzh();
            }
        }
    }
}
