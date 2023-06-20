package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbrb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface zzbo extends IInterface {
    zzbl zze() throws RemoteException;

    void zzf(zzblz zzblzVar) throws RemoteException;

    void zzg(zzbmc zzbmcVar) throws RemoteException;

    void zzh(String str, zzbmi zzbmiVar, zzbmf zzbmfVar) throws RemoteException;

    void zzi(zzbrb zzbrbVar) throws RemoteException;

    void zzj(zzbmm zzbmmVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbmp zzbmpVar) throws RemoteException;

    void zzl(zzbf zzbfVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbqs zzbqsVar) throws RemoteException;

    void zzo(zzbkp zzbkpVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcd zzcdVar) throws RemoteException;
}
