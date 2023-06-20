package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbix {
    private f zza;
    private c zzb;
    private e zzc;
    private zzbiv zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, Constants.MIN_PROGRESS_STEP);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgri.zza(context));
                }
            }
        }
        return false;
    }

    public final f zza() {
        c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzgri.zza(activity)) != null) {
            zzgrj zzgrjVar = new zzgrj(this, null);
            this.zzc = zzgrjVar;
            c.a(activity, zza, zzgrjVar);
        }
    }

    public final void zzc(c cVar) {
        this.zzb = cVar;
        cVar.e(0L);
        zzbiv zzbivVar = this.zzd;
        if (zzbivVar != null) {
            zzbivVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbiv zzbivVar) {
        this.zzd = zzbivVar;
    }

    public final void zzf(Activity activity) {
        e eVar = this.zzc;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
