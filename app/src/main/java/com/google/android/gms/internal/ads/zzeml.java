package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeml implements com.google.android.gms.ads.internal.client.zza, zzdjg {
    private com.google.android.gms.ads.internal.client.zzbc zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e10) {
                zzcfi.zzk("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final synchronized void zzq() {
        com.google.android.gms.ads.internal.client.zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            try {
                zzbcVar.zzb();
            } catch (RemoteException e10) {
                zzcfi.zzk("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }
}
