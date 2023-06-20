package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzb implements zzdzj, zzdym {
    private final zzdzi zza;
    private final zzdzk zzb;
    private final zzdyn zzc;
    private final zzdyw zzd;
    private final zzdyl zze;
    private final String zzf;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private String zzh = JsonUtils.EMPTY_JSON;
    private String zzi = "";
    private long zzj = Long.MAX_VALUE;
    private zzdyx zzk = zzdyx.NONE;
    private zzdza zzo = zzdza.UNKNOWN;
    private final Map zzg = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzb(zzdzi zzdziVar, zzdzk zzdzkVar, zzdyn zzdynVar, Context context, zzcfo zzcfoVar, zzdyw zzdywVar) {
        this.zza = zzdziVar;
        this.zzb = zzdzkVar;
        this.zzc = zzdynVar;
        this.zze = new zzdyl(context);
        this.zzf = zzcfoVar.zza;
        this.zzd = zzdywVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzo() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzg.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdyp zzdypVar : (List) entry.getValue()) {
                if (zzdypVar.zzd()) {
                    jSONArray.put(zzdypVar.zzc());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzp() {
        this.zzn = true;
        this.zzd.zzc();
        this.zza.zzg(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        zzv(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo());
    }

    private final void zzq() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzG(zzc());
    }

    private final synchronized void zzr(zzdyx zzdyxVar, boolean z10) {
        if (this.zzk == zzdyxVar) {
            return;
        }
        if (zzm()) {
            zzt();
        }
        this.zzk = zzdyxVar;
        if (zzm()) {
            zzu();
        }
        if (z10) {
            zzq();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzs(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzl     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.zzl = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbhr r2 = com.google.android.gms.internal.ads.zzbhz.zzhK     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbhx r0 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            com.google.android.gms.ads.internal.util.zzaw r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.zzu()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.zzm()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.zzt()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.zzq()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzb.zzs(boolean, boolean):void");
    }

    private final synchronized void zzt() {
        zzdyx zzdyxVar = zzdyx.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zza();
        }
    }

    private final synchronized void zzu() {
        zzdyx zzdyxVar = zzdyx.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzs(jSONObject.optBoolean("isTestMode", false), false);
            zzr(zzdyx.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzh = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzj = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdyx zza() {
        return this.zzk;
    }

    public final synchronized String zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzm()) {
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000) {
                this.zzh = JsonUtils.EMPTY_JSON;
                this.zzj = Long.MAX_VALUE;
                return "";
            } else if (this.zzh.equals(JsonUtils.EMPTY_JSON)) {
                return "";
            } else {
                return this.zzh;
            }
        }
        return "";
    }

    public final synchronized String zzc() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzl);
            jSONObject.put("gesture", this.zzk);
            if (this.zzj > com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzh);
                jSONObject.put("networkExtrasExpirationSecs", this.zzj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.zzf);
            jSONObject.put("adapters", this.zzd.zza());
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000) {
                this.zzh = JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzh);
            jSONObject.put("adSlots", zzo());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhL)).booleanValue() && !TextUtils.isEmpty(this.zzi)) {
                String str = this.zzi;
                zzcfi.zze("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.zzi));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                jSONObject.put("openAction", this.zzo);
                jSONObject.put("gesture", this.zzk);
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(e10, "Inspector.toJson");
            zzcfi.zzk("Ad inspector encountered an error", e10);
        }
        return jSONObject;
    }

    public final synchronized void zze(String str, zzdyp zzdypVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzm()) {
            if (this.zzm >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhx)).intValue()) {
                zzcfi.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzg.containsKey(str)) {
                this.zzg.put(str, new ArrayList());
            }
            this.zzm++;
            ((List) this.zzg.get(str)).add(zzdypVar);
        }
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                zzp();
                return;
            }
            String zzo = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    zzp();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzdza zzdzaVar) {
        if (!zzm()) {
            try {
                zzcyVar.zze(zzfdc.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcfi.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            try {
                zzcyVar.zze(zzfdc.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzcfi.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzo = zzdzaVar;
        this.zza.zzi(zzcyVar, new zzbon(this));
        return;
    }

    public final synchronized void zzh(String str, long j10) {
        this.zzh = str;
        this.zzj = j10;
        zzq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzn
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzp()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzl
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzu()
            return
        L15:
            boolean r2 = r1.zzm()
            if (r2 != 0) goto L1e
            r1.zzt()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzb.zzi(boolean):void");
    }

    public final void zzj(zzdyx zzdyxVar) {
        zzr(zzdyxVar, true);
    }

    public final synchronized void zzk(String str) {
        this.zzi = str;
    }

    public final void zzl(boolean z10) {
        if (!this.zzn && z10) {
            zzp();
        }
        zzs(z10, true);
    }

    public final synchronized boolean zzm() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            return this.zzl || com.google.android.gms.ads.internal.zzt.zzs().zzl();
        }
        return this.zzl;
    }

    public final synchronized boolean zzn() {
        return this.zzl;
    }
}
