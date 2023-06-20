package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbkv implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzblv zza;

    public zzbkv(zzblv zzblvVar) {
        this.zza = zzblvVar;
        try {
            zzblvVar.zzl();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzo(ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
            return false;
        }
    }
}
