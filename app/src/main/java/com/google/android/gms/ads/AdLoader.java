package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbl zzc;

    AdLoader(Context context, zzbl zzblVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzblVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdr zzdrVar) {
        zzbhz.zzc(this.zzb);
        if (((Boolean) zzbjn.zzc.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                zzcex.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdrVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e10) {
            zzcfi.zzh("Failed to load ad.", e10);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to check if ad is loading.", e10);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza());
    }

    public void loadAds(AdRequest adRequest, int i10) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza()), i10);
        } catch (RemoteException e10) {
            zzcfi.zzh("Failed to load ads.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdr zzdrVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e10) {
            zzcfi.zzh("Failed to load ad.", e10);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final Context zza;
        private final zzbo zzb;

        public Builder(Context context, String str) {
            zzbo zzc = zzaw.zza().zzc(context, str, new zzbtx());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e10) {
                zzcfi.zzh("Failed to build AdLoader.", e10);
                return new AdLoader(this.zza, new zzeo().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new zzbni(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
                } catch (RemoteException e10) {
                    zzcfi.zzk("Failed to add Google Ad Manager banner ad listener", e10);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbxf zzbxfVar = new zzbxf(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbxfVar.zzb(), zzbxfVar.zza());
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to add custom format ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbng zzbngVar = new zzbng(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbngVar.zze(), zzbngVar.zzd());
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to add custom template ad listener", e10);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbxh(onNativeAdLoadedListener));
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbnj(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new zzg(adListener));
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to set AdListener.", e10);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to specify Ad Manager banner ad options", e10);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbkp(nativeAdOptions));
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbkp(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e10) {
                zzcfi.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
