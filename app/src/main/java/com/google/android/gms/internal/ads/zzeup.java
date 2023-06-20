package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeup implements zzetg {
    private final Context zza;
    private final zzcer zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcei zzf;

    public zzeup(zzcei zzceiVar, int i10, Context context, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzceiVar;
        this.zza = context;
        this.zzb = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzf((zzfut) zzfvc.zzo(zzfvc.zzm(zzfut.zzv(zzfvc.zzl(new zzfui() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzfui
            public final zzfvl zza() {
                return zzfvc.zzi(null);
            }
        }, this.zzd)), new zzfok() { // from class: com.google.android.gms.internal.ads.zzeun
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzeuq(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzeuo
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                zzeup.this.zzc((Exception) obj);
                return null;
            }
        }, zzfvs.zzb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeuq zzc(Exception exc) {
        this.zzb.zzt(exc, "AttestationTokenSignal");
        return null;
    }
}
