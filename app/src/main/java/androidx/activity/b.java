package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f706a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f707b = new CopyOnWriteArrayList<>();

    public b(boolean z10) {
        this.f706a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f707b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f706a;
    }

    public final void d() {
        Iterator<a> it = this.f707b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f707b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f706a = z10;
    }
}
