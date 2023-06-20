package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapw extends zzaqn {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapw(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "zo8V8X8kshYkxeE23t3OyXdoh3FPhn0ETnxP8vKAUZieFhalf6x5LNoDw8Q1oLRS", "Hf8oHWnCgsj7Y9XZDlAl+qeEGkjuhCtSnXpSHq9fewc=", zzaliVar, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzx(zzi.longValue());
        }
    }
}
