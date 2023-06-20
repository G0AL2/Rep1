package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbvs extends zzaqx implements zzbvt {
    public zzbvs() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbvt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbvw zzbvwVar = null;
        zzbvn zzbvlVar = null;
        zzbvh zzbvfVar = null;
        zzbvq zzbvoVar = null;
        zzbvn zzbvlVar2 = null;
        zzbvq zzbvoVar2 = null;
        zzbvk zzbviVar = null;
        zzbvh zzbvfVar2 = null;
        if (i10 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaqy.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaqy.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbvwVar = queryLocalInterface instanceof zzbvw ? (zzbvw) queryLocalInterface : new zzbvu(readStrongBinder);
            }
            zzbvw zzbvwVar2 = zzbvwVar;
            zzaqy.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzqVar, zzbvwVar2);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            zzbwg zzf = zzf();
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, zzf);
        } else if (i10 == 3) {
            zzbwg zzg = zzg();
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, zzg);
        } else if (i10 == 5) {
            com.google.android.gms.ads.internal.client.zzdk zze = zze();
            parcel2.writeNoException();
            zzaqy.zzg(parcel2, zze);
        } else if (i10 == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            parcel2.writeNoException();
        } else if (i10 != 11) {
            switch (i10) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbvfVar2 = queryLocalInterface2 instanceof zzbvh ? (zzbvh) queryLocalInterface2 : new zzbvf(readStrongBinder2);
                    }
                    zzbvh zzbvhVar = zzbvfVar2;
                    zzaqy.zzc(parcel);
                    zzi(readString2, readString3, zzlVar, asInterface2, zzbvhVar, zzbuf.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbviVar = queryLocalInterface3 instanceof zzbvk ? (zzbvk) queryLocalInterface3 : new zzbvi(readStrongBinder3);
                    }
                    zzbvk zzbvkVar = zzbviVar;
                    zzbug zzb = zzbuf.zzb(parcel.readStrongBinder());
                    zzaqy.zzc(parcel);
                    zzk(readString4, readString5, zzlVar2, asInterface3, zzbvkVar, zzb);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzaqy.zzc(parcel);
                    boolean zzq = zzq(asInterface4);
                    parcel2.writeNoException();
                    zzaqy.zzd(parcel2, zzq);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvoVar2 = queryLocalInterface4 instanceof zzbvq ? (zzbvq) queryLocalInterface4 : new zzbvo(readStrongBinder4);
                    }
                    zzbvq zzbvqVar = zzbvoVar2;
                    zzbug zzb2 = zzbuf.zzb(parcel.readStrongBinder());
                    zzaqy.zzc(parcel);
                    zzo(readString6, readString7, zzlVar3, asInterface5, zzbvqVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzaqy.zzc(parcel);
                    boolean zzr = zzr(asInterface6);
                    parcel2.writeNoException();
                    zzaqy.zzd(parcel2, zzr);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvlVar2 = queryLocalInterface5 instanceof zzbvn ? (zzbvn) queryLocalInterface5 : new zzbvl(readStrongBinder5);
                    }
                    zzbvn zzbvnVar = zzbvlVar2;
                    zzbug zzb3 = zzbuf.zzb(parcel.readStrongBinder());
                    zzaqy.zzc(parcel);
                    zzl(readString8, readString9, zzlVar4, asInterface7, zzbvnVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzaqy.zzc(parcel);
                    zzp(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvoVar = queryLocalInterface6 instanceof zzbvq ? (zzbvq) queryLocalInterface6 : new zzbvo(readStrongBinder6);
                    }
                    zzbvq zzbvqVar2 = zzbvoVar;
                    zzbug zzb4 = zzbuf.zzb(parcel.readStrongBinder());
                    zzaqy.zzc(parcel);
                    zzn(readString11, readString12, zzlVar5, asInterface8, zzbvqVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbvfVar = queryLocalInterface7 instanceof zzbvh ? (zzbvh) queryLocalInterface7 : new zzbvf(readStrongBinder7);
                    }
                    zzbvh zzbvhVar2 = zzbvfVar;
                    zzaqy.zzc(parcel);
                    zzj(readString13, readString14, zzlVar6, asInterface9, zzbvhVar2, zzbuf.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvlVar = queryLocalInterface8 instanceof zzbvn ? (zzbvn) queryLocalInterface8 : new zzbvl(readStrongBinder8);
                    }
                    zzbvn zzbvnVar2 = zzbvlVar;
                    zzaqy.zzc(parcel);
                    zzm(readString15, readString16, zzlVar7, asInterface10, zzbvnVar2, zzbuf.zzb(parcel.readStrongBinder()), (zzbkp) zzaqy.zza(parcel, zzbkp.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            zzaqy.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
