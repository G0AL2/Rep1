package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjh;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private zzfvl zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private zzbbm zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private String zzm = "-1";
    private String zzn = "-1";
    private int zzo = -1;
    private zzcel zzp = new zzcel("", 0);
    private long zzq = 0;
    private long zzr = 0;
    private int zzs = -1;
    private int zzt = 0;
    private Set zzu = Collections.emptySet();
    private JSONObject zzv = new JSONObject();
    private boolean zzw = true;
    private boolean zzx = true;
    private String zzy = null;
    private String zzz = "";
    private boolean zzA = false;
    private String zzB = "";
    private int zzC = -1;
    private int zzD = -1;
    private long zzE = 0;

    private final void zzR() {
        zzfvl zzfvlVar = this.zzd;
        if (zzfvlVar == null || zzfvlVar.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            zzcfi.zzk("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzB.equals(str)) {
                    return;
                }
                this.zzB = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzA == z10) {
                    return;
                }
                this.zzA = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        zzR();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzy, str)) {
                return;
            }
            this.zzy = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr == j10) {
                return;
            }
            this.zzr = j10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i10) {
        zzR();
        synchronized (this.zza) {
            this.zzo = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        char c10;
        zzR();
        synchronized (this.zza) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                this.zzl = str2;
            } else if (c10 == 1) {
                this.zzm = str2;
            } else if (c10 != 2) {
                return;
            } else {
                this.zzn = str2;
            }
            if (this.zzg != null) {
                if (str2.equals("-1")) {
                    this.zzg.remove(str);
                } else {
                    this.zzg.putString(str, str2);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (z10 == this.zzk) {
                return;
            }
            this.zzk = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z10) {
        zzR();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzv.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i10;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzv.put(str, optJSONArray);
            } catch (JSONException e10) {
                zzcfi.zzk("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzv.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzs == i10) {
                return;
            }
            this.zzs = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD == i10) {
                return;
            }
            this.zzD = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzE == j10) {
                return;
            }
            this.zzE = j10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzw;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzx;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzA;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzar)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                z10 = this.zzk;
            }
            return z10;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = edit;
            if (PlatformVersion.isAtLeastM()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzt = this.zzf.getInt("version_code", this.zzt);
            this.zzp = new zzcel(this.zzf.getString("app_settings_json", this.zzp.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.zza()));
            this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
            this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
            this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
            this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
            this.zzy = this.zzf.getString("display_cutout", this.zzy);
            this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
            this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
            this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
            this.zzz = this.zzf.getString("inspector_info", this.zzz);
            this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
            this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
            this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
            this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
            this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
            this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
            try {
                this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
            } catch (JSONException e10) {
                zzcfi.zzk("Could not convert native advanced settings to json object", e10);
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzt;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzo;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzs;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzq;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzr;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzE;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbbm zzg() {
        if (this.zzb) {
            if (!(zzM() && zzN()) && ((Boolean) zzbjh.zzb.zze()).booleanValue()) {
                synchronized (this.zza) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.zze == null) {
                        this.zze = new zzbbm();
                    }
                    this.zze.zze();
                    zzcfi.zzi("start fetching content...");
                    return this.zze;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcel zzh() {
        zzcel zzcelVar;
        zzR();
        synchronized (this.zza) {
            zzcelVar = this.zzp;
        }
        return zzcelVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcel zzi() {
        zzcel zzcelVar;
        synchronized (this.zza) {
            zzcelVar = this.zzp;
        }
        return zzcelVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzB;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzy;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        char c10;
        zzR();
        synchronized (this.zza) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                return this.zzl;
            } else if (c10 == 1) {
                return this.zzm;
            } else if (c10 != 2) {
                return null;
            } else {
                return this.zzn;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzv;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            this.zzd = zzcfv.zza.zza(new Runnable(context, "admob") { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    zzj.this.zzQ(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        zzR();
        synchronized (this.zza) {
            this.zzv = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq == j10) {
                return;
            }
            this.zzq = j10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        zzR();
        synchronized (this.zza) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (str != null && !str.equals(this.zzp.zzc())) {
                this.zzp = new zzcel(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
                for (Runnable runnable : this.zzc) {
                    runnable.run();
                }
                return;
            }
            this.zzp.zzg(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzt == i10) {
                return;
            }
            this.zzt = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzi)) {
                return;
            }
            this.zzi = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzw == z10) {
                return;
            }
            this.zzw = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzj)) {
                return;
            }
            this.zzj = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzx == z10) {
                return;
            }
            this.zzx = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }
}
