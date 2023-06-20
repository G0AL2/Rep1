package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzb extends LinkedHashMap {
    final /* synthetic */ zzc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        synchronized (this.zza) {
            int size = size();
            zzc zzcVar = this.zza;
            i10 = zzcVar.zza;
            if (size <= i10) {
                return false;
            }
            arrayDeque = zzcVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i11 = this.zza.zza;
            return size2 > i11;
        }
    }
}
