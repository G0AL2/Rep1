package tb;

import java.util.Arrays;
import java.util.List;

/* compiled from: DependencyCycleException.java */
/* loaded from: classes3.dex */
public class r extends s {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<?>> f37301a;

    public r(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f37301a = list;
    }
}
