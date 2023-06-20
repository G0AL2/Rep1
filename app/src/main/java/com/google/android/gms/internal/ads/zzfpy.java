package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfpy extends zzfpr implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfqe zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpy(zzfqe zzfqeVar, SortedMap sortedMap) {
        super(zzfqeVar, sortedMap);
        this.zze = zzfqeVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfpy(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfpy(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfpy(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) ((zzfpr) this).zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfsd
    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfpz(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfpr, com.google.android.gms.internal.ads.zzfsd, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zze = zze();
            this.zzd = zze;
            return zze;
        }
        return sortedSet;
    }
}
