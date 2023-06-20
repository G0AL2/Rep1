package y3;

import java.util.Arrays;

/* compiled from: Objects.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Objects.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f39260a;

        /* renamed from: b  reason: collision with root package name */
        private final a f39261b;

        /* renamed from: c  reason: collision with root package name */
        private a f39262c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f39263d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Objects.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            String f39264a;

            /* renamed from: b  reason: collision with root package name */
            Object f39265b;

            /* renamed from: c  reason: collision with root package name */
            a f39266c;

            private a() {
            }
        }

        private a d() {
            a aVar = new a();
            this.f39262c.f39266c = aVar;
            this.f39262c = aVar;
            return aVar;
        }

        private b e(String str, Object obj) {
            a d10 = d();
            d10.f39265b = obj;
            d10.f39264a = (String) k.g(str);
            return this;
        }

        public b a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public String toString() {
            boolean z10 = this.f39263d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f39260a);
            sb2.append('{');
            String str = "";
            for (a aVar = this.f39261b.f39266c; aVar != null; aVar = aVar.f39266c) {
                Object obj = aVar.f39265b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f39264a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f39261b = aVar;
            this.f39262c = aVar;
            this.f39263d = false;
            this.f39260a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
