package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoc;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgi implements zzhd {
    private static volatile zzgi zzd;
    private zzep zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    @VisibleForTesting
    protected Boolean zza;
    @VisibleForTesting
    protected Boolean zzb;
    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzaa zzj;
    private final zzaf zzk;
    private final zzfn zzl;
    private final zzey zzm;
    private final zzgf zzn;
    private final zzkr zzo;
    private final zzlp zzp;
    private final zzet zzq;
    private final Clock zzr;
    private final zzjb zzs;
    private final zzin zzt;
    private final zzd zzu;
    private final zzir zzv;
    private final String zzw;
    private zzer zzx;
    private zzkb zzy;
    private zzap zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    zzgi(zzhl zzhlVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z10 = false;
        Preconditions.checkNotNull(zzhlVar);
        Context context = zzhlVar.zza;
        zzaa zzaaVar = new zzaa(context);
        this.zzj = zzaaVar;
        zzei.zza = zzaaVar;
        this.zze = context;
        this.zzf = zzhlVar.zzb;
        this.zzg = zzhlVar.zzc;
        this.zzh = zzhlVar.zzd;
        this.zzi = zzhlVar.zzh;
        this.zzE = zzhlVar.zze;
        this.zzw = zzhlVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhlVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhy.zze(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l10 = zzhlVar.zzi;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzaf(this);
        zzfn zzfnVar = new zzfn(this);
        zzfnVar.zzv();
        this.zzl = zzfnVar;
        zzey zzeyVar = new zzey(this);
        zzeyVar.zzv();
        this.zzm = zzeyVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzv();
        this.zzp = zzlpVar;
        this.zzq = new zzet(new zzhk(zzhlVar, this));
        this.zzu = new zzd(this);
        zzjb zzjbVar = new zzjb(this);
        zzjbVar.zzb();
        this.zzs = zzjbVar;
        zzin zzinVar = new zzin(this);
        zzinVar.zzb();
        this.zzt = zzinVar;
        zzkr zzkrVar = new zzkr(this);
        zzkrVar.zzb();
        this.zzo = zzkrVar;
        zzir zzirVar = new zzir(this);
        zzirVar.zzv();
        this.zzv = zzirVar;
        zzgf zzgfVar = new zzgf(this);
        zzgfVar.zzv();
        this.zzn = zzgfVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhlVar.zzg;
        z10 = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : true;
        if (context.getApplicationContext() instanceof Application) {
            zzin zzq = zzq();
            if (zzq.zzs.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzs.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzim(zzq, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    zzq.zzs.zzaz().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzaz().zzk().zza("Application context is not an Application");
        }
        zzgfVar.zzp(new zzgh(this, zzhlVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzA(zzgi zzgiVar, zzhl zzhlVar) {
        zzgiVar.zzaA().zzg();
        zzgiVar.zzk.zzn();
        zzap zzapVar = new zzap(zzgiVar);
        zzapVar.zzv();
        zzgiVar.zzz = zzapVar;
        zzep zzepVar = new zzep(zzgiVar, zzhlVar.zzf);
        zzepVar.zzb();
        zzgiVar.zzA = zzepVar;
        zzer zzerVar = new zzer(zzgiVar);
        zzerVar.zzb();
        zzgiVar.zzx = zzerVar;
        zzkb zzkbVar = new zzkb(zzgiVar);
        zzkbVar.zzb();
        zzgiVar.zzy = zzkbVar;
        zzgiVar.zzp.zzw();
        zzgiVar.zzl.zzw();
        zzgiVar.zzA.zzc();
        zzew zzi = zzgiVar.zzaz().zzi();
        zzgiVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 61000L);
        zzgiVar.zzaz().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzepVar.zzl();
        if (TextUtils.isEmpty(zzgiVar.zzf)) {
            if (zzgiVar.zzv().zzae(zzl)) {
                zzgiVar.zzaz().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgiVar.zzaz().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgiVar.zzaz().zzc().zza("Debug-level message logging enabled");
        if (zzgiVar.zzG != zzgiVar.zzH.get()) {
            zzgiVar.zzaz().zzd().zzc("Not all components initialized", Integer.valueOf(zzgiVar.zzG), Integer.valueOf(zzgiVar.zzH.get()));
        }
        zzgiVar.zzB = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzhb zzhbVar) {
        if (zzhbVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar != null) {
            if (!zzfVar.zze()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzR(zzhc zzhcVar) {
        if (zzhcVar != null) {
            if (!zzhcVar.zzx()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzhcVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzgi zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzgi.class) {
                if (zzd == null) {
                    zzd = new zzgi(new zzhl(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzC(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            zzaz().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            zzm().zzm.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzaz().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlp zzv = zzv();
                    zzgi zzgiVar = zzv.zzs;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzs.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzH("auto", "_cmp", bundle);
                        zzlp zzv2 = zzv();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = zzv2.zzs.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                zzv2.zzs.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e10) {
                            zzv2.zzs.zzaz().zzd().zzb("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                    zzaz().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    zzaz().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            zzaz().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzaz().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaA().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (this.zzk.zzr() && !((Boolean) zzb.second).booleanValue() && !TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzir zzr = zzr();
            zzr.zzu();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzs.zze.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzlp zzv = zzv();
                zzh().zzs.zzk.zzh();
                URL zzE = zzv.zzE(61000L, zzl, (String) zzb.first, zzm().zzn.zza() - 1);
                if (zzE != null) {
                    zzir zzr2 = zzr();
                    zzgg zzggVar = new zzgg(this);
                    zzr2.zzg();
                    zzr2.zzu();
                    Preconditions.checkNotNull(zzE);
                    Preconditions.checkNotNull(zzggVar);
                    zzr2.zzs.zzaA().zzo(new zziq(zzr2, zzl, zzE, null, null, zzggVar, null));
                    return;
                }
                return;
            }
            zzaz().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzaz().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF(boolean z10) {
        this.zzE = Boolean.valueOf(z10);
    }

    public final void zzG(boolean z10) {
        zzaA().zzg();
        this.zzF = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzah zzahVar;
        zzaA().zzg();
        zzah zzc = zzm().zzc();
        zzfn zzm = zzm();
        zzgi zzgiVar = zzm.zzs;
        zzm.zzg();
        int i10 = 100;
        int i11 = zzm.zza().getInt("consent_source", 100);
        zzaf zzafVar = this.zzk;
        zzgi zzgiVar2 = zzafVar.zzs;
        Boolean zzk = zzafVar.zzk("google_analytics_default_allow_ad_storage");
        zzaf zzafVar2 = this.zzk;
        zzgi zzgiVar3 = zzafVar2.zzs;
        Boolean zzk2 = zzafVar2.zzk("google_analytics_default_allow_analytics_storage");
        if ((zzk != null || zzk2 != null) && zzm().zzl(-10)) {
            zzahVar = new zzah(zzk, zzk2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                zzq().zzT(zzah.zza, -10, this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzahVar = zzah.zza(zzclVar.zzg);
                if (!zzahVar.equals(zzah.zza)) {
                    i10 = 30;
                }
            }
            zzahVar = null;
        }
        if (zzahVar != null) {
            zzq().zzT(zzahVar, i10, this.zzc);
            zzc = zzahVar;
        }
        zzq().zzX(zzc);
        if (zzm().zzc.zza() == 0) {
            zzaz().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (!zzM()) {
            if (zzJ()) {
                if (!zzv().zzad("android.permission.INTERNET")) {
                    zzaz().zzd().zza("App is missing INTERNET permission");
                }
                if (!zzv().zzad("android.permission.ACCESS_NETWORK_STATE")) {
                    zzaz().zzd().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                    if (!zzlp.zzaj(this.zze)) {
                        zzaz().zzd().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzlp.zzak(this.zze, false)) {
                        zzaz().zzd().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzaz().zzd().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzlp zzv = zzv();
                String zzm2 = zzh().zzm();
                zzfn zzm3 = zzm();
                zzm3.zzg();
                String string = zzm3.zza().getString("gmp_app_id", null);
                String zzk3 = zzh().zzk();
                zzfn zzm4 = zzm();
                zzm4.zzg();
                if (zzv.zzan(zzm2, string, zzk3, zzm4.zza().getString("admob_app_id", null))) {
                    zzaz().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfn zzm5 = zzm();
                    zzm5.zzg();
                    Boolean zzd2 = zzm5.zzd();
                    SharedPreferences.Editor edit = zzm5.zza().edit();
                    edit.clear();
                    edit.apply();
                    if (zzd2 != null) {
                        zzm5.zzh(zzd2);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfn zzm6 = zzm();
                String zzm7 = zzh().zzm();
                zzm6.zzg();
                SharedPreferences.Editor edit2 = zzm6.zza().edit();
                edit2.putString("gmp_app_id", zzm7);
                edit2.apply();
                zzfn zzm8 = zzm();
                String zzk4 = zzh().zzk();
                zzm8.zzg();
                SharedPreferences.Editor edit3 = zzm8.zza().edit();
                edit3.putString("admob_app_id", zzk4);
                edit3.apply();
            }
            if (!zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzP(zzm().zze.zza());
            zzoc.zzc();
            if (this.zzk.zzs(null, zzel.zzad)) {
                try {
                    zzv().zzs.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzo.zza())) {
                        zzaz().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzo.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zzJ);
                }
                if (zzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzr.zza());
            }
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzaA().zzg();
        return this.zzF;
    }

    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzM() {
        if (this.zzB) {
            zzaA().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(zzv().zzad("android.permission.INTERNET") && zzv().zzad("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlp.zzaj(this.zze) && zzlp.zzak(this.zze, false))));
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().zzX(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                        z10 = false;
                    }
                    this.zzC = Boolean.valueOf(z10);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaA().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            zzaA().zzg();
            if (this.zzF) {
                Boolean zzd2 = zzm().zzd();
                if (zzd2 != null) {
                    return zzd2.booleanValue() ? 0 : 3;
                }
                zzaf zzafVar = this.zzk;
                zzaa zzaaVar = zzafVar.zzs.zzj;
                Boolean zzk = zzafVar.zzk("firebase_analytics_collection_enabled");
                if (zzk != null) {
                    return zzk.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.zza;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final zzgf zzaA() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final Context zzav() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final Clock zzaw() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final zzaa zzax() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzhd
    public final zzey zzaz() {
        zzR(this.zzm);
        return this.zzm;
    }

    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzaf zzf() {
        return this.zzk;
    }

    public final zzap zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    public final zzep zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    public final zzer zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    public final zzet zzj() {
        return this.zzq;
    }

    public final zzey zzl() {
        zzey zzeyVar = this.zzm;
        if (zzeyVar == null || !zzeyVar.zzx()) {
            return null;
        }
        return zzeyVar;
    }

    public final zzfn zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgf zzo() {
        return this.zzn;
    }

    public final zzin zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    public final zzir zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    public final zzjb zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    public final zzkb zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    public final zzkr zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    public final zzlp zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzg;
    }

    public final String zzy() {
        return this.zzh;
    }

    public final String zzz() {
        return this.zzw;
    }
}
