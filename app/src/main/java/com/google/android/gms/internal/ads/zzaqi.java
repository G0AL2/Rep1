package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqi extends zzaqn {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaqi(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "oSBV0gkM1yTotHLC+K1O/2QESKvM1OzdR7LLRpJm660IC9CZK+wk8pHl5h8TdV48", "A3Rh/mKF+88qDRUgTtU47eZJOyPh9v2tsYzP/5oF+dA=", zzaliVar, i10, 33);
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
            this.zze.zzU(zzi.longValue());
        }
    }
}
