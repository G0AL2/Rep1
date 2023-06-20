package qe;

import java.util.Iterator;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final <T> Iterator<T> a(T[] tArr) {
        k.f(tArr, "array");
        return new a(tArr);
    }
}
