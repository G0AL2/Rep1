package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfek {
    private final zzfdo zza;
    private final zzfei zzb;
    private final zzfdk zzc;
    private zzfeq zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfek(zzfdo zzfdoVar, zzfdk zzfdkVar, zzfei zzfeiVar) {
        this.zza = zzfdoVar;
        this.zzc = zzfdkVar;
        this.zzb = zzfeiVar;
        zzfdkVar.zzb(new zzfef(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfm)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfej zzfejVar = (zzfej) this.zzd.pollFirst();
                if (zzfejVar == null || (zzfejVar.zza() != null && this.zza.zze(zzfejVar.zza()))) {
                    zzfeq zzfeqVar = new zzfeq(this.zza, this.zzb, zzfejVar);
                    this.zze = zzfeqVar;
                    zzfeqVar.zzd(new zzfeg(this, zzfejVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzfvl zza(zzfej zzfejVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfejVar);
    }

    public final synchronized void zze(zzfej zzfejVar) {
        this.zzd.add(zzfejVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
