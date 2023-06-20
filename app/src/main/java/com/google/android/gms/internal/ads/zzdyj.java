package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyj {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzduc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdwq zzl;
    private final zzcfo zzm;
    private final zzdik zzo;
    private final zzfhu zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcga zze = new zzcga();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();

    public zzdyj(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzduc zzducVar, ScheduledExecutorService scheduledExecutorService, zzdwq zzdwqVar, zzcfo zzcfoVar, zzdik zzdikVar, zzfhu zzfhuVar) {
        this.zzh = zzducVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdwqVar;
        this.zzm = zzcfoVar;
        this.zzo = zzdikVar;
        this.zzp = zzfhuVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(final zzdyj zzdyjVar, String str) {
        int i10 = 5;
        final zzfhh zza = zzfhg.zza(zzdyjVar.zzf, 5);
        zza.zzf();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfhh zza2 = zzfhg.zza(zzdyjVar.zzf, i10);
                zza2.zzf();
                zza2.zzc(next);
                final Object obj = new Object();
                final zzcga zzcgaVar = new zzcga();
                zzfvl zzo = zzfvc.zzo(zzcgaVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbz)).longValue(), TimeUnit.SECONDS, zzdyjVar.zzk);
                zzdyjVar.zzl.zzc(next);
                zzdyjVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
                zzo.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdya
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyj.this.zzq(obj, zzcgaVar, next, elapsedRealtime, zza2);
                    }
                }, zzdyjVar.zzi);
                arrayList.add(zzo);
                final zzdyi zzdyiVar = new zzdyi(zzdyjVar, obj, next, elapsedRealtime, zza2, zzcgaVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbqq(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdyjVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfcy zzc = zzdyjVar.zzh.zzc(next, new JSONObject());
                        zzdyjVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdye
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdyj.this.zzn(zzc, zzdyiVar, arrayList2, next);
                            }
                        });
                    } catch (zzfci unused2) {
                        zzdyiVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e10) {
                    zzcfi.zzh("", e10);
                }
                i10 = 5;
            }
            zzfvc.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdyj.this.zzf(zza);
                    return null;
                }
            }, zzdyjVar.zzi);
        } catch (JSONException e11) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e11);
            zzdyjVar.zzo.zza("MalformedJson");
            zzdyjVar.zzl.zza("MalformedJson");
            zzdyjVar.zze.zze(e11);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e11, "AdapterInitializer.updateAdapterStatus");
            zzfhu zzfhuVar = zzdyjVar.zzp;
            zza.zze(false);
            zzfhuVar.zzb(zza.zzj());
        }
    }

    private final synchronized zzfvl zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzfvc.zzi(zzc);
        }
        final zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // java.lang.Runnable
            public final void run() {
                zzdyj.this.zzo(zzcgaVar);
            }
        });
        return zzcgaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbqg(str, z10, i10, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfhh zzfhhVar) throws Exception {
        this.zze.zzd(Boolean.TRUE);
        zzfhu zzfhuVar = this.zzp;
        zzfhhVar.zze(true);
        zzfhuVar.zzb(zzfhhVar.zzj());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbqg zzbqgVar = (zzbqg) this.zzn.get(str);
            arrayList.add(new zzbqg(str, zzbqgVar.zzb, zzbqgVar.zzc, zzbqgVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zze(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzfcy zzfcyVar, zzbqk zzbqkVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfcyVar.zzi(context, zzbqkVar, list);
            } catch (zzfci unused) {
                zzbqkVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(final zzcga zzcgaVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // java.lang.Runnable
            public final void run() {
                zzcga zzcgaVar2 = zzcgaVar;
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (!TextUtils.isEmpty(zzc)) {
                    zzcgaVar2.zzd(zzc);
                } else {
                    zzcgaVar2.zze(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcga zzcgaVar, String str, long j10, zzfhh zzfhhVar) {
        synchronized (obj) {
            if (!zzcgaVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhu zzfhuVar = this.zzp;
                zzfhhVar.zze(false);
                zzfhuVar.zzb(zzfhhVar.zzj());
                zzcgaVar.zzd(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzby)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyj.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfvl zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyj.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbA)).longValue(), TimeUnit.SECONDS);
                    zzfvc.zzr(zzu, new zzdyh(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzd(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbqn zzbqnVar) {
        this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyd
            @Override // java.lang.Runnable
            public final void run() {
                zzdyj zzdyjVar = zzdyj.this;
                try {
                    zzbqnVar.zzb(zzdyjVar.zzg());
                } catch (RemoteException e10) {
                    zzcfi.zzh("", e10);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
