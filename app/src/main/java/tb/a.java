package tb;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractComponentContainer.java */
/* loaded from: classes3.dex */
public abstract class a implements e {
    @Override // tb.e
    public <T> T a(Class<T> cls) {
        sc.b<T> d10 = d(cls);
        if (d10 == null) {
            return null;
        }
        return d10.get();
    }

    @Override // tb.e
    public <T> Set<T> c(Class<T> cls) {
        return b(cls).get();
    }
}
