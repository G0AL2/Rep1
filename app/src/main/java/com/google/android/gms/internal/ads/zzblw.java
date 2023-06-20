package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzblw implements NativeCustomTemplateAd {
    private final zzblv zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzd;

    @VisibleForTesting
    public zzblw(zzblv zzblvVar) {
        Context context;
        this.zza = zzblvVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzblvVar.zzg());
        } catch (RemoteException | NullPointerException e10) {
            zzcfi.zzh("", e10);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzq(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e11) {
                zzcfi.zzh("", e11);
            }
        }
        this.zzb = mediaView;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.zza.zzk();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzp()) {
                this.zzd = new zzbkv(this.zza);
            }
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzblb zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new zzblc(zzf);
            }
            return null;
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.zza.zzi(str);
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            com.google.android.gms.ads.internal.client.zzdk zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e10) {
            zzcfi.zzh("Exception occurred while getting video controller", e10);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.zza.zzm(str);
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    public final zzblv zza() {
        return this.zza;
    }
}
