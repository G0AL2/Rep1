package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzak extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbua zzd;
    final /* synthetic */ zzau zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(zzau zzauVar, Context context, zzq zzqVar, String str, zzbua zzbuaVar) {
        this.zze = zzauVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "interstitial");
        return new zzeq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zze.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }
}
