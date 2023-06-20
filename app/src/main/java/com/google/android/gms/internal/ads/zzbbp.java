package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbbp implements Comparator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbp(zzbbr zzbbrVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbv zzbbvVar = (zzbbv) obj;
        zzbbv zzbbvVar2 = (zzbbv) obj2;
        int i10 = zzbbvVar.zzc - zzbbvVar2.zzc;
        return i10 != 0 ? i10 : (int) (zzbbvVar.zza - zzbbvVar2.zza);
    }
}
