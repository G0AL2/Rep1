package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdod;
import com.google.android.gms.internal.ads.zzdxp;
import com.google.android.gms.internal.ads.zzell;
import com.google.android.gms.internal.ads.zzewj;
import com.google.android.gms.internal.ads.zzewk;
import com.google.android.gms.internal.ads.zzexx;
import com.google.android.gms.internal.ads.zzezq;
import com.google.android.gms.internal.ads.zzfbe;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class ClientApi extends zzcb {
    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbua zzbuaVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzell(zzcnf.zza(context, zzbuaVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbua zzbuaVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewj zzr = zzcnf.zza(context, zzbuaVar, i10).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        zzewk zzc = zzr.zzc();
        if (i10 >= ((Integer) zzay.zzc().zzb(zzbhz.zzek)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbua zzbuaVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexx zzs = zzcnf.zza(context, zzbuaVar, i10).zzs();
        zzs.zzc(context);
        zzs.zza(zzqVar);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbua zzbuaVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezq zzt = zzcnf.zza(context, zzbuaVar, i10).zzt();
        zzt.zzc(context);
        zzt.zza(zzqVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i10) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzcfo(221908000, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i10) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i10).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzblf zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdod((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbll zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdob((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbpk zzj(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10, zzbph zzbphVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdxp zzj = zzcnf.zza(context, zzbuaVar, i10).zzj();
        zzj.zzb(context);
        zzj.zza(zzbphVar);
        return zzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxl zzk(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbuaVar, i10).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxv zzl(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i10 = zza.zzk;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
                        }
                        return new zzz(activity);
                    }
                    return new zzv(activity, zza);
                }
                return new zzac(activity);
            }
            return new zzab(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcao zzm(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbe zzu = zzcnf.zza(context, zzbuaVar, i10).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbe zzn(IObjectWrapper iObjectWrapper, String str, zzbua zzbuaVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbe zzu = zzcnf.zza(context, zzbuaVar, i10).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcdz zzo(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbuaVar, i10).zzo();
    }
}
