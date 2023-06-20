package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdng extends com.google.android.gms.ads.internal.client.zzdj {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzdk zzb;
    private final zzbup zzc;

    public zzdng(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbup zzbupVar) {
        this.zzb = zzdkVar;
        this.zzc = zzbupVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() throws RemoteException {
        zzbup zzbupVar = this.zzc;
        if (zzbupVar != null) {
            return zzbupVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() throws RemoteException {
        zzbup zzbupVar = this.zzc;
        if (zzbupVar != null) {
            return zzbupVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final com.google.android.gms.ads.internal.client.zzdn zzi() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                return zzdkVar.zzi();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                zzdkVar.zzm(zzdnVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
