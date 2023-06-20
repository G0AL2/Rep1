package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcar;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbr extends zzaqx implements zzbs {
    public zzbr() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbs zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbf zzbfVar = null;
        zzcg zzcgVar = null;
        zzbi zzbiVar = null;
        zzde zzdeVar = null;
        zzbw zzbwVar = null;
        zzcd zzcdVar = null;
        zzbc zzbcVar = null;
        zzbz zzbzVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzZ);
                return true;
            case 4:
                zzaqy.zzc(parcel);
                boolean zzaa = zzaa((zzl) zzaqy.zza(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzaa);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = queryLocalInterface instanceof zzbf ? (zzbf) queryLocalInterface : new zzbd(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzD(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbzVar = queryLocalInterface2 instanceof zzbz ? (zzbz) queryLocalInterface2 : new zzbx(readStrongBinder2);
                }
                zzaqy.zzc(parcel);
                zzG(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                zzaqy.zzf(parcel2, zzg);
                return true;
            case 13:
                zzaqy.zzc(parcel);
                zzF((zzq) zzaqy.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbye zzb = zzbyd.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbyh zzb2 = zzbyg.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzaqy.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbiu zzb3 = zzbit.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = queryLocalInterface3 instanceof zzbc ? (zzbc) queryLocalInterface3 : new zzba(readStrongBinder3);
                }
                zzaqy.zzc(parcel);
                zzC(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = queryLocalInterface4 instanceof zzcd ? (zzcd) queryLocalInterface4 : new zzcd(readStrongBinder4);
                }
                zzaqy.zzc(parcel);
                zzab(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzh = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzN(zzh);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzY = zzY();
                parcel2.writeNoException();
                zzaqy.zzd(parcel2, zzY);
                return true;
            case 24:
                zzcar zzb4 = zzcaq.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzaqy.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdk zzl = zzl();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzl);
                return true;
            case 29:
                zzaqy.zzc(parcel);
                zzU((zzff) zzaqy.zza(parcel, zzff.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzaqy.zzc(parcel);
                zzK((zzdo) zzaqy.zza(parcel, zzdo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzbz zzj = zzj();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzj);
                return true;
            case 33:
                zzbf zzi = zzi();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzi);
                return true;
            case 34:
                boolean zzh2 = zzaqy.zzh(parcel);
                zzaqy.zzc(parcel);
                zzL(zzh2);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = queryLocalInterface5 instanceof zzbw ? (zzbw) queryLocalInterface5 : new zzbu(readStrongBinder5);
                }
                zzaqy.zzc(parcel);
                zzE(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzaqy.zzf(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzaqy.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzaqy.zzc(parcel);
                zzI((zzw) zzaqy.zza(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzbcj zze = zzbci.zze(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdh zzk = zzk();
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdeVar = queryLocalInterface6 instanceof zzde ? (zzde) queryLocalInterface6 : new zzdc(readStrongBinder6);
                }
                zzaqy.zzc(parcel);
                zzP(zzdeVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar = (zzl) zzaqy.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = queryLocalInterface7 instanceof zzbi ? (zzbi) queryLocalInterface7 : new zzbg(readStrongBinder7);
                }
                zzaqy.zzc(parcel);
                zzy(zzlVar, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcgVar = queryLocalInterface8 instanceof zzcg ? (zzcg) queryLocalInterface8 : new zzce(readStrongBinder8);
                }
                zzaqy.zzc(parcel);
                zzJ(zzcgVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
