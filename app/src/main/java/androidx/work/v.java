package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.e0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class v {
    public static v g(Context context) {
        return e0.n(context);
    }

    public static void i(Context context, b bVar) {
        e0.i(context, bVar);
    }

    public abstract o a(String str);

    public abstract o b(UUID uuid);

    public final o c(x xVar) {
        return d(Collections.singletonList(xVar));
    }

    public abstract o d(List<? extends x> list);

    public o e(String str, f fVar, n nVar) {
        return f(str, fVar, Collections.singletonList(nVar));
    }

    public abstract o f(String str, f fVar, List<n> list);

    public abstract LiveData<List<u>> h(w wVar);
}
