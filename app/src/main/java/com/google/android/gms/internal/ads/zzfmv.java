package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmv {
    final /* synthetic */ zzfmw zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfmv(zzfmw zzfmwVar, byte[] bArr, zzfmu zzfmuVar) {
        this.zza = zzfmwVar;
        this.zzb = bArr;
    }

    public final zzfmv zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfmv zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfmw zzfmwVar = this.zza;
            if (zzfmwVar.zzb) {
                zzfmwVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }
}
