package com.google.android.gms.common.data;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class FreezableUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(arrayList.get(i10).freeze());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        for (E e10 : iterable) {
            arrayList.add(e10.freeze());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            arrayList.add(e10.freeze());
        }
        return arrayList;
    }
}
