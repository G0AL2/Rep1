package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzes extends zzcl {
    private zzbqn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbqn zzbqnVar = this.zza;
        if (zzbqnVar != null) {
            try {
                zzbqnVar.zzb(Collections.emptyList());
            } catch (RemoteException e10) {
                zzcfi.zzk("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() throws RemoteException {
        zzcfi.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcfb.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.lang.Runnable
            public final void run() {
                zzes.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbua zzbuaVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqn zzbqnVar) throws RemoteException {
        this.zza = zzbqnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() throws RemoteException {
        return false;
    }
}
