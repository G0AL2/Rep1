package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeiv implements zzfuj {
    private final zzfgf zza;
    private final zzdbv zzb;
    private final zzfie zzc;
    private final zzfii zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcya zzg;
    private final zzeiq zzh;
    private final zzefi zzi;
    private final Context zzj;
    private final zzfhs zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeiv(Context context, zzfgf zzfgfVar, zzeiq zzeiqVar, zzdbv zzdbvVar, zzfie zzfieVar, zzfii zzfiiVar, zzcya zzcyaVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefi zzefiVar, zzfhs zzfhsVar) {
        this.zzj = context;
        this.zza = zzfgfVar;
        this.zzh = zzeiqVar;
        this.zzb = zzdbvVar;
        this.zzc = zzfieVar;
        this.zzd = zzfiiVar;
        this.zzg = zzcyaVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefiVar;
        this.zzk = zzfhsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    @Override // com.google.android.gms.internal.ads.zzfuj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfvl zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeiv.zza(java.lang.Object):com.google.android.gms.internal.ads.zzfvl");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzb(zzfbl zzfblVar, zzfbx zzfbxVar, zzefd zzefdVar, Throwable th) throws Exception {
        zzfhh zza = zzfhg.zza(this.zzj, 12);
        zza.zzc(zzfblVar.zzF);
        zza.zzf();
        zzeiq zzeiqVar = this.zzh;
        zzfvl zzo = zzfvc.zzo(zzefdVar.zza(zzfbxVar, zzfblVar), zzfblVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzeiqVar.zze(zzfbxVar, zzfblVar, zzo, this.zzc);
        zzfhr.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
