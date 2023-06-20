package ec;

import ac.a0;
import android.content.Context;
import bc.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;
import u7.e;
import u7.f;
import u7.h;
import w7.t;
import yb.o;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: b */
    private static final g f29795b = new g();

    /* renamed from: c */
    private static final String f29796c = f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    private static final String f29797d = f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    private static final e<a0, byte[]> f29798e = new e() { // from class: ec.a
        @Override // u7.e
        public final Object apply(Object obj) {
            return c.a((a0) obj);
        }
    };

    /* renamed from: a */
    private final f<a0> f29799a;

    c(f<a0> fVar, e<a0, byte[]> eVar) {
        this.f29799a = fVar;
    }

    public static /* synthetic */ byte[] a(a0 a0Var) {
        return e(a0Var);
    }

    public static /* synthetic */ void b(TaskCompletionSource taskCompletionSource, o oVar, Exception exc) {
        d(taskCompletionSource, oVar, exc);
    }

    public static c c(Context context) {
        t.f(context);
        u7.g g10 = t.c().g(new com.google.android.datatransport.cct.a(f29796c, f29797d));
        u7.b b10 = u7.b.b("json");
        e<a0, byte[]> eVar = f29798e;
        return new c(g10.a("FIREBASE_CRASHLYTICS_REPORT", a0.class, b10, eVar), eVar);
    }

    public static /* synthetic */ void d(TaskCompletionSource taskCompletionSource, o oVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
        } else {
            taskCompletionSource.trySetResult(oVar);
        }
    }

    public static /* synthetic */ byte[] e(a0 a0Var) {
        return f29795b.E(a0Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task<o> g(final o oVar) {
        a0 b10 = oVar.b();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29799a.b(u7.c.e(b10), new h() { // from class: ec.b
            @Override // u7.h
            public final void a(Exception exc) {
                c.b(TaskCompletionSource.this, oVar, exc);
            }
        });
        return taskCompletionSource.getTask();
    }
}
