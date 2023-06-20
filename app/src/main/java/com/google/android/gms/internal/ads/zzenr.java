package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenr implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;
    private final zzfcp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenr(zzfvm zzfvmVar, zzfcd zzfcdVar, zzfcp zzfcpVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfcdVar;
        this.zzc = zzfcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenr.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzens zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgg)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzfcp.zza();
        }
        return new zzens(str);
    }
}
