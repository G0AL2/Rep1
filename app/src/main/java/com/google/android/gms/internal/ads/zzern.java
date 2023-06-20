package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import fm.castbox.mediation.widget.AdView;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzern implements zzetg {
    private final zzfvm zza;
    private final Context zzb;
    private final Set zzc;

    public zzern(zzfvm zzfvmVar, Context context, Set set) {
        this.zza = zzfvmVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzern.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzero zzc() throws Exception {
        zzbhr zzbhrVar = zzbhz.zzeb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains(RNAdsEvents.EVENT_REWARDED) || set.contains("interstitial") || set.contains("native") || set.contains(AdView.AdType.BANNER)) {
                com.google.android.gms.ads.internal.zzt.zzh();
                return new zzero(true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue() ? "a.1.3.3-google_20200416" : null);
            }
        }
        return new zzero(null);
    }
}
