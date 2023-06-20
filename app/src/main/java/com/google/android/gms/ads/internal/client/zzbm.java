package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
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
public final class zzbm extends zzaqw implements zzbo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() throws RemoteException {
        zzbl zzbjVar;
        Parcel zzbk = zzbk(1, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbjVar = queryLocalInterface instanceof zzbl ? (zzbl) queryLocalInterface : new zzbj(readStrongBinder);
        }
        zzbk.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzblz zzblzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbmc zzbmcVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbmi zzbmiVar, zzbmf zzbmfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqy.zzg(zza, zzbmiVar);
        zzaqy.zzg(zza, zzbmfVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbrb zzbrbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbmm zzbmmVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbmmVar);
        zzaqy.zze(zza, zzqVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbmp zzbmpVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbmpVar);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbfVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbfVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, adManagerAdViewOptions);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbqs zzbqsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbkp zzbkpVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbkpVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcdVar) throws RemoteException {
        throw null;
    }
}
