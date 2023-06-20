package jb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Platform.java */
/* loaded from: classes3.dex */
final class j0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] b(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> Map<K, V> c(int i10) {
        return j.w(i10);
    }
}
