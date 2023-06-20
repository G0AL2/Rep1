package b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f4763a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f4764b;

    public void a(b bVar) {
        if (this.f4764b != null) {
            bVar.a(this.f4764b);
        }
        this.f4763a.add(bVar);
    }

    public void b() {
        this.f4764b = null;
    }

    public void c(Context context) {
        this.f4764b = context;
        for (b bVar : this.f4763a) {
            bVar.a(context);
        }
    }

    public Context d() {
        return this.f4764b;
    }

    public void e(b bVar) {
        this.f4763a.remove(bVar);
    }
}
