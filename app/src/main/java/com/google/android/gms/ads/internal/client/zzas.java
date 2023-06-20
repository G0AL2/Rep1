package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzas extends zzav {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzau zzauVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzauVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzbnb zzbnbVar;
        zzbhz.zzc(this.zza.getContext());
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                return zzblk.zze(((zzblo) zzcfm.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzar
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzbln.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzcfl | NullPointerException e10) {
                this.zzd.zzh = zzbyy.zza(this.zza.getContext());
                zzbzaVar = this.zzd.zzh;
                zzbzaVar.zzd(e10, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzbnbVar = this.zzd.zzg;
        return zzbnbVar.zza(this.zza, this.zzb, this.zzc);
    }
}
