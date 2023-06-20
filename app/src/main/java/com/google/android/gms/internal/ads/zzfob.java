package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzfob implements Iterator {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzfou.zzh(this.zzb != 4);
        int i10 = this.zzb;
        int i11 = i10 - 1;
        if (i10 != 0) {
            if (i11 != 0) {
                if (i11 != 2) {
                    this.zzb = 4;
                    this.zza = zza();
                    if (this.zzb != 3) {
                        this.zzb = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zza();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
