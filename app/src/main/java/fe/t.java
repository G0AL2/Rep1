package fe;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes3.dex */
public class t extends s {
    public static <T extends Comparable<? super T>> void q(List<T> list) {
        qe.k.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void r(List<T> list, Comparator<? super T> comparator) {
        qe.k.f(list, "<this>");
        qe.k.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
