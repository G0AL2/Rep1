package v3;

/* compiled from: NoOpDiskTrimmableRegistry.java */
/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static c f37771a;

    private c() {
    }

    public static synchronized c b() {
        c cVar;
        synchronized (c.class) {
            if (f37771a == null) {
                f37771a = new c();
            }
            cVar = f37771a;
        }
        return cVar;
    }

    @Override // v3.b
    public void a(a aVar) {
    }
}
