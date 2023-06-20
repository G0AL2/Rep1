package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevu implements zzetg {
    private final zzcer zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvm zzd;
    private final String zze;
    private final zzceg zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevu(zzcer zzcerVar, boolean z10, zzceg zzcegVar, zzfvm zzfvmVar, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzcerVar;
        this.zzb = z10;
        this.zzf = zzcegVar;
        this.zzd = zzfvmVar;
        this.zze = str;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return !this.zzb ? zzfvc.zzi(null) : zzfvc.zzf(zzfvc.zzo(zzfvc.zzm(zzfvc.zzi(null), new zzfok() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzevv(str);
            }
        }, this.zzd), ((Long) zzbkc.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                zzevu.this.zzc((Exception) obj);
                return null;
            }
        }, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzevv zzc(Exception exc) {
        this.zza.zzt(exc, "TrustlessTokenSignal");
        return null;
    }
}
