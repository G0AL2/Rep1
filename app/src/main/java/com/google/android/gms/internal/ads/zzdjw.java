package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdjw extends zzdhc {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdjw(Set set) {
        super(set);
    }

    public final void zza() {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzo(zzdjt.zza);
            this.zzb = true;
        }
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzo(zzdjt.zza);
        this.zzb = true;
    }
}
