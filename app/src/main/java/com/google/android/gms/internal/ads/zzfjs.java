package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjs extends zzfjp {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfjs(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfjr(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), (long) Constants.MIN_PROGRESS_TIME));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final void zzf(zzfir zzfirVar, zzfip zzfipVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfipVar.zzi();
        for (String str : zzi.keySet()) {
            zzfjt.zzg(jSONObject, str, (zzfix) zzi.get(str));
        }
        zzg(zzfirVar, zzfipVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final void zzj() {
        WebView webView = new WebView(zzfjg.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfix zzfixVar = (zzfix) this.zzc.get((String) it.next());
        throw null;
    }
}
