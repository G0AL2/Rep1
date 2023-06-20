package q4;

import android.os.Looper;

/* compiled from: DeferredReleaser.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f35875a;

    /* compiled from: DeferredReleaser.java */
    /* renamed from: q4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0479a {
        void release();
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (f35875a == null) {
                f35875a = new b();
            }
            aVar = f35875a;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0479a interfaceC0479a);

    public abstract void d(InterfaceC0479a interfaceC0479a);
}
