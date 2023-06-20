package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaal {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzaak zzaakVar = (zzaak) obj;
        zzaaj zzaajVar = (zzaaj) obj2;
        if (zzaakVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzaakVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzaak) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzaak zzaakVar = (zzaak) obj;
        zzaak zzaakVar2 = (zzaak) obj2;
        if (!zzaakVar2.isEmpty()) {
            if (!zzaakVar.zze()) {
                zzaakVar = zzaakVar.zzb();
            }
            zzaakVar.zzd(zzaakVar2);
        }
        return zzaakVar;
    }
}
