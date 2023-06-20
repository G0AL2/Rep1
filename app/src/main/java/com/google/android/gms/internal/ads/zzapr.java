package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapr extends zzaqn {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapr(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "NuaVE443qhtP6/N+u8tA8HilHNLFyQFq7pn4MjW5OGwcdLTSMQ1k8XjYehsxVeon", "z5NXQuc0uiNSVbndYdMaUlJv3uv2TfesAU8D9T9pl4E=", zzaliVar, i10, 44);
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
            this.zze.zzn(zzi.longValue());
        }
    }
}
