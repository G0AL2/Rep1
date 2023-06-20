package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.fq;
import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzya  reason: invalid package */
/* loaded from: classes2.dex */
final class zzya implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzyi zzyiVar = (zzyi) obj;
        zzyi zzyiVar2 = (zzyi) obj2;
        zzxz zzxzVar = new zzxz(zzyiVar);
        zzxz zzxzVar2 = new zzxz(zzyiVar2);
        while (zzxzVar.hasNext() && zzxzVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzxzVar.zza() & fq.i.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(zzxzVar2.zza() & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzyiVar.zzd()).compareTo(Integer.valueOf(zzyiVar2.zzd()));
    }
}
