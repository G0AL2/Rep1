package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.zzb;
        str = this.zza.zza;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i10 = this.zzb;
        str = this.zza.zza;
        if (i10 < str.length()) {
            this.zzb = i10 + 1;
            return new zzat(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
