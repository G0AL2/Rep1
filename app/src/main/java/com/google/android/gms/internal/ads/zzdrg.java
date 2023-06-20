package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdrg extends zzblp {
    private final String zza;
    private final zzdnc zzb;
    private final zzdnh zzc;

    public zzdrg(String str, zzdnc zzdncVar, zzdnh zzdnhVar) {
        this.zza = str;
        this.zzb = zzdncVar;
        this.zzc = zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final com.google.android.gms.ads.internal.client.zzdk zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final zzbkt zze() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final zzblb zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final IObjectWrapper zzg() throws RemoteException {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final String zzi() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final String zzj() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final String zzk() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final String zzm() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final String zzn() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final List zzo() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final void zzp() throws RemoteException {
        this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zzb.zzz(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblq
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zzQ(bundle);
    }
}
