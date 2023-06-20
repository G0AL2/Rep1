package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbni extends zzbml {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbni(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zze(com.google.android.gms.ads.internal.client.zzbs zzbsVar, IObjectWrapper iObjectWrapper) {
        if (zzbsVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbsVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbsVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
        try {
            if (zzbsVar.zzj() instanceof zzbbb) {
                zzbbb zzbbbVar = (zzbbb) zzbsVar.zzj();
                adManagerAdView.setAppEventListener(zzbbbVar != null ? zzbbbVar.zzb() : null);
            }
        } catch (RemoteException e11) {
            zzcfi.zzh("", e11);
        }
        zzcfb.zza.post(new zzbnh(this, adManagerAdView, zzbsVar));
    }
}
