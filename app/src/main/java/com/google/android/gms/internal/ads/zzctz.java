package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctz implements zzbst {
    private final Context zza;
    private final zzbaj zzb;
    private final PowerManager zzc;

    public zzctz(Context context, zzbaj zzbajVar) {
        this.zza = context;
        this.zzb = zzbajVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    /* renamed from: zza */
    public final JSONObject zzb(zzcuc zzcucVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbam zzbamVar = zzcucVar.zzf;
        if (zzbamVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z10 = zzbamVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcucVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcucVar.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.zzc.isInteractive();
            } else {
                isScreenOn = this.zzc.isScreenOn();
            }
            put.put("isScreenOn", isScreenOn).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeH)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbamVar.zzb).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", zzbamVar.zzc.top).put("bottom", zzbamVar.zzc.bottom).put("left", zzbamVar.zzc.left).put("right", zzbamVar.zzc.right)).put("adBox", new JSONObject().put("top", zzbamVar.zzd.top).put("bottom", zzbamVar.zzd.bottom).put("left", zzbamVar.zzd.left).put("right", zzbamVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbamVar.zze.top).put("bottom", zzbamVar.zze.bottom).put("left", zzbamVar.zze.left).put("right", zzbamVar.zze.right)).put("globalVisibleBoxVisible", zzbamVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzbamVar.zzg.top).put("bottom", zzbamVar.zzg.bottom).put("left", zzbamVar.zzg.left).put("right", zzbamVar.zzg.right)).put("localVisibleBoxVisible", zzbamVar.zzh).put("hitBox", new JSONObject().put("top", zzbamVar.zzi.top).put("bottom", zzbamVar.zzi.bottom).put("left", zzbamVar.zzi.left).put("right", zzbamVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcucVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbamVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcucVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
