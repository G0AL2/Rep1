package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements c1.a<p> {
    @Override // c1.a
    public List<Class<? extends c1.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // c1.a
    /* renamed from: c */
    public p b(Context context) {
        l.a(context);
        z.i(context);
        return z.h();
    }
}
