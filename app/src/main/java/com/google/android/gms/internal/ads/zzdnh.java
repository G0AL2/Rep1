package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.g;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdnh {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdk zzb;
    private zzbkt zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzef zzg;
    private Bundle zzh;
    private zzcli zzi;
    private zzcli zzj;
    private zzcli zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzblb zzq;
    private zzblb zzr;
    private String zzs;
    private float zzv;
    private String zzw;
    private final g zzt = new g();
    private final g zzu = new g();
    private List zzf = Collections.emptyList();

    public static zzdnh zzab(zzbul zzbulVar) {
        try {
            zzdng zzaf = zzaf(zzbulVar.zzg(), null);
            zzbkt zzh = zzbulVar.zzh();
            String zzo = zzbulVar.zzo();
            List zzr = zzbulVar.zzr();
            String zzm = zzbulVar.zzm();
            Bundle zzf = zzbulVar.zzf();
            String zzn = zzbulVar.zzn();
            IObjectWrapper zzl = zzbulVar.zzl();
            String zzq = zzbulVar.zzq();
            String zzp = zzbulVar.zzp();
            double zze = zzbulVar.zze();
            zzblb zzi = zzbulVar.zzi();
            zzdnh zzdnhVar = new zzdnh();
            zzdnhVar.zza = 2;
            zzdnhVar.zzb = zzaf;
            zzdnhVar.zzc = zzh;
            zzdnhVar.zzd = (View) zzah(zzbulVar.zzj());
            zzdnhVar.zzU("headline", zzo);
            zzdnhVar.zze = zzr;
            zzdnhVar.zzU("body", zzm);
            zzdnhVar.zzh = zzf;
            zzdnhVar.zzU("call_to_action", zzn);
            zzdnhVar.zzm = (View) zzah(zzbulVar.zzk());
            zzdnhVar.zzo = zzl;
            zzdnhVar.zzU("store", zzq);
            zzdnhVar.zzU(InAppPurchaseMetaData.KEY_PRICE, zzp);
            zzdnhVar.zzp = zze;
            zzdnhVar.zzq = zzi;
            return zzdnhVar;
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to get native ad from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdnh zzac(zzbum zzbumVar) {
        try {
            zzdng zzaf = zzaf(zzbumVar.zzf(), null);
            zzbkt zzg = zzbumVar.zzg();
            String zzo = zzbumVar.zzo();
            List zzp = zzbumVar.zzp();
            String zzm = zzbumVar.zzm();
            Bundle zze = zzbumVar.zze();
            String zzn = zzbumVar.zzn();
            IObjectWrapper zzk = zzbumVar.zzk();
            String zzl = zzbumVar.zzl();
            zzblb zzh = zzbumVar.zzh();
            zzdnh zzdnhVar = new zzdnh();
            zzdnhVar.zza = 1;
            zzdnhVar.zzb = zzaf;
            zzdnhVar.zzc = zzg;
            zzdnhVar.zzd = (View) zzah(zzbumVar.zzi());
            zzdnhVar.zzU("headline", zzo);
            zzdnhVar.zze = zzp;
            zzdnhVar.zzU("body", zzm);
            zzdnhVar.zzh = zze;
            zzdnhVar.zzU("call_to_action", zzn);
            zzdnhVar.zzm = (View) zzah(zzbumVar.zzj());
            zzdnhVar.zzo = zzk;
            zzdnhVar.zzU("advertiser", zzl);
            zzdnhVar.zzr = zzh;
            return zzdnhVar;
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    public static zzdnh zzad(zzbul zzbulVar) {
        try {
            return zzag(zzaf(zzbulVar.zzg(), null), zzbulVar.zzh(), (View) zzah(zzbulVar.zzj()), zzbulVar.zzo(), zzbulVar.zzr(), zzbulVar.zzm(), zzbulVar.zzf(), zzbulVar.zzn(), (View) zzah(zzbulVar.zzk()), zzbulVar.zzl(), zzbulVar.zzq(), zzbulVar.zzp(), zzbulVar.zze(), zzbulVar.zzi(), null, 0.0f);
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static zzdnh zzae(zzbum zzbumVar) {
        try {
            return zzag(zzaf(zzbumVar.zzf(), null), zzbumVar.zzg(), (View) zzah(zzbumVar.zzi()), zzbumVar.zzo(), zzbumVar.zzp(), zzbumVar.zzm(), zzbumVar.zze(), zzbumVar.zzn(), (View) zzah(zzbumVar.zzj()), zzbumVar.zzk(), null, null, -1.0d, zzbumVar.zzh(), zzbumVar.zzl(), 0.0f);
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdng zzaf(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbup zzbupVar) {
        if (zzdkVar == null) {
            return null;
        }
        return new zzdng(zzdkVar, zzbupVar);
    }

    private static zzdnh zzag(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbkt zzbktVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzblb zzblbVar, String str6, float f10) {
        zzdnh zzdnhVar = new zzdnh();
        zzdnhVar.zza = 6;
        zzdnhVar.zzb = zzdkVar;
        zzdnhVar.zzc = zzbktVar;
        zzdnhVar.zzd = view;
        zzdnhVar.zzU("headline", str);
        zzdnhVar.zze = list;
        zzdnhVar.zzU("body", str2);
        zzdnhVar.zzh = bundle;
        zzdnhVar.zzU("call_to_action", str3);
        zzdnhVar.zzm = view2;
        zzdnhVar.zzo = iObjectWrapper;
        zzdnhVar.zzU("store", str4);
        zzdnhVar.zzU(InAppPurchaseMetaData.KEY_PRICE, str5);
        zzdnhVar.zzp = d10;
        zzdnhVar.zzq = zzblbVar;
        zzdnhVar.zzU("advertiser", str6);
        zzdnhVar.zzP(f10);
        return zzdnhVar;
    }

    private static Object zzah(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdnh zzs(zzbup zzbupVar) {
        try {
            return zzag(zzaf(zzbupVar.zzj(), zzbupVar), zzbupVar.zzk(), (View) zzah(zzbupVar.zzm()), zzbupVar.zzs(), zzbupVar.zzv(), zzbupVar.zzq(), zzbupVar.zzi(), zzbupVar.zzr(), (View) zzah(zzbupVar.zzn()), zzbupVar.zzo(), zzbupVar.zzu(), zzbupVar.zzt(), zzbupVar.zze(), zzbupVar.zzl(), zzbupVar.zzp(), zzbupVar.zzf());
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzw;
    }

    public final synchronized String zzB() {
        return zzD(InAppPurchaseMetaData.KEY_PRICE);
    }

    public final synchronized String zzC() {
        return zzD("store");
    }

    public final synchronized String zzD(String str) {
        return (String) this.zzu.get(str);
    }

    public final synchronized List zzE() {
        return this.zze;
    }

    public final synchronized List zzF() {
        return this.zzf;
    }

    public final synchronized void zzG() {
        zzcli zzcliVar = this.zzi;
        if (zzcliVar != null) {
            zzcliVar.destroy();
            this.zzi = null;
        }
        zzcli zzcliVar2 = this.zzj;
        if (zzcliVar2 != null) {
            zzcliVar2.destroy();
            this.zzj = null;
        }
        zzcli zzcliVar3 = this.zzk;
        if (zzcliVar3 != null) {
            zzcliVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zzH(zzbkt zzbktVar) {
        this.zzc = zzbktVar;
    }

    public final synchronized void zzI(String str) {
        this.zzs = str;
    }

    public final synchronized void zzJ(com.google.android.gms.ads.internal.client.zzef zzefVar) {
        this.zzg = zzefVar;
    }

    public final synchronized void zzK(zzblb zzblbVar) {
        this.zzq = zzblbVar;
    }

    public final synchronized void zzL(String str, zzbkn zzbknVar) {
        if (zzbknVar == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzbknVar);
        }
    }

    public final synchronized void zzM(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    public final synchronized void zzN(List list) {
        this.zze = list;
    }

    public final synchronized void zzO(zzblb zzblbVar) {
        this.zzr = zzblbVar;
    }

    public final synchronized void zzP(float f10) {
        this.zzv = f10;
    }

    public final synchronized void zzQ(List list) {
        this.zzf = list;
    }

    public final synchronized void zzR(zzcli zzcliVar) {
        this.zzk = zzcliVar;
    }

    public final synchronized void zzS(String str) {
        this.zzw = str;
    }

    public final synchronized void zzT(double d10) {
        this.zzp = d10;
    }

    public final synchronized void zzU(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzV(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzW(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        this.zzb = zzdkVar;
    }

    public final synchronized void zzX(View view) {
        this.zzm = view;
    }

    public final synchronized void zzY(zzcli zzcliVar) {
        this.zzi = zzcliVar;
    }

    public final synchronized void zzZ(View view) {
        this.zzn = view;
    }

    public final synchronized double zza() {
        return this.zzp;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzv;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzn;
    }

    public final synchronized g zzh() {
        return this.zzt;
    }

    public final synchronized g zzi() {
        return this.zzu;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzef zzk() {
        return this.zzg;
    }

    public final synchronized zzbkt zzl() {
        return this.zzc;
    }

    public final zzblb zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbla.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzblb zzn() {
        return this.zzq;
    }

    public final synchronized zzblb zzo() {
        return this.zzr;
    }

    public final synchronized zzcli zzp() {
        return this.zzj;
    }

    public final synchronized zzcli zzq() {
        return this.zzk;
    }

    public final synchronized zzcli zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzo;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized String zzv() {
        return zzD("advertiser");
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.zzs;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
