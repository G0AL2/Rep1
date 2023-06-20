package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import hb.a;
import hb.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzo {
    private final zzn zza;
    private final Activity zzb;
    private final a zzc;
    private final d zzd;

    public /* synthetic */ zzo(zzn zznVar, Activity activity, a aVar, d dVar, zzm zzmVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = aVar;
        this.zzd = dVar;
    }

    public static /* synthetic */ zzbu zza(zzo zzoVar) throws zzj {
        Bundle bundle;
        Application application;
        Application application2;
        zzb zzbVar;
        List<zzbp> arrayList;
        zzam zzamVar;
        String locale;
        Application application3;
        Application application4;
        Application application5;
        List<zzbr> list;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        long j10;
        Application application9;
        zzbu zzbuVar = new zzbu();
        String c10 = zzoVar.zzd.c();
        if (TextUtils.isEmpty(c10)) {
            try {
                application = zzoVar.zza.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zzoVar.zza.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c10 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c10)) {
                throw new zzj(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzbuVar.zza = c10;
        zzbVar = zzoVar.zza.zzb;
        zza zza = zzbVar.zza();
        if (zza != null) {
            zzbuVar.zzc = zza.zza;
            zzbuVar.zzb = Boolean.valueOf(zza.zzb);
        }
        if (!zzoVar.zzc.b()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList<>();
            int a10 = zzoVar.zzc.a();
            if (a10 == 1) {
                arrayList.add(zzbp.GEO_OVERRIDE_EEA);
            } else if (a10 == 2) {
                arrayList.add(zzbp.GEO_OVERRIDE_NON_EEA);
            }
            arrayList.add(zzbp.PREVIEWING_DEBUG_MESSAGES);
        }
        zzbuVar.zzk = arrayList;
        zzamVar = zzoVar.zza.zzc;
        zzbuVar.zzg = zzamVar.zzb();
        zzbuVar.zzf = Boolean.valueOf(zzoVar.zzd.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            locale = Locale.getDefault().toLanguageTag();
        } else {
            locale = Locale.getDefault().toString();
        }
        zzbuVar.zze = locale;
        zzbq zzbqVar = new zzbq();
        zzbqVar.zzb = Integer.valueOf(i10);
        zzbqVar.zza = Build.MODEL;
        zzbqVar.zzc = 2;
        zzbuVar.zzd = zzbqVar;
        application3 = zzoVar.zza.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zzoVar.zza.zza;
        application4.getResources().getConfiguration();
        zzbs zzbsVar = new zzbs();
        zzbsVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzbsVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zzoVar.zza.zza;
        zzbsVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i10 < 28) {
            list = Collections.emptyList();
        } else {
            Activity activity = zzoVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzbr zzbrVar = new zzbr();
                        zzbrVar.zzb = Integer.valueOf(rect.left);
                        zzbrVar.zzc = Integer.valueOf(rect.right);
                        zzbrVar.zza = Integer.valueOf(rect.top);
                        zzbrVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzbrVar);
                    }
                }
                list = arrayList2;
            }
        }
        zzbsVar.zzd = list;
        zzbuVar.zzh = zzbsVar;
        application6 = zzoVar.zza.zza;
        try {
            application9 = zzoVar.zza.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzbo zzboVar = new zzbo();
        zzboVar.zza = application6.getPackageName();
        application7 = zzoVar.zza.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zzoVar.zza.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        zzboVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = packageInfo.getLongVersionCode();
            } else {
                j10 = packageInfo.versionCode;
            }
            zzboVar.zzc = Long.toString(j10);
        }
        zzbuVar.zzi = zzboVar;
        zzbt zzbtVar = new zzbt();
        zzbtVar.zza = "2.0.0";
        zzbuVar.zzj = zzbtVar;
        return zzbuVar;
    }
}
