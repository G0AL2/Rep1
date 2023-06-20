package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeub implements zzetg {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcei zzd;

    public zzeub(zzcei zzceiVar, Executor executor, String str, PackageInfo packageInfo, int i10, byte[] bArr) {
        this.zzd = zzceiVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzg(zzfvc.zzm(zzfvc.zzi(this.zzb), new zzfok() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return new zzeuc((String) obj);
            }
        }, this.zza), Throwable.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeua
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzeub.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(Throwable th) throws Exception {
        return zzfvc.zzi(new zzeuc(this.zzb));
    }
}
