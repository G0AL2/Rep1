package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaiz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzajb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiz(zzajb zzajbVar, String str, long j10) {
        this.zzc = zzajbVar;
        this.zza = str;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzajm zzajmVar;
        zzajm zzajmVar2;
        zzajmVar = this.zzc.zza;
        zzajmVar.zza(this.zza, this.zzb);
        zzajb zzajbVar = this.zzc;
        zzajmVar2 = zzajbVar.zza;
        zzajmVar2.zzb(zzajbVar.toString());
    }
}
