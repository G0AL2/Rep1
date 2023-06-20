package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaa extends zzav {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzau zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzau zzauVar, Activity activity) {
        this.zzb = zzauVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzl(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzbxs zzbxsVar;
        zzbhz.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                return zzbxu.zzF(((zzbxy) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzbxx.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | zzcfl | NullPointerException e10) {
                this.zzb.zzh = zzbyy.zza(this.zza.getApplicationContext());
                zzbzaVar = this.zzb.zzh;
                zzbzaVar.zzd(e10, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzbxsVar = this.zzb.zzf;
        return zzbxsVar.zza(this.zza);
    }
}
