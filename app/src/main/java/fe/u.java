package fe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
/* loaded from: classes3.dex */
public class u extends t {
    public static <T> boolean s(Collection<? super T> collection, Iterable<? extends T> iterable) {
        qe.k.f(collection, "<this>");
        qe.k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean t(Collection<? super T> collection, T[] tArr) {
        qe.k.f(collection, "<this>");
        qe.k.f(tArr, "elements");
        return collection.addAll(h.b(tArr));
    }

    public static <T> T u(List<T> list) {
        qe.k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
