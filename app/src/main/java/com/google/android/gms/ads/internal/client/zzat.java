package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcbq;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzat extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbua zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(zzau zzauVar, Context context, String str, zzbua zzbuaVar) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, RNAdsEvents.EVENT_REWARDED);
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzn(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzcbq.zza(this.zza, this.zzb, this.zzc);
    }
}
