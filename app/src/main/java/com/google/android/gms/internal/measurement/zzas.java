package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzas implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzas(zzat zzatVar) {
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
        String str2;
        int i10 = this.zzb;
        zzat zzatVar = this.zza;
        str = zzatVar.zza;
        if (i10 < str.length()) {
            str2 = zzatVar.zza;
            this.zzb = i10 + 1;
            return new zzat(String.valueOf(str2.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
