package ic;

/* compiled from: TrimmedThrowableData.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f31926a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31927b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f31928c;

    /* renamed from: d  reason: collision with root package name */
    public final e f31929d;

    public e(Throwable th, d dVar) {
        this.f31926a = th.getLocalizedMessage();
        this.f31927b = th.getClass().getName();
        this.f31928c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f31929d = cause != null ? new e(cause, dVar) : null;
    }
}
