package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;

/* compiled from: SavedStateRegistryController.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f4075a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f4076b = new SavedStateRegistry();

    private b(c cVar) {
        this.f4075a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.f4076b;
    }

    public void c(Bundle bundle) {
        i lifecycle = this.f4075a.getLifecycle();
        if (lifecycle.b() == i.c.INITIALIZED) {
            lifecycle.a(new Recreator(this.f4075a));
            this.f4076b.b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.f4076b.c(bundle);
    }
}
