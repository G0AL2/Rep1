package e0;

/* compiled from: OperationCanceledException.java */
/* loaded from: classes.dex */
public class i extends RuntimeException {
    public i() {
        this(null);
    }

    public i(String str) {
        super(h0.c.d(str, "The operation has been canceled."));
    }
}
