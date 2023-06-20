package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqf extends zzaqn {
    private final StackTraceElement[] zzi;

    public zzaqf(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzapcVar, "aZvf8nokSQAvHIIdmzwu8civ2+qb07zM1ZEz6qZf1UzLfoKt8BndVgmiOXFGATXV", "1Q5N5QhnMtop76rkewUHBq0dfu+Fpixkwg9xHoBYaMc=", zzaliVar, i10, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzaou zzaouVar = new zzaou((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzE(zzaouVar.zza.longValue());
                if (zzaouVar.zzb.booleanValue()) {
                    this.zze.zzab(true != zzaouVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzab(3);
                }
            }
        }
    }
}
