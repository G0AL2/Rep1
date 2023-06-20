package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbrb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbn extends zzaqx implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbf zzbfVar = null;
        zzcd zzcdVar = null;
        switch (i10) {
            case 1:
                zzbl zze = zze();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = queryLocalInterface instanceof zzbf ? (zzbf) queryLocalInterface : new zzbd(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzblz zzb = zzbly.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbmc zzb2 = zzbmb.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbmi zzb3 = zzbmh.zzb(parcel.readStrongBinder());
                zzbmf zzb4 = zzbme.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzaqy.zzc(parcel);
                zzo((zzbkp) zzaqy.zza(parcel, zzbkp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = queryLocalInterface2 instanceof zzcd ? (zzcd) queryLocalInterface2 : new zzcd(readStrongBinder2);
                }
                zzaqy.zzc(parcel);
                zzq(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzaqy.zzc(parcel);
                zzj(zzbml.zzb(parcel.readStrongBinder()), (zzq) zzaqy.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzaqy.zzc(parcel);
                zzp((PublisherAdViewOptions) zzaqy.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzbmp zzb5 = zzbmo.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzk(zzb5);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzaqy.zzc(parcel);
                zzn((zzbqs) zzaqy.zza(parcel, zzbqs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbrb zzb6 = zzbra.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzi(zzb6);
                parcel2.writeNoException();
                return true;
            case 15:
                zzaqy.zzc(parcel);
                zzm((AdManagerAdViewOptions) zzaqy.zza(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
