package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqe extends zzaqn {
    private final boolean zzi;

    public zzaqe(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "1fofpOOYcFfS5YFFd3ctXz8Mp5NAKFN2TSgOzUMkaRdV9dKus3ViOY+jtkwxi6r2", "5dATknTk87foLpzL0Dq3Gho5ELQoI7cNb0jy2DaFKNg=", zzaliVar, i10, 61);
        this.zzi = zzapcVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzD(longValue);
        }
    }
}
