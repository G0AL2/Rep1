package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaoc zzc;
    private final int zzd;
    private final zzdwm zze;
    private final boolean zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaggingLibraryJsInterface(WebView webView, zzaoc zzaocVar, zzdwm zzdwmVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaocVar;
        this.zze = zzdwmVar;
        zzbhz.zzc(context);
        this.zzd = ((Integer) zzay.zzc().zzb(zzbhz.zzhQ)).intValue();
        this.zzf = ((Boolean) zzay.zzc().zzb(zzbhz.zzhR)).booleanValue();
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e10) {
            zzcfi.zzh("Exception getting click signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            zzcfi.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i10, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcfi.zzh("Exception getting click signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), new zzap(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e10) {
            zzcfi.zzh("Exception getting view signals. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            zzcfi.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i10, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcfi.zzh("Exception getting view signals with timeout. ", e10);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e10 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
        try {
            this.zzc.zzd(MotionEvent.obtain(0L, i12, i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? -1 : 3 : 2 : 1 : 0, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e11) {
            e = e11;
            zzcfi.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e12) {
            e = e12;
            zzcfi.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
