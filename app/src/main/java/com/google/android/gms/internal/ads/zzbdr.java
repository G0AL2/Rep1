package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdr {
    final /* synthetic */ zzbds zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbdr(zzbds zzbdsVar, byte[] bArr, zzbdq zzbdqVar) {
        this.zza = zzbdsVar;
        this.zzb = bArr;
    }

    public static /* synthetic */ void zzb(zzbdr zzbdrVar) {
        zzbdrVar.zzd();
    }

    public final synchronized void zzd() {
        try {
            zzbds zzbdsVar = this.zza;
            if (zzbdsVar.zzb) {
                zzbdsVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            zzcfi.zzf("Clearcut log failed", e10);
        }
    }

    public final zzbdr zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzis)).booleanValue()) {
            executorService = this.zza.zzc;
            executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdp
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdr.zzb(zzbdr.this);
                }
            });
            return;
        }
        zzd();
    }
}
