package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzau {
    private final zzk zza;
    private final zzi zzb;
    private final zzek zzc;
    private final zzbna zzd;
    private final zzcbq zze;
    private final zzbxs zzf;
    private final zzbnb zzg;
    private zzbza zzh;

    public zzau(zzk zzkVar, zzi zziVar, zzek zzekVar, zzbna zzbnaVar, zzcbq zzcbqVar, zzbxs zzbxsVar, zzbnb zzbnbVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzekVar;
        this.zzd = zzbnaVar;
        this.zze = zzcbqVar;
        this.zzf = zzbxsVar;
        this.zzg = zzbnbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzs(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbo zzc(Context context, String str, zzbua zzbuaVar) {
        return (zzbo) new zzam(this, context, str, zzbuaVar).zzd(context, false);
    }

    public final zzbs zzd(Context context, zzq zzqVar, String str, zzbua zzbuaVar) {
        return (zzbs) new zzai(this, context, zzqVar, str, zzbuaVar).zzd(context, false);
    }

    public final zzbs zze(Context context, zzq zzqVar, String str, zzbua zzbuaVar) {
        return (zzbs) new zzak(this, context, zzqVar, str, zzbuaVar).zzd(context, false);
    }

    public final zzblf zzg(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzblf) new zzaq(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbll zzh(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbll) new zzas(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbpk zzk(Context context, zzbua zzbuaVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbpk) new zzag(this, context, zzbuaVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbxl zzl(Context context, zzbua zzbuaVar) {
        return (zzbxl) new zzae(this, context, zzbuaVar).zzd(context, false);
    }

    public final zzbxv zzn(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcfi.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbxv) zzaaVar.zzd(activity, z10);
    }

    public final zzcbe zzp(Context context, String str, zzbua zzbuaVar) {
        return (zzcbe) new zzat(this, context, str, zzbuaVar).zzd(context, false);
    }

    public final zzcdz zzq(Context context, zzbua zzbuaVar) {
        return (zzcdz) new zzac(this, context, zzbuaVar).zzd(context, false);
    }
}
