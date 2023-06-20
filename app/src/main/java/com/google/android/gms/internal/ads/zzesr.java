package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzesr implements zzetg {
    private final zzcdn zza;
    private final zzfvm zzb;
    private final Context zzc;

    public zzesr(zzcdn zzcdnVar, zzfvm zzfvmVar, Context context) {
        this.zza = zzcdnVar;
        this.zzb = zzfvmVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesr.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzess zzc() throws Exception {
        if (this.zza.zzu(this.zzc)) {
            String zze = this.zza.zze(this.zzc);
            String str = zze == null ? "" : zze;
            String zzc = this.zza.zzc(this.zzc);
            String str2 = zzc == null ? "" : zzc;
            String zza = this.zza.zza(this.zzc);
            String str3 = zza == null ? "" : zza;
            String zzb = this.zza.zzb(this.zzc);
            return new zzess(str, str2, str3, zzb == null ? "" : zzb, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzad) : null);
        }
        return new zzess(null, null, null, null, null);
    }
}
