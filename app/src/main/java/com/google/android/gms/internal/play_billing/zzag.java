package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
public final class zzag {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
