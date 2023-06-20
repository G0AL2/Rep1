package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdso extends VideoController.VideoLifecycleCallbacks {
    private final zzdnh zza;

    public zzdso(zzdnh zzdnhVar) {
        this.zza = zzdnhVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdn zza(zzdnh zzdnhVar) {
        com.google.android.gms.ads.internal.client.zzdk zzj = zzdnhVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdn zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e10) {
            zzcfi.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdn zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e10) {
            zzcfi.zzk("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdn zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException e10) {
            zzcfi.zzk("Unable to call onVideoEnd()", e10);
        }
    }
}
