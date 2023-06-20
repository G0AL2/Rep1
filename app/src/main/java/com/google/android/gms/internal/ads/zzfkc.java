package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfkc implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfkf.zzc;
        if (handler != null) {
            handler2 = zzfkf.zzc;
            runnable = zzfkf.zzd;
            handler2.post(runnable);
            handler3 = zzfkf.zzc;
            runnable2 = zzfkf.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
