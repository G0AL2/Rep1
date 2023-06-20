package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzchq {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final long zzp;
    public final long zzq;

    public zzchq(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbhz.zzG);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbhz.zzj);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbhz.zzu);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbhz.zzf);
        zzbhr zzbhrVar = zzbhz.zze;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = string;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbhz.zzg);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbhz.zzh);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbhz.zzi);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbhz.zzk);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbhz.zzdo);
            this.zzk = zzb(jSONObject, "min_retry_count", zzbhz.zzl);
            this.zzl = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbhz.zzo);
            this.zzm = zza(jSONObject, "using_official_simple_exo_player", zzbhz.zzbC);
            this.zzn = zza(jSONObject, "enable_multiple_video_playback", zzbhz.zzbD);
            this.zzo = zza(jSONObject, "use_range_http_data_source", zzbhz.zzbF);
            this.zzp = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbhz.zzbG);
            this.zzq = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbhz.zzbH);
        }
        string = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar);
        this.zze = string;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbhz.zzg);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbhz.zzh);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbhz.zzi);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbhz.zzk);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbhz.zzdo);
        this.zzk = zzb(jSONObject, "min_retry_count", zzbhz.zzl);
        this.zzl = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbhz.zzo);
        this.zzm = zza(jSONObject, "using_official_simple_exo_player", zzbhz.zzbC);
        this.zzn = zza(jSONObject, "enable_multiple_video_playback", zzbhz.zzbD);
        this.zzo = zza(jSONObject, "use_range_http_data_source", zzbhz.zzbF);
        this.zzp = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbhz.zzbG);
        this.zzq = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbhz.zzbH);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbhr zzbhrVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbhr zzbhrVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbhr zzbhrVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).longValue();
    }
}
