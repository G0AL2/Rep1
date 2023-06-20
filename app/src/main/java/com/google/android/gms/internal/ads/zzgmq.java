package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgmq implements Iterator {
    private final ArrayDeque zza;
    private zzgjd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmq(zzgji zzgjiVar, zzgmp zzgmpVar) {
        zzgji zzgjiVar2;
        if (zzgjiVar instanceof zzgms) {
            zzgms zzgmsVar = (zzgms) zzgjiVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgmsVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgmsVar);
            zzgjiVar2 = zzgmsVar.zzd;
            this.zzb = zzb(zzgjiVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgjd) zzgjiVar;
    }

    private final zzgjd zzb(zzgji zzgjiVar) {
        while (zzgjiVar instanceof zzgms) {
            zzgms zzgmsVar = (zzgms) zzgjiVar;
            this.zza.push(zzgmsVar);
            zzgjiVar = zzgmsVar.zzd;
        }
        return (zzgjd) zzgjiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgjd next() {
        zzgjd zzgjdVar;
        zzgji zzgjiVar;
        zzgjd zzgjdVar2 = this.zzb;
        if (zzgjdVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgjdVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgjiVar = ((zzgms) this.zza.pop()).zze;
                zzgjdVar = zzb(zzgjiVar);
            } while (zzgjdVar.zzD());
            this.zzb = zzgjdVar;
            return zzgjdVar2;
        }
        throw new NoSuchElementException();
    }
}
