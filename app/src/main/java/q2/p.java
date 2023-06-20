package q2;

import q2.b;

/* compiled from: Response.java */
/* loaded from: classes.dex */
public class p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f35848a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f35849b;

    /* renamed from: c  reason: collision with root package name */
    public final u f35850c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35851d;

    /* compiled from: Response.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(u uVar);
    }

    /* compiled from: Response.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t10);
    }

    private p(T t10, b.a aVar) {
        this.f35851d = false;
        this.f35848a = t10;
        this.f35849b = aVar;
        this.f35850c = null;
    }

    public static <T> p<T> a(u uVar) {
        return new p<>(uVar);
    }

    public static <T> p<T> c(T t10, b.a aVar) {
        return new p<>(t10, aVar);
    }

    public boolean b() {
        return this.f35850c == null;
    }

    private p(u uVar) {
        this.f35851d = false;
        this.f35848a = null;
        this.f35849b = null;
        this.f35850c = uVar;
    }
}
