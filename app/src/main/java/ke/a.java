package ke;

import java.lang.reflect.Method;
import qe.k;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes3.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformImplementations.kt */
    /* renamed from: ke.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0431a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f33462a;

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[LOOP:0: B:3:0x0013->B:12:0x003c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[EDGE_INSN: B:22:0x0040->B:14:0x0040 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                ke.a$a r0 = new ke.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                qe.k.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L13:
                if (r4 >= r2) goto L3f
                r5 = r1[r4]
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = qe.k.a(r6, r7)
                if (r6 == 0) goto L38
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                qe.k.e(r6, r7)
                java.lang.Object r6 = fe.h.x(r6)
                boolean r6 = qe.k.a(r6, r0)
                if (r6 == 0) goto L38
                r6 = 1
                goto L39
            L38:
                r6 = 0
            L39:
                if (r6 == 0) goto L3c
                goto L40
            L3c:
                int r4 = r4 + 1
                goto L13
            L3f:
                r5 = 0
            L40:
                ke.a.C0431a.f33462a = r5
                int r0 = r1.length
            L43:
                if (r3 >= r0) goto L57
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = qe.k.a(r2, r4)
                if (r2 == 0) goto L54
                goto L57
            L54:
                int r3 = r3 + 1
                goto L43
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ke.a.C0431a.<clinit>():void");
        }

        private C0431a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        k.f(th, "cause");
        k.f(th2, "exception");
        Method method = C0431a.f33462a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
