package le;

import qe.k;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes3.dex */
public class a extends ke.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: le.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0445a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f34047a;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        static {
            /*
                le.a$a r0 = new le.a$a
                r0.<init>()
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1d
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1d
                if (r2 == 0) goto L1d
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1d
                goto L1e
            L1d:
                r1 = r0
            L1e:
                if (r1 == 0) goto L2c
                int r2 = r1.intValue()
                if (r2 <= 0) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
                r0 = r1
            L2c:
                le.a.C0445a.f34047a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: le.a.C0445a.<clinit>():void");
        }

        private C0445a() {
        }
    }

    private final boolean b(int i10) {
        Integer num = C0445a.f34047a;
        return num == null || num.intValue() >= i10;
    }

    @Override // ke.a
    public void a(Throwable th, Throwable th2) {
        k.f(th, "cause");
        k.f(th2, "exception");
        if (b(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
