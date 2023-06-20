package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeuj implements zzetg {
    private final zzcer zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvm zzd;
    private final zzbcp zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeuj(String str, zzbcp zzbcpVar, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvmVar, byte[] bArr) {
        this.zzb = str;
        this.zze = zzbcpVar;
        this.zza = zzcerVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzck)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcp)).booleanValue()) {
                zzfvl zzn = zzfvc.zzn(zzfnz.zza(Tasks.forResult(null)), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeuh
                    @Override // com.google.android.gms.internal.ads.zzfuj
                    public final zzfvl zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzfvc.zzi(new zzeuk(null, -1));
                        }
                        return zzfvc.zzi(new zzeuk(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbje.zza.zze()).booleanValue()) {
                    zzn = zzfvc.zzo(zzn, ((Long) zzbje.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfvc.zzf(zzn, Exception.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzeui
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        return zzeuj.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfvc.zzi(new zzeuk(null, -1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeuk zzc(Exception exc) {
        this.zza.zzt(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeuk(null, -1);
    }
}
