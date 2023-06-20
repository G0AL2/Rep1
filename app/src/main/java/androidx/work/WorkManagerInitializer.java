package androidx.work;

import android.content.Context;
import androidx.work.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements c1.a<v> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4384a = l.i("WrkMgrInitializer");

    @Override // c1.a
    public List<Class<? extends c1.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // c1.a
    /* renamed from: c */
    public v b(Context context) {
        l.e().a(f4384a, "Initializing WorkManager with default configuration.");
        v.i(context, new b.C0081b().a());
        return v.g(context);
    }
}
