package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbuu implements InitializationCompleteCallback {
    final /* synthetic */ zzbqk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuu(zzbuz zzbuzVar, zzbqk zzbqkVar) {
        this.zza = zzbqkVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }
}
