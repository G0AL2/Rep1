package we;

/* compiled from: Exceptions.kt */
/* loaded from: classes3.dex */
public final class w extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, Throwable th) {
        super(str, th);
        qe.k.g(str, "message");
        qe.k.g(th, "cause");
    }
}
