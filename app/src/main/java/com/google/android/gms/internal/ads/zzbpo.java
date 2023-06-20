package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpo {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbpk zzc;

    public zzbpo(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbhz.zzc(context);
    }

    public static final boolean zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhS)).booleanValue()) {
            Preconditions.checkNotNull(str);
            if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhU)).intValue()) {
                zzcfi.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzaw.zza().zzk(this.zza, new zzbtx(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhS)).booleanValue()) {
            zzd();
            zzbpk zzbpkVar = this.zzc;
            if (zzbpkVar != null) {
                try {
                    zzbpkVar.zze();
                } catch (RemoteException e10) {
                    zzcfi.zzl("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (zzc(str)) {
            zzd();
            zzbpk zzbpkVar = this.zzc;
            if (zzbpkVar != null) {
                try {
                    zzbpkVar.zzf(str);
                    return true;
                } catch (RemoteException e10) {
                    zzcfi.zzl("#007 Could not call remote method.", e10);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
