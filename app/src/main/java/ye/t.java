package ye;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: Headers.kt */
/* loaded from: classes3.dex */
public final class t implements Iterable<ee.m<? extends String, ? extends String>>, re.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f39752b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final String[] f39753a;

    /* compiled from: Headers.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f39754a = new ArrayList(20);

        public final a a(String str, String str2) {
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            b bVar = t.f39752b;
            bVar.d(str);
            bVar.e(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            int N;
            qe.k.f(str, "line");
            N = ve.q.N(str, ':', 1, false, 4, null);
            if (N != -1) {
                String substring = str.substring(0, N);
                qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(N + 1);
                qe.k.e(substring2, "(this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                qe.k.e(substring3, "(this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", str);
            }
            return this;
        }

        public final a c(String str, String str2) {
            CharSequence x02;
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f39754a.add(str);
            List<String> list = this.f39754a;
            x02 = ve.q.x0(str2);
            list.add(x02.toString());
            return this;
        }

        public final t d() {
            Object[] array = this.f39754a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new t((String[]) array, null);
        }

        /* JADX WARN: Incorrect condition in loop: B:8:0x0036 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String e(java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = "name"
                qe.k.f(r6, r0)
                java.util.List<java.lang.String> r0 = r5.f39754a
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                se.a r0 = se.d.g(r0, r2)
                se.a r0 = se.d.h(r0, r1)
                int r1 = r0.e()
                int r2 = r0.f()
                int r0 = r0.g()
                if (r0 < 0) goto L27
                if (r1 > r2) goto L46
                goto L29
            L27:
                if (r1 < r2) goto L46
            L29:
                java.util.List<java.lang.String> r3 = r5.f39754a
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                boolean r3 = ve.g.l(r6, r3, r4)
                if (r3 == 0) goto L42
                java.util.List<java.lang.String> r6 = r5.f39754a
                int r1 = r1 + r4
                java.lang.Object r6 = r6.get(r1)
                java.lang.String r6 = (java.lang.String) r6
                return r6
            L42:
                if (r1 == r2) goto L46
                int r1 = r1 + r0
                goto L29
            L46:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.t.a.e(java.lang.String):java.lang.String");
        }

        public final List<String> f() {
            return this.f39754a;
        }

        public final a g(String str) {
            boolean l10;
            qe.k.f(str, "name");
            int i10 = 0;
            while (i10 < this.f39754a.size()) {
                l10 = ve.p.l(str, this.f39754a.get(i10), true);
                if (l10) {
                    this.f39754a.remove(i10);
                    this.f39754a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a h(String str, String str2) {
            qe.k.f(str, "name");
            qe.k.f(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            b bVar = t.f39752b;
            bVar.d(str);
            bVar.e(str2, str);
            g(str);
            c(str, str2);
            return this;
        }
    }

    /* compiled from: Headers.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(ze.c.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ze.c.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                    sb2.append(ze.c.E(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Incorrect condition in loop: B:8:0x0026 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String f(java.lang.String[] r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r6.length
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                se.a r0 = se.d.g(r0, r2)
                se.a r0 = se.d.h(r0, r1)
                int r1 = r0.e()
                int r2 = r0.f()
                int r0 = r0.g()
                if (r0 < 0) goto L1d
                if (r1 > r2) goto L30
                goto L1f
            L1d:
                if (r1 < r2) goto L30
            L1f:
                r3 = r6[r1]
                r4 = 1
                boolean r3 = ve.g.l(r7, r3, r4)
                if (r3 == 0) goto L2c
                int r1 = r1 + r4
                r6 = r6[r1]
                return r6
            L2c:
                if (r1 == r2) goto L30
                int r1 = r1 + r0
                goto L1f
            L30:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.t.b.f(java.lang.String[], java.lang.String):java.lang.String");
        }

        public final t g(Map<String, String> map) {
            CharSequence x02;
            CharSequence x03;
            qe.k.f(map, "$this$toHeaders");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
                x02 = ve.q.x0(key);
                String obj = x02.toString();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
                x03 = ve.q.x0(value);
                String obj2 = x03.toString();
                d(obj);
                e(obj2, obj);
                strArr[i10] = obj;
                strArr[i10 + 1] = obj2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t h(String... strArr) {
            se.c q10;
            se.a h10;
            CharSequence x02;
            qe.k.f(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if (strArr2[i10] != null) {
                        String str = strArr2[i10];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        x02 = ve.q.x0(str);
                        strArr2[i10] = x02.toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                q10 = fe.l.q(strArr2);
                h10 = se.f.h(q10, 2);
                int e10 = h10.e();
                int f10 = h10.f();
                int g10 = h10.g();
                if (g10 < 0 ? e10 >= f10 : e10 <= f10) {
                    while (true) {
                        String str2 = strArr2[e10];
                        String str3 = strArr2[e10 + 1];
                        d(str2);
                        e(str3, str2);
                        if (e10 == f10) {
                            break;
                        }
                        e10 += g10;
                    }
                }
                return new t(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    private t(String[] strArr) {
        this.f39753a = strArr;
    }

    public static final t f(Map<String, String> map) {
        return f39752b.g(map);
    }

    public final String a(String str) {
        qe.k.f(str, "name");
        return f39752b.f(this.f39753a, str);
    }

    public final String c(int i10) {
        return this.f39753a[i10 * 2];
    }

    public final a e() {
        a aVar = new a();
        fe.u.t(aVar.f(), this.f39753a);
        return aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f39753a, ((t) obj).f39753a);
    }

    public final Map<String, List<String>> g() {
        Comparator<String> m10;
        m10 = ve.p.m(qe.v.f36113a);
        TreeMap treeMap = new TreeMap(m10);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String c10 = c(i10);
            Locale locale = Locale.US;
            qe.k.e(locale, "Locale.US");
            Objects.requireNonNull(c10, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = c10.toLowerCase(locale);
            qe.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(h(i10));
        }
        return treeMap;
    }

    public final String h(int i10) {
        return this.f39753a[(i10 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f39753a);
    }

    public final List<String> i(String str) {
        List<String> h10;
        boolean l10;
        qe.k.f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            l10 = ve.p.l(str, c(i10), true);
            if (l10) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i10));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            qe.k.e(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        h10 = fe.p.h();
        return h10;
    }

    @Override // java.lang.Iterable
    public Iterator<ee.m<? extends String, ? extends String>> iterator() {
        int size = size();
        ee.m[] mVarArr = new ee.m[size];
        for (int i10 = 0; i10 < size; i10++) {
            mVarArr[i10] = ee.q.a(c(i10), h(i10));
        }
        return qe.b.a(mVarArr);
    }

    public final int size() {
        return this.f39753a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String c10 = c(i10);
            String h10 = h(i10);
            sb2.append(c10);
            sb2.append(": ");
            if (ze.c.E(c10)) {
                h10 = "██";
            }
            sb2.append(h10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ t(String[] strArr, qe.g gVar) {
        this(strArr);
    }
}
