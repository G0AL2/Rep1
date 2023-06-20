package fe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
/* loaded from: classes3.dex */
public class o {
    public static <E> List<E> a(List<E> list) {
        qe.k.f(list, "builder");
        return ((ge.b) list).l();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        qe.k.f(tArr, "<this>");
        if (z10 && qe.k.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        qe.k.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new ge.b();
    }

    public static <T> List<T> d(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        qe.k.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
