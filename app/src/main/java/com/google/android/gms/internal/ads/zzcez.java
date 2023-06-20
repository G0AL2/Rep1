package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcez extends Thread {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcez(zzcfb zzcfbVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzcfn(null).zza(this.zza);
    }
}
