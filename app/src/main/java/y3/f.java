package y3;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ImmutableList.java */
/* loaded from: classes.dex */
public class f<E> extends ArrayList<E> {
    private f(int i10) {
        super(i10);
    }

    public static <E> f<E> a(E... eArr) {
        f<E> fVar = new f<>(eArr.length);
        Collections.addAll(fVar, eArr);
        return fVar;
    }
}
