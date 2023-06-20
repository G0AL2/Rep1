package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqg extends zzaqn {
    public zzaqg(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "J3h/yn9IydN0jKZWyOmBNA2CGG4oT7iCghUPqzDf4kG+cww4wp/vL8nWOQWDaiv6", "+oHygsI2eAotNvI8PLMFrbhe03kQ9oSi83I/J9IxJZk=", zzaliVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzaox zzaoxVar = new zzaox((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzo(zzaoxVar.zza.longValue());
            this.zze.zzp(zzaoxVar.zzb.longValue());
        }
    }
}
