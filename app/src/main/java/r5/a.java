package r5;

import c4.a;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: CloseableReferenceFactory.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final a.c f36231a;

    /* compiled from: CloseableReferenceFactory.java */
    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0488a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t5.a f36232a;

        C0488a(a aVar, t5.a aVar2) {
            this.f36232a = aVar2;
        }

        @Override // c4.a.c
        public void a(c4.i<Object> iVar, Throwable th) {
            this.f36232a.b(iVar, th);
            Object f10 = iVar.f();
            z3.a.I("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), f10 != null ? f10.getClass().getName() : "<value is null>", a.d(th));
        }

        @Override // c4.a.c
        public boolean b() {
            return this.f36232a.a();
        }
    }

    public a(t5.a aVar) {
        this.f36231a = new C0488a(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public <U extends Closeable> c4.a<U> b(U u10) {
        return c4.a.O(u10, this.f36231a);
    }

    public <T> c4.a<T> c(T t10, c4.h<T> hVar) {
        return c4.a.U(t10, hVar, this.f36231a);
    }
}
