package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzems {
    private final zzemx zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdh zzc;

    public zzems(zzemx zzemxVar, String str) {
        this.zza = zzemxVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzc;
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zzc;
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdhVar != null ? zzdhVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzemy(i10), new zzemr(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
