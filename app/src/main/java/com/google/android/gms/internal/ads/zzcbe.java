package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface zzcbe extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdh zzc() throws RemoteException;

    zzcbb zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar) throws RemoteException;

    void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbl zzcblVar) throws RemoteException;

    void zzh(boolean z10) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) throws RemoteException;

    void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException;

    void zzk(zzcbh zzcbhVar) throws RemoteException;

    void zzl(zzcbs zzcbsVar) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzcbm zzcbmVar) throws RemoteException;
}
