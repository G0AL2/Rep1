package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfec {
    private final HashMap zza = new HashMap();

    public final zzfeb zza(zzfds zzfdsVar, Context context, zzfdk zzfdkVar, zzfei zzfeiVar) {
        zzfeb zzfebVar = (zzfeb) this.zza.get(zzfdsVar);
        if (zzfebVar == null) {
            zzfdp zzfdpVar = new zzfdp(zzfdv.zza(zzfdsVar, context));
            zzfeb zzfebVar2 = new zzfeb(zzfdpVar, new zzfek(zzfdpVar, zzfdkVar, zzfeiVar));
            this.zza.put(zzfdsVar, zzfebVar2);
            return zzfebVar2;
        }
        return zzfebVar;
    }
}
