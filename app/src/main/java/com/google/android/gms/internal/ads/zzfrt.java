package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Iterator it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }
}
