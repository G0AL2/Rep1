package com.google.android.gms.internal.common;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzad<E> extends zzaa<E> {
    public zzad() {
        super(4);
    }

    public final zzad<E> zzb(E e10) {
        super.zza(e10);
        return this;
    }

    public final zzad<E> zzc(Iterator<? extends E> it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(int i10) {
        super(4);
    }
}
