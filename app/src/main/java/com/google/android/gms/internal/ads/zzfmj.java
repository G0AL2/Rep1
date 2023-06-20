package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmj {
    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmj(Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfmk.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfmk.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    @VisibleForTesting
    static String zza(zzaqv zzaqvVar) {
        return Hex.bytesToStringLowercase(zzaqvVar.zzas().zzE());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i10 = this.zzd;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FBAMTD");
        sb2.append(i10 - 1);
        return sb2.toString();
    }

    private final String zzg() {
        int i10 = this.zzd;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LATMTD");
        sb2.append(i10 - 1);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzaqs r8, com.google.android.gms.internal.ads.zzfmp r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfmj.zzb(com.google.android.gms.internal.ads.zzaqs, com.google.android.gms.internal.ads.zzfmp):boolean");
    }

    @VisibleForTesting
    final zzaqv zzc(int i10) {
        String string;
        if (i10 == 1) {
            string = this.zzc.getString(zzg(), null);
        } else {
            string = this.zzc.getString(zzf(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzaqv zzh = zzaqv.zzh(zzgji.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfmk.zzb(zzk, "pcam.jar", zze());
            if (!zzb.exists()) {
                zzb = zzfmk.zzb(zzk, "pcam", zze());
            }
            File zzb2 = zzfmk.zzb(zzk, "pcbc", zze());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzglc unused) {
        }
        return null;
    }

    public final zzfmi zzd(int i10) {
        zzaqv zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zzk = zzc.zzk();
        File zzb = zzfmk.zzb(zzk, "pcam.jar", zze());
        if (!zzb.exists()) {
            zzb = zzfmk.zzb(zzk, "pcam", zze());
        }
        return new zzfmi(zzc, zzb, zzfmk.zzb(zzk, "pcbc", zze()), zzfmk.zzb(zzk, "pcopt", zze()));
    }
}
