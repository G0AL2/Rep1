package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzam extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbua zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzau zzauVar, Context context, String str, zzbua zzbuaVar) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "native_ad");
        return new zzeo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzi zziVar;
        zzbhz.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                IBinder zze = ((zzbp) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzal
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        return queryLocalInterface instanceof zzbp ? (zzbp) queryLocalInterface : new zzbp(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(zze);
            } catch (RemoteException | zzcfl | NullPointerException e10) {
                this.zzd.zzh = zzbyy.zza(this.zza);
                zzbzaVar = this.zzd.zzh;
                zzbzaVar.zzd(e10, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zziVar = this.zzd.zzb;
        return zziVar.zza(this.zza, this.zzb, this.zzc);
    }
}
