package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfqo extends AbstractSet {
    final /* synthetic */ zzfqt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqo(zzfqt zzfqtVar) {
        this.zza = zzfqtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzv;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzv = this.zza.zzv(entry.getKey());
            if (zzv != -1 && zzfoq.zza(zzfqt.zzj(this.zza, zzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfqt zzfqtVar = this.zza;
        Map zzl = zzfqtVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfqm(zzfqtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzu;
        int[] zzz;
        Object[] zzA;
        Object[] zzB;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfqt zzfqtVar = this.zza;
            if (zzfqtVar.zzq()) {
                return false;
            }
            zzu = zzfqtVar.zzu();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzk = zzfqt.zzk(this.zza);
            zzz = this.zza.zzz();
            zzA = this.zza.zzA();
            zzB = this.zza.zzB();
            int zzb = zzfqu.zzb(key, value, zzu, zzk, zzz, zzA, zzB);
            if (zzb == -1) {
                return false;
            }
            this.zza.zzp(zzb, zzu);
            zzfqt.zzb(this.zza);
            this.zza.zzn();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
