package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdri extends zzblr {
    private final String zza;
    private final zzdnc zzb;
    private final zzdnh zzc;

    public zzdri(String str, zzdnc zzdncVar, zzdnh zzdnhVar) {
        this.zza = str;
        this.zzb = zzdncVar;
        this.zzc = zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final com.google.android.gms.ads.internal.client.zzdk zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbkt zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzblb zze() throws RemoteException {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzh() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzi() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzj() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzk() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzm() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzn() throws RemoteException {
        this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzz(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzQ(bundle);
    }
}
