package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzew extends zzcbd {
    private static void zzr(final zzcbl zzcblVar) {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzev
            @Override // java.lang.Runnable
            public final void run() {
                zzcbl zzcblVar2 = zzcbl.this;
                if (zzcblVar2 != null) {
                    try {
                        zzcblVar2.zze(1);
                    } catch (RemoteException e10) {
                        zzcfi.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final zzdh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final zzcbb zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzf(zzl zzlVar, zzcbl zzcblVar) throws RemoteException {
        zzr(zzcblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzg(zzl zzlVar, zzcbl zzcblVar) throws RemoteException {
        zzr(zzcblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzi(zzdb zzdbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzk(zzcbh zzcbhVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzl(zzcbs zzcbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzp(zzcbm zzcbmVar) throws RemoteException {
    }
}
