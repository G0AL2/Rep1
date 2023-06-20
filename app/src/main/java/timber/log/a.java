package timber.log;

import android.os.Build;
import android.util.Log;
import ee.u;
import fe.p;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qe.g;
import qe.k;
import ve.q;

/* compiled from: Timber.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f37331a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private static final ArrayList<c> f37332b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private static volatile c[] f37333c = new c[0];

    /* compiled from: Timber.kt */
    /* renamed from: timber.log.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0509a extends c {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final List<String> fqcnIgnore;
        public static final C0510a Companion = new C0510a(null);
        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

        /* compiled from: Timber.kt */
        /* renamed from: timber.log.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0510a {
            private C0510a() {
            }

            public /* synthetic */ C0510a(g gVar) {
                this();
            }
        }

        public C0509a() {
            List<String> j10;
            j10 = p.j(a.class.getName(), b.class.getName(), c.class.getName(), C0509a.class.getName());
            this.fqcnIgnore = j10;
        }

        protected String createStackElementTag(StackTraceElement stackTraceElement) {
            String s02;
            k.f(stackTraceElement, "element");
            String className = stackTraceElement.getClassName();
            k.e(className, "element.className");
            s02 = q.s0(className, '.', null, 2, null);
            Matcher matcher = ANONYMOUS_CLASS.matcher(s02);
            if (matcher.find()) {
                s02 = matcher.replaceAll("");
                k.e(s02, "m.replaceAll(\"\")");
            }
            if (s02.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return s02;
            }
            String substring = s02.substring(0, 23);
            k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @Override // timber.log.a.c
        public String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release == null) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                k.e(stackTrace, "Throwable().stackTrace");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                        return createStackElementTag(stackTraceElement);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return tag$timber_release;
        }

        @Override // timber.log.a.c
        protected void log(int i10, String str, String str2, Throwable th) {
            int N;
            int min;
            k.f(str2, "message");
            if (str2.length() < 4000) {
                if (i10 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i10, str, str2);
                    return;
                }
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                N = q.N(str2, '\n', i11, false, 4, null);
                if (N == -1) {
                    N = length;
                }
                while (true) {
                    min = Math.min(N, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i10 == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i10, str, substring);
                    }
                    if (min >= N) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    /* compiled from: Timber.kt */
    /* loaded from: classes3.dex */
    public static abstract class c {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            k.e(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void prepareLog(int i10, Throwable th, String str, Object... objArr) {
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i10)) {
                if (!(str == null || str.length() == 0)) {
                    if (!(objArr.length == 0)) {
                        str = formatMessage(str, objArr);
                    }
                    if (th != null) {
                        str = ((Object) str) + '\n' + getStackTraceString(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = getStackTraceString(th);
                }
                log(i10, tag$timber_release, str, th);
            }
        }

        public void d(String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        protected String formatMessage(String str, Object[] objArr) {
            k.f(str, "message");
            k.f(objArr, "args");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            k.e(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        protected boolean isLoggable(int i10) {
            return true;
        }

        protected boolean isLoggable(String str, int i10) {
            return isLoggable(i10);
        }

        protected abstract void log(int i10, String str, String str2, Throwable th);

        public void log(int i10, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(i10, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void v(String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void w(String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void wtf(String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(7, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(3, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(6, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void i(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(4, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void log(int i10, Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(i10, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void v(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(2, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void w(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(5, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void wtf(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            prepareLog(7, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(Throwable th) {
            prepareLog(3, th, null, new Object[0]);
        }

        public void e(Throwable th) {
            prepareLog(6, th, null, new Object[0]);
        }

        public void i(Throwable th) {
            prepareLog(4, th, null, new Object[0]);
        }

        public void log(int i10, Throwable th) {
            prepareLog(i10, th, null, new Object[0]);
        }

        public void v(Throwable th) {
            prepareLog(2, th, null, new Object[0]);
        }

        public void w(Throwable th) {
            prepareLog(5, th, null, new Object[0]);
        }

        public void wtf(Throwable th) {
            prepareLog(7, th, null, new Object[0]);
        }
    }

    private a() {
        throw new AssertionError();
    }

    public static void d(String str, Object... objArr) {
        f37331a.d(str, objArr);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        f37331a.e(th, str, objArr);
    }

    public static void f(String str, Object... objArr) {
        f37331a.i(str, objArr);
    }

    public static final void g(c cVar) {
        f37331a.a(cVar);
    }

    /* compiled from: Timber.kt */
    /* loaded from: classes3.dex */
    public static final class b extends c {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a(c cVar) {
            k.f(cVar, "tree");
            if (cVar != this) {
                synchronized (a.f37332b) {
                    a.f37332b.add(cVar);
                    b bVar = a.f37331a;
                    Object[] array = a.f37332b.toArray(new c[0]);
                    if (array != null) {
                        a.f37333c = (c[]) array;
                        u uVar = u.f29813a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        @Override // timber.log.a.c
        public void d(String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void e(String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.e(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void i(String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.i(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void log(int i10, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.log(i10, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void v(String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.v(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void w(String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.w(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void wtf(String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.wtf(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void d(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.d(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void e(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.e(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void i(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.i(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void log(int i10, Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.log(i10, th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void v(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.v(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void w(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.w(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void wtf(Throwable th, String str, Object... objArr) {
            k.f(objArr, "args");
            for (c cVar : a.f37333c) {
                cVar.wtf(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        public void d(Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.d(th);
            }
        }

        @Override // timber.log.a.c
        public void e(Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.e(th);
            }
        }

        @Override // timber.log.a.c
        public void i(Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.i(th);
            }
        }

        @Override // timber.log.a.c
        public void log(int i10, Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.log(i10, th);
            }
        }

        @Override // timber.log.a.c
        public void v(Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.v(th);
            }
        }

        @Override // timber.log.a.c
        public void w(Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.w(th);
            }
        }

        @Override // timber.log.a.c
        public void wtf(Throwable th) {
            for (c cVar : a.f37333c) {
                cVar.wtf(th);
            }
        }

        @Override // timber.log.a.c
        protected void log(int i10, String str, String str2, Throwable th) {
            k.f(str2, "message");
            throw new AssertionError();
        }
    }
}
