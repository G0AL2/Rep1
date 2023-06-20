package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdqy {
    private final Executor zza;
    private final zzcun zzb;
    private final zzdjb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqy(Executor executor, zzcun zzcunVar, zzdjb zzdjbVar) {
        this.zza = executor;
        this.zzc = zzdjbVar;
        this.zzb = zzcunVar;
    }

    public final void zza(final zzcli zzcliVar) {
        if (zzcliVar == null) {
            return;
        }
        this.zzc.zza(zzcliVar.zzH());
        this.zzc.zzj(new zzban() { // from class: com.google.android.gms.internal.ads.zzdqu
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzc(zzbam zzbamVar) {
                zzcmv zzP = zzcli.this.zzP();
                Rect rect = zzbamVar.zzd;
                zzP.zzo(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzj(new zzban() { // from class: com.google.android.gms.internal.ads.zzdqv
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzc(zzbam zzbamVar) {
                zzcli zzcliVar2 = zzcli.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzbamVar.zzj ? "0" : "1");
                zzcliVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzj(this.zzb, this.zza);
        this.zzb.zzf(zzcliVar);
        zzcliVar.zzaf("/trackActiveViewUnit", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdqy.this.zzb((zzcli) obj, map);
            }
        });
        zzcliVar.zzaf("/untrackActiveViewUnit", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdqy.this.zzc((zzcli) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcli zzcliVar, Map map) {
        this.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcli zzcliVar, Map map) {
        this.zzb.zza();
    }
}
