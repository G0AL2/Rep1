package b4;

/* compiled from: NoOpMemoryTrimmableRegistry.java */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static d f4808a;

    public static synchronized d b() {
        d dVar;
        synchronized (d.class) {
            if (f4808a == null) {
                f4808a = new d();
            }
            dVar = f4808a;
        }
        return dVar;
    }

    @Override // b4.c
    public void a(b bVar) {
    }
}
