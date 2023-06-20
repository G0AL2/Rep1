package we;

import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
/* loaded from: classes3.dex */
public final class j1 extends CancellationException implements x<j1> {

    /* renamed from: a  reason: collision with root package name */
    public final i1 f38617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String str, Throwable th, i1 i1Var) {
        super(str);
        qe.k.g(str, "message");
        qe.k.g(i1Var, "job");
        this.f38617a = i1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // we.x
    /* renamed from: b */
    public j1 a() {
        if (i0.c()) {
            String message = getMessage();
            if (message == null) {
                qe.k.o();
            }
            return new j1(message, this, this.f38617a);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j1) {
                j1 j1Var = (j1) obj;
                if (!qe.k.a(j1Var.getMessage(), getMessage()) || !qe.k.a(j1Var.f38617a, this.f38617a) || !qe.k.a(j1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (i0.c()) {
            Throwable fillInStackTrace = super.fillInStackTrace();
            qe.k.b(fillInStackTrace, "super.fillInStackTrace()");
            return fillInStackTrace;
        }
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        if (message == null) {
            qe.k.o();
        }
        int hashCode = ((message.hashCode() * 31) + this.f38617a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f38617a;
    }
}
