package i8;

import android.util.SparseArray;
import java.util.HashMap;
import u7.d;

/* compiled from: PriorityMapping.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f31547a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f31548b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f31548b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f31548b.put(d.VERY_LOW, 1);
        f31548b.put(d.HIGHEST, 2);
        for (d dVar : f31548b.keySet()) {
            f31547a.append(f31548b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f31548b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f31547a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
