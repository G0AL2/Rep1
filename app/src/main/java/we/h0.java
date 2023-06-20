package we;

/* compiled from: Exceptions.common.kt */
/* loaded from: classes3.dex */
public final class h0 extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String str, Throwable th) {
        super(str, th);
        qe.k.g(str, "message");
        qe.k.g(th, "cause");
    }
}
