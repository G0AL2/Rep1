package y0;

import android.annotation.SuppressLint;
import androidx.room.l;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import qe.g;
import qe.k;
import ve.p;
import ve.q;

/* compiled from: TableInfo.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final b f38957e = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f38958a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f38959b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<c> f38960c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<C0540e> f38961d;

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0539a f38962h = new C0539a(null);

        /* renamed from: a  reason: collision with root package name */
        public final String f38963a;

        /* renamed from: b  reason: collision with root package name */
        public final String f38964b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f38965c;

        /* renamed from: d  reason: collision with root package name */
        public final int f38966d;

        /* renamed from: e  reason: collision with root package name */
        public final String f38967e;

        /* renamed from: f  reason: collision with root package name */
        public final int f38968f;

        /* renamed from: g  reason: collision with root package name */
        public final int f38969g;

        /* compiled from: TableInfo.kt */
        /* renamed from: y0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0539a {
            private C0539a() {
            }

            public /* synthetic */ C0539a(g gVar) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            @SuppressLint({"SyntheticAccessor"})
            public final boolean b(String str, String str2) {
                CharSequence x02;
                k.f(str, "current");
                if (k.a(str, str2)) {
                    return true;
                }
                if (a(str)) {
                    String substring = str.substring(1, str.length() - 1);
                    k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    x02 = q.x0(substring);
                    return k.a(x02.toString(), str2);
                }
                return false;
            }
        }

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            k.f(str, "name");
            k.f(str2, "type");
            this.f38963a = str;
            this.f38964b = str2;
            this.f38965c = z10;
            this.f38966d = i10;
            this.f38967e = str3;
            this.f38968f = i11;
            this.f38969g = a(str2);
        }

        private final int a(String str) {
            boolean D;
            boolean D2;
            boolean D3;
            boolean D4;
            boolean D5;
            boolean D6;
            boolean D7;
            boolean D8;
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            k.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            k.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            D = q.D(upperCase, "INT", false, 2, null);
            if (D) {
                return 3;
            }
            D2 = q.D(upperCase, "CHAR", false, 2, null);
            if (!D2) {
                D3 = q.D(upperCase, "CLOB", false, 2, null);
                if (!D3) {
                    D4 = q.D(upperCase, "TEXT", false, 2, null);
                    if (!D4) {
                        D5 = q.D(upperCase, "BLOB", false, 2, null);
                        if (D5) {
                            return 5;
                        }
                        D6 = q.D(upperCase, "REAL", false, 2, null);
                        if (D6) {
                            return 4;
                        }
                        D7 = q.D(upperCase, "FLOA", false, 2, null);
                        if (D7) {
                            return 4;
                        }
                        D8 = q.D(upperCase, "DOUB", false, 2, null);
                        return D8 ? 4 : 1;
                    }
                }
            }
            return 2;
        }

        public final boolean b() {
            return this.f38966d > 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof y0.e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 20
                if (r1 < r3) goto L1a
                int r1 = r6.f38966d
                r3 = r7
                y0.e$a r3 = (y0.e.a) r3
                int r3 = r3.f38966d
                if (r1 == r3) goto L28
                return r2
            L1a:
                boolean r1 = r6.b()
                r3 = r7
                y0.e$a r3 = (y0.e.a) r3
                boolean r3 = r3.b()
                if (r1 == r3) goto L28
                return r2
            L28:
                java.lang.String r1 = r6.f38963a
                y0.e$a r7 = (y0.e.a) r7
                java.lang.String r3 = r7.f38963a
                boolean r1 = qe.k.a(r1, r3)
                if (r1 != 0) goto L35
                return r2
            L35:
                boolean r1 = r6.f38965c
                boolean r3 = r7.f38965c
                if (r1 == r3) goto L3c
                return r2
            L3c:
                int r1 = r6.f38968f
                r3 = 2
                if (r1 != r0) goto L54
                int r1 = r7.f38968f
                if (r1 != r3) goto L54
                java.lang.String r1 = r6.f38967e
                if (r1 == 0) goto L54
                y0.e$a$a r4 = y0.e.a.f38962h
                java.lang.String r5 = r7.f38967e
                boolean r1 = r4.b(r1, r5)
                if (r1 != 0) goto L54
                return r2
            L54:
                int r1 = r6.f38968f
                if (r1 != r3) goto L6b
                int r1 = r7.f38968f
                if (r1 != r0) goto L6b
                java.lang.String r1 = r7.f38967e
                if (r1 == 0) goto L6b
                y0.e$a$a r3 = y0.e.a.f38962h
                java.lang.String r4 = r6.f38967e
                boolean r1 = r3.b(r1, r4)
                if (r1 != 0) goto L6b
                return r2
            L6b:
                int r1 = r6.f38968f
                if (r1 == 0) goto L8c
                int r3 = r7.f38968f
                if (r1 != r3) goto L8c
                java.lang.String r1 = r6.f38967e
                if (r1 == 0) goto L82
                y0.e$a$a r3 = y0.e.a.f38962h
                java.lang.String r4 = r7.f38967e
                boolean r1 = r3.b(r1, r4)
                if (r1 != 0) goto L88
                goto L86
            L82:
                java.lang.String r1 = r7.f38967e
                if (r1 == 0) goto L88
            L86:
                r1 = 1
                goto L89
            L88:
                r1 = 0
            L89:
                if (r1 == 0) goto L8c
                return r2
            L8c:
                int r1 = r6.f38969g
                int r7 = r7.f38969g
                if (r1 != r7) goto L93
                goto L94
            L93:
                r0 = 0
            L94:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.e.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.f38963a.hashCode() * 31) + this.f38969g) * 31) + (this.f38965c ? 1231 : 1237)) * 31) + this.f38966d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f38963a);
            sb2.append("', type='");
            sb2.append(this.f38964b);
            sb2.append("', affinity='");
            sb2.append(this.f38969g);
            sb2.append("', notNull=");
            sb2.append(this.f38965c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f38966d);
            sb2.append(", defaultValue='");
            String str = this.f38967e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final e a(z0.g gVar, String str) {
            k.f(gVar, "database");
            k.f(str, "tableName");
            return f.f(gVar, str);
        }
    }

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f38970a;

        /* renamed from: b  reason: collision with root package name */
        public final String f38971b;

        /* renamed from: c  reason: collision with root package name */
        public final String f38972c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f38973d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f38974e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            k.f(str, "referenceTable");
            k.f(str2, "onDelete");
            k.f(str3, "onUpdate");
            k.f(list, "columnNames");
            k.f(list2, "referenceColumnNames");
            this.f38970a = str;
            this.f38971b = str2;
            this.f38972c = str3;
            this.f38973d = list;
            this.f38974e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (k.a(this.f38970a, cVar.f38970a) && k.a(this.f38971b, cVar.f38971b) && k.a(this.f38972c, cVar.f38972c) && k.a(this.f38973d, cVar.f38973d)) {
                    return k.a(this.f38974e, cVar.f38974e);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f38970a.hashCode() * 31) + this.f38971b.hashCode()) * 31) + this.f38972c.hashCode()) * 31) + this.f38973d.hashCode()) * 31) + this.f38974e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f38970a + "', onDelete='" + this.f38971b + " +', onUpdate='" + this.f38972c + "', columnNames=" + this.f38973d + ", referenceColumnNames=" + this.f38974e + '}';
        }
    }

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final int f38975a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38976b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38977c;

        /* renamed from: d  reason: collision with root package name */
        private final String f38978d;

        public d(int i10, int i11, String str, String str2) {
            k.f(str, "from");
            k.f(str2, "to");
            this.f38975a = i10;
            this.f38976b = i11;
            this.f38977c = str;
            this.f38978d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            k.f(dVar, InneractiveMediationNameConsts.OTHER);
            int i10 = this.f38975a - dVar.f38975a;
            return i10 == 0 ? this.f38976b - dVar.f38976b : i10;
        }

        public final String f() {
            return this.f38977c;
        }

        public final int g() {
            return this.f38975a;
        }

        public final String h() {
            return this.f38978d;
        }
    }

    /* compiled from: TableInfo.kt */
    /* renamed from: y0.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0540e {

        /* renamed from: a  reason: collision with root package name */
        public final String f38979a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f38980b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f38981c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f38982d;

        /* compiled from: TableInfo.kt */
        /* renamed from: y0.e$e$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        static {
            new a(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.lang.Object, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public C0540e(String str, boolean z10, List<String> list, List<String> list2) {
            k.f(str, "name");
            k.f(list, "columns");
            k.f(list2, "orders");
            this.f38979a = str;
            this.f38980b = z10;
            this.f38981c = list;
            this.f38982d = list2;
            if (list2.isEmpty()) {
                int size = list.size();
                list2 = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list2.add(l.ASC.name());
                }
            }
            this.f38982d = list2;
        }

        public boolean equals(Object obj) {
            boolean y10;
            boolean y11;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0540e) {
                C0540e c0540e = (C0540e) obj;
                if (this.f38980b == c0540e.f38980b && k.a(this.f38981c, c0540e.f38981c) && k.a(this.f38982d, c0540e.f38982d)) {
                    y10 = p.y(this.f38979a, "index_", false, 2, null);
                    if (y10) {
                        y11 = p.y(c0540e.f38979a, "index_", false, 2, null);
                        return y11;
                    }
                    return k.a(this.f38979a, c0540e.f38979a);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            boolean y10;
            y10 = p.y(this.f38979a, "index_", false, 2, null);
            return ((((((y10 ? -1184239155 : this.f38979a.hashCode()) * 31) + (this.f38980b ? 1 : 0)) * 31) + this.f38981c.hashCode()) * 31) + this.f38982d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f38979a + "', unique=" + this.f38980b + ", columns=" + this.f38981c + ", orders=" + this.f38982d + "'}";
        }
    }

    public e(String str, Map<String, a> map, Set<c> set, Set<C0540e> set2) {
        k.f(str, "name");
        k.f(map, "columns");
        k.f(set, "foreignKeys");
        this.f38958a = str;
        this.f38959b = map;
        this.f38960c = set;
        this.f38961d = set2;
    }

    public static final e a(z0.g gVar, String str) {
        return f38957e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set<C0540e> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (k.a(this.f38958a, eVar.f38958a) && k.a(this.f38959b, eVar.f38959b) && k.a(this.f38960c, eVar.f38960c)) {
                Set<C0540e> set2 = this.f38961d;
                if (set2 == null || (set = eVar.f38961d) == null) {
                    return true;
                }
                return k.a(set2, set);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f38958a.hashCode() * 31) + this.f38959b.hashCode()) * 31) + this.f38960c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f38958a + "', columns=" + this.f38959b + ", foreignKeys=" + this.f38960c + ", indices=" + this.f38961d + '}';
    }
}
