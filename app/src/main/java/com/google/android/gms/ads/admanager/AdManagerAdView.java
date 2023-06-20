package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbhz.zzc(getContext());
        if (((Boolean) zzbjn.zze.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView.this.zza(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr != null && adSizeArr.length > 0) {
            this.zza.zzt(adSizeArr);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.zza.zzw(z10);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e10) {
            zzbyy.zza(getContext()).zzd(e10, "AdManagerAdView.loadAd");
        }
    }

    public final boolean zzb(zzbs zzbsVar) {
        return this.zza.zzz(zzbsVar);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
