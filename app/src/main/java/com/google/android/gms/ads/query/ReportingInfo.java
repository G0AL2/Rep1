package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbys;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class ReportingInfo {
    private final zzbys zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final zzbyr zza;

        @KeepForSdk
        public Builder(View view) {
            zzbyr zzbyrVar = new zzbyr();
            this.zza = zzbyrVar;
            zzbyrVar.zzb(view);
        }

        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @KeepForSdk
        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbys(builder.zza);
    }

    @KeepForSdk
    public void recordClick(List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    public void recordImpression(List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
