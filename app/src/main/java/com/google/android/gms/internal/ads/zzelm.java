package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzelm extends com.google.android.gms.ads.internal.client.zzbk {
    private final zzems zza;

    public zzelm(Context context, zzcnf zzcnfVar, zzfcb zzfcbVar, zzdns zzdnsVar, com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        zzemu zzemuVar = new zzemu(zzdnsVar, zzcnfVar.zzx());
        zzemuVar.zze(zzbfVar);
        this.zza = new zzems(new zzene(zzcnfVar, context, zzemuVar, zzfcbVar), zzfcbVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) throws RemoteException {
        this.zza.zzd(zzlVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
