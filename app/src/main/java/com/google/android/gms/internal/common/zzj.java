package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
abstract class zzj<T> implements Iterator<T> {
    private T zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb;
        if (i10 != 4) {
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
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.zzb = 2;
            T t10 = this.zza;
            this.zza = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract T zza();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T zzb() {
        this.zzb = 3;
        return null;
    }
}
