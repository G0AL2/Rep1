package s1;

/* compiled from: ExecutorException.java */
/* loaded from: classes.dex */
public class e extends RuntimeException {
    public e(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }
}
