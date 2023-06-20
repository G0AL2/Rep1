package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzw zzwVar, zzu zzuVar, boolean z10) {
        if (z10) {
            return zzc(context, intent.getData(), zzwVar, zzuVar);
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + uri);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzI(context, intent);
            if (zzwVar != null) {
                zzwVar.zzg();
            }
            if (zzuVar != null) {
                zzuVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            zzcfi.zzj(e10.getMessage());
            if (zzuVar != null) {
                zzuVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzw zzwVar, zzu zzuVar) {
        int i10 = 0;
        if (zzcVar == null) {
            zzcfi.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbhz.zzc(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzwVar, zzuVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            zzcfi.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
        } else {
            intent2.setData(Uri.parse(zzcVar.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                zzcfi.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzcVar.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzcfi.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdB)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzdA)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intent2);
            }
        }
        return zza(context, intent2, zzwVar, zzuVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzw zzwVar, zzu zzuVar) {
        int i10;
        try {
            i10 = com.google.android.gms.ads.internal.zzt.zzp().zzk(context, uri);
            if (zzwVar != null) {
                zzwVar.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            zzcfi.zzj(e10.getMessage());
            i10 = 6;
        }
        if (zzuVar != null) {
            zzuVar.zzb(i10);
        }
        return i10 == 5;
    }
}
