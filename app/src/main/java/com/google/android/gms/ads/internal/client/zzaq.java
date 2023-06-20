package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaq extends zzav {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzau zzauVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzauVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zzc, "native_ad_view_delegate");
        return new zzet();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzh(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzbna zzbnaVar;
        zzbhz.zzc(this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                return zzble.zzbB(((zzbli) zzcfm.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        return zzblh.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 221908000));
            } catch (RemoteException | zzcfl | NullPointerException e10) {
                this.zzd.zzh = zzbyy.zza(this.zzc);
                zzbzaVar = this.zzd.zzh;
                zzbzaVar.zzd(e10, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzbnaVar = this.zzd.zzd;
        return zzbnaVar.zza(this.zzc, this.zza, this.zzb);
    }
}
