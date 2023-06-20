package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: InvalidationLiveDataContainer.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f3954a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<LiveData<?>> f3955b;

    public m(k0 k0Var) {
        qe.k.f(k0Var, "database");
        this.f3954a = k0Var;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        qe.k.e(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f3955b = newSetFromMap;
    }

    public final <T> LiveData<T> a(String[] strArr, boolean z10, Callable<T> callable) {
        qe.k.f(strArr, "tableNames");
        qe.k.f(callable, "computeFunction");
        return new q0(this.f3954a, this, z10, callable, strArr);
    }

    public final void b(LiveData<?> liveData) {
        qe.k.f(liveData, "liveData");
        this.f3955b.add(liveData);
    }

    public final void c(LiveData<?> liveData) {
        qe.k.f(liveData, "liveData");
        this.f3955b.remove(liveData);
    }
}
