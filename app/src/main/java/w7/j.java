package w7;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule.java */
/* loaded from: classes2.dex */
abstract class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
