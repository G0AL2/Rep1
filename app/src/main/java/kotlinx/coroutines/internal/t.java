package kotlinx.coroutines.internal;

import ee.n;
import java.util.ArrayDeque;
import we.i0;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f33531a;

    static {
        Object a10;
        Object a11;
        try {
            n.a aVar = ee.n.f29807a;
            Class<?> cls = Class.forName("kotlin.coroutines.jvm.internal.a");
            qe.k.b(cls, "Class.forName(baseContinuationImplClass)");
            a10 = ee.n.a(cls.getCanonicalName());
        } catch (Throwable th) {
            n.a aVar2 = ee.n.f29807a;
            a10 = ee.n.a(ee.o.a(th));
        }
        if (ee.n.b(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f33531a = (String) a10;
        try {
            n.a aVar3 = ee.n.f29807a;
            qe.k.b(t.class, "Class.forName(stackTraceRecoveryClass)");
            a11 = ee.n.a(t.class.getCanonicalName());
        } catch (Throwable th2) {
            n.a aVar4 = ee.n.f29807a;
            a11 = ee.n.a(ee.o.a(th2));
        }
        if (ee.n.b(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) a11;
    }

    public static final StackTraceElement a(String str) {
        qe.k.g(str, "message");
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> ee.m<E, StackTraceElement[]> b(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause != null && qe.k.a(cause.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            qe.k.b(stackTrace, "currentTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                qe.k.b(stackTraceElement, "it");
                if (g(stackTraceElement)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return ee.q.a(cause, stackTrace);
            }
            return ee.q.a(e10, new StackTraceElement[0]);
        }
        return ee.q.a(e10, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E c(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e10.getStackTrace();
        qe.k.b(stackTrace, "causeTrace");
        String str = f33531a;
        qe.k.b(str, "baseContinuationImplClassName");
        int f10 = f(stackTrace, str);
        int i10 = 0;
        if (f10 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e11.setStackTrace((StackTraceElement[]) array);
                return e11;
            }
            throw new ee.r("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + f10];
        for (int i11 = 0; i11 < f10; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[f10 + i10] = stackTraceElement;
            i10++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> d(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && qe.k.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && qe.k.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && qe.k.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (qe.k.a(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final boolean g(StackTraceElement stackTraceElement) {
        boolean y10;
        qe.k.g(stackTraceElement, "$this$isArtificial");
        String className = stackTraceElement.getClassName();
        qe.k.b(className, "className");
        y10 = ve.p.y(className, "\b\b\b", false, 2, null);
        return y10;
    }

    private static final void h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (g(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 < i11) {
            return;
        }
        while (true) {
            StackTraceElement stackTraceElement = stackTraceElementArr[length2];
            StackTraceElement last = arrayDeque.getLast();
            qe.k.b(last, "result.last");
            if (e(stackTraceElement, last)) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            }
            length2--;
        }
    }

    private static final <E extends Throwable> E i(E e10, kotlin.coroutines.jvm.internal.e eVar) {
        ee.m b10 = b(e10);
        Throwable th = (Throwable) b10.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b10.b();
        Throwable e11 = f.e(th);
        if (e11 != null) {
            ArrayDeque<StackTraceElement> d10 = d(eVar);
            if (d10.isEmpty()) {
                return e10;
            }
            if (th != e10) {
                h(stackTraceElementArr, d10);
            }
            return (E) c(th, e11, d10);
        }
        return e10;
    }

    public static final <E extends Throwable> E j(E e10, ie.d<?> dVar) {
        qe.k.g(e10, "exception");
        qe.k.g(dVar, "continuation");
        return (i0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) ? (E) i(e10, (kotlin.coroutines.jvm.internal.e) dVar) : e10;
    }

    public static final <E extends Throwable> E k(E e10) {
        E e11;
        qe.k.g(e10, "exception");
        if (i0.d() && (e11 = (E) e10.getCause()) != null) {
            boolean z10 = true;
            if (!(!qe.k.a(e11.getClass(), e10.getClass()))) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                qe.k.b(stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    qe.k.b(stackTraceElement, "it");
                    if (g(stackTraceElement)) {
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    return e11;
                }
            }
        }
        return e10;
    }
}
