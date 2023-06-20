package cb;

import java.io.PrintStream;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    static final w f5429a;

    static {
        w a0Var;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e10) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e10.printStackTrace(System.err);
            }
            a0Var = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new z() : new a0() : new b0();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = a0.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th.printStackTrace(System.err);
            a0Var = new a0();
        }
        f5429a = a0Var;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    public static void a(Throwable th, Throwable th2) {
        f5429a.a(th, th2);
    }
}
