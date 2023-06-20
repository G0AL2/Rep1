package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfjp {
    private zzfkn zza;
    private long zzb;
    private int zzc;

    public zzfjp() {
        zzb();
        this.zza = new zzfkn(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j10) {
        if (j10 < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzfji.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j10) {
        if (j10 >= this.zzb) {
            this.zzc = 2;
            zzfji.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfir zzfirVar, zzfip zzfipVar) {
        zzg(zzfirVar, zzfipVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(zzfir zzfirVar, zzfip zzfipVar, JSONObject jSONObject) {
        String zzh = zzfirVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfjt.zzg(jSONObject2, "environment", "app");
        zzfjt.zzg(jSONObject2, "adSessionType", zzfipVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfjt.zzg(jSONObject3, "deviceType", str + "; " + str2);
        zzfjt.zzg(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfjt.zzg(jSONObject3, "os", "Android");
        zzfjt.zzg(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfjt.zzg(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfjt.zzg(jSONObject4, "partnerName", zzfipVar.zze().zzb());
        zzfjt.zzg(jSONObject4, "partnerVersion", zzfipVar.zze().zzc());
        zzfjt.zzg(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfjt.zzg(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        zzfjt.zzg(jSONObject5, "appId", zzfjg.zzb().zza().getApplicationContext().getPackageName());
        zzfjt.zzg(jSONObject2, "app", jSONObject5);
        if (zzfipVar.zzf() != null) {
            zzfjt.zzg(jSONObject2, "contentUrl", zzfipVar.zzf());
        }
        zzfjt.zzg(jSONObject2, "customReferenceData", zzfipVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfipVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfji.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfix zzfixVar = (zzfix) it.next();
            throw null;
        }
    }

    public final void zzh(float f10) {
        zzfji.zza().zze(zza(), f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(WebView webView) {
        this.zza = new zzfkn(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != 0;
    }
}
