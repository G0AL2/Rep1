package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaj extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzau zzauVar, Context context, zzq zzqVar, String str) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new zzeq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzk zzkVar;
        zzkVar = this.zzd.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, null, 3);
    }
}
