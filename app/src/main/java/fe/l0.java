package fe;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetsJVM.kt */
/* loaded from: classes3.dex */
public class l0 {
    public static <E> Set<E> a(Set<E> set) {
        qe.k.f(set, "builder");
        return ((ge.h) set).f();
    }

    public static <E> Set<E> b() {
        return new ge.h();
    }

    public static <T> Set<T> c(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        qe.k.e(singleton, "singleton(element)");
        return singleton;
    }
}
