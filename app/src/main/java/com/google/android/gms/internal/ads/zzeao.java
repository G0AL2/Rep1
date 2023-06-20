package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeao implements zzebm {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzp zzb;
    private final zzfvm zzc;
    private final zzfcd zzd;
    private final ScheduledExecutorService zze;
    private final zzeds zzf;
    private final zzfhs zzg;
    private final Context zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeao(Context context, zzfcd zzfcdVar, zzdzp zzdzpVar, zzfvm zzfvmVar, ScheduledExecutorService scheduledExecutorService, zzeds zzedsVar, zzfhs zzfhsVar) {
        this.zzh = context;
        this.zzd = zzfcdVar;
        this.zzb = zzdzpVar;
        this.zzc = zzfvmVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzedsVar;
        this.zzg = zzfhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzfvl zzb(zzbzv zzbzvVar) {
        zzfvl zzb = this.zzb.zzb(zzbzvVar);
        zzfhh zza2 = zzfhg.zza(this.zzh, 11);
        zzfhr.zzd(zzb, zza2);
        zzfvl zzn = zzfvc.zzn(zzb, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzeao.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzex)).booleanValue()) {
            zzn = zzfvc.zzg(zzfvc.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // com.google.android.gms.internal.ads.zzfuj
                public final zzfvl zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzfvc.zzh(new zzdzl(5));
                }
            }, zzcfv.zzf);
        }
        zzfhr.zza(zzn, this.zzg, zza2);
        zzfvc.zzr(zzn, new zzean(this), zzcfv.zzf);
        return zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(InputStream inputStream) throws Exception {
        return zzfvc.zzi(new zzfbx(new zzfbu(this.zzd), zzfbw.zza(new InputStreamReader(inputStream))));
    }
}
