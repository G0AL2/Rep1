package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import qe.k;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int c() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: d */
    public a b(List<? extends MainDispatcherFactory> list) {
        k.g(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        k.b(mainLooper, "Looper.getMainLooper()");
        return new a(c.a(mainLooper, true), "Main");
    }
}
