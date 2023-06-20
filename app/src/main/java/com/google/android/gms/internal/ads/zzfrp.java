package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrp {
    public static boolean zza(Iterable iterable, zzfov zzfovVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(zzfovVar);
            return zzc((List) iterable, zzfovVar);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(zzfovVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfovVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzb(List list, zzfov zzfovVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfovVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            list.remove(i11);
        }
    }

    private static boolean zzc(List list, zzfov zzfovVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfovVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfovVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfovVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
