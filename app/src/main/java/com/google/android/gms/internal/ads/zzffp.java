package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzffp {
    public static final zzffw zza(Callable callable, Object obj, zzffx zzffxVar) {
        zzfvm zzfvmVar;
        zzfvmVar = zzffxVar.zzb;
        return zzb(callable, zzfvmVar, obj, zzffxVar);
    }

    public static final zzffw zzb(Callable callable, zzfvm zzfvmVar, Object obj, zzffx zzffxVar) {
        zzfvl zzfvlVar;
        zzfvlVar = zzffx.zza;
        return new zzffw(zzffxVar, obj, zzfvlVar, Collections.emptyList(), zzfvmVar.zzb(callable));
    }

    public static final zzffw zzc(zzfvl zzfvlVar, Object obj, zzffx zzffxVar) {
        zzfvl zzfvlVar2;
        zzfvlVar2 = zzffx.zza;
        return new zzffw(zzffxVar, obj, zzfvlVar2, Collections.emptyList(), zzfvlVar);
    }

    public static final zzffw zzd(final zzffj zzffjVar, zzfvm zzfvmVar, Object obj, zzffx zzffxVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffj.this.zza();
                return null;
            }
        }, zzfvmVar, obj, zzffxVar);
    }
}
