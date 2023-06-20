package fe;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* loaded from: classes3.dex */
public class m0 extends l0 {
    public static <T> Set<T> d() {
        return b0.f30324a;
    }

    public static <T> Set<T> e(T... tArr) {
        qe.k.f(tArr, "elements");
        return (Set) l.A(tArr, new LinkedHashSet(e0.d(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> f(Set<? extends T> set) {
        qe.k.f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : k0.c(set.iterator().next());
        }
        return k0.d();
    }
}
