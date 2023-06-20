package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbvc extends zzbuf {
    private final Adapter zza;
    private final zzcaw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvc(Adapter adapter, zzcaw zzcawVar) {
        this.zza = adapter;
        this.zzb = zzcawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze() throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf() throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(int i10) throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzg(ObjectWrapper.wrap(this.zza), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzi(int i10, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzj(int i10) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzo() throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzp() throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzr(zzblv zzblvVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzs(zzcax zzcaxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzt(zzcbb zzcbbVar) throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzm(ObjectWrapper.wrap(this.zza), new zzcax(zzcbbVar.zzf(), zzcbbVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzu() throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzy() throws RemoteException {
        zzcaw zzcawVar = this.zzb;
        if (zzcawVar != null) {
            zzcawVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
