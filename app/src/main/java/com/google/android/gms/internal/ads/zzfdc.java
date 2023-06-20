package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfdc {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzefh) {
            zzefh zzefhVar = (zzefh) th;
            return zzc(zzefhVar.zza(), zzefhVar.zzb());
        } else if (th instanceof zzdzl) {
            if (th.getMessage() == null) {
                return zzd(((zzdzl) th).zza(), null, null);
            }
            return zzd(((zzdzl) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzay) {
            com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
            return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfpi.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzefi zzefiVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i10 = zza.zza;
        if ((i10 == 3 || i10 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzefiVar != null) {
            zza.zze = zzefiVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i10 != 0) {
            if (i10 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgV)).intValue() > 0) {
                    return zzeVar;
                }
                i10 = 8;
            }
            return zzd(i10, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdc.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
