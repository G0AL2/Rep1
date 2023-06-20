package yb;

import com.google.auto.value.AutoValue;
import java.io.File;

/* compiled from: CrashlyticsReportWithSessionId.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class o {
    public static o a(ac.a0 a0Var, String str, File file) {
        return new b(a0Var, str, file);
    }

    public abstract ac.a0 b();

    public abstract File c();

    public abstract String d();
}
