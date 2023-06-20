package cd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f5476b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f5477a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f5476b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f5476b;
                if (dVar == null) {
                    dVar = new d();
                    f5476b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f5477a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f5477a);
        }
        return unmodifiableSet;
    }
}
