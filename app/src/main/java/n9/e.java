package n9;

import android.util.SparseArray;
import ea.j0;

/* compiled from: TimestampAdjusterProvider.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<j0> f34726a = new SparseArray<>();

    public j0 a(int i10) {
        j0 j0Var = this.f34726a.get(i10);
        if (j0Var == null) {
            j0 j0Var2 = new j0(9223372036854775806L);
            this.f34726a.put(i10, j0Var2);
            return j0Var2;
        }
        return j0Var;
    }

    public void b() {
        this.f34726a.clear();
    }
}
