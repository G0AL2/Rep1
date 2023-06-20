package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public class o {

    /* renamed from: q  reason: collision with root package name */
    public static final a f3974q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f3975r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f3976a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f3977b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Set<String>> f3978c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Integer> f3979d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f3980e;

    /* renamed from: f  reason: collision with root package name */
    private androidx.room.c f3981f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f3982g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f3983h;

    /* renamed from: i  reason: collision with root package name */
    private volatile z0.k f3984i;

    /* renamed from: j  reason: collision with root package name */
    private final b f3985j;

    /* renamed from: k  reason: collision with root package name */
    private final m f3986k;

    /* renamed from: l  reason: collision with root package name */
    private final l.b<c, d> f3987l;

    /* renamed from: m  reason: collision with root package name */
    private r f3988m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f3989n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f3990o;

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f3991p;

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        public final void a(z0.g gVar) {
            qe.k.f(gVar, "database");
            if (Build.VERSION.SDK_INT >= 16 && gVar.a1()) {
                gVar.J();
            } else {
                gVar.m();
            }
        }

        public final String b(String str, String str2) {
            qe.k.f(str, "tableName");
            qe.k.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long[] f3992a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f3993b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f3994c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3995d;

        /* compiled from: InvalidationTracker.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qe.g gVar) {
                this();
            }
        }

        static {
            new a(null);
        }

        public b(int i10) {
            this.f3992a = new long[i10];
            this.f3993b = new boolean[i10];
            this.f3994c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                if (this.f3995d) {
                    long[] jArr = this.f3992a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f3993b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f3994c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f3994c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f3995d = false;
                    return (int[]) this.f3994c.clone();
                }
                return null;
            }
        }

        public final boolean b(int... iArr) {
            boolean z10;
            qe.k.f(iArr, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3992a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f3995d = true;
                        z10 = true;
                    }
                }
                ee.u uVar = ee.u.f29813a;
            }
            return z10;
        }

        public final boolean c(int... iArr) {
            boolean z10;
            qe.k.f(iArr, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3992a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f3995d = true;
                        z10 = true;
                    }
                }
                ee.u uVar = ee.u.f29813a;
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f3993b, false);
                this.f3995d = true;
                ee.u uVar = ee.u.f29813a;
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f3996a;

        public c(String[] strArr) {
            qe.k.f(strArr, "tables");
            this.f3996a = strArr;
        }

        public final String[] a() {
            return this.f3996a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> set);
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f3997a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f3998b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f3999c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f4000d;

        public d(c cVar, int[] iArr, String[] strArr) {
            Set<String> d10;
            qe.k.f(cVar, "observer");
            qe.k.f(iArr, "tableIds");
            qe.k.f(strArr, "tableNames");
            this.f3997a = cVar;
            this.f3998b = iArr;
            this.f3999c = strArr;
            if (!(strArr.length == 0)) {
                d10 = fe.l0.c(strArr[0]);
            } else {
                d10 = fe.m0.d();
            }
            this.f4000d = d10;
            if (!(iArr.length == strArr.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final int[] a() {
            return this.f3998b;
        }

        public final void b(Set<Integer> set) {
            Set<String> d10;
            Set b10;
            qe.k.f(set, "invalidatedTablesIds");
            int[] iArr = this.f3998b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    b10 = fe.l0.b();
                    int[] iArr2 = this.f3998b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i10]))) {
                            b10.add(this.f3999c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    d10 = fe.l0.a(b10);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    d10 = this.f4000d;
                } else {
                    d10 = fe.m0.d();
                }
            } else {
                d10 = fe.m0.d();
            }
            if (!d10.isEmpty()) {
                this.f3997a.c(d10);
            }
        }

        public final void c(String[] strArr) {
            Set<String> d10;
            boolean l10;
            Set b10;
            String[] strArr2;
            boolean l11;
            qe.k.f(strArr, "tables");
            int length = this.f3999c.length;
            if (length != 0) {
                boolean z10 = false;
                if (length != 1) {
                    b10 = fe.l0.b();
                    for (String str : strArr) {
                        for (String str2 : this.f3999c) {
                            l11 = ve.p.l(str2, str, true);
                            if (l11) {
                                b10.add(str2);
                            }
                        }
                    }
                    d10 = fe.l0.a(b10);
                } else {
                    int length2 = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            break;
                        }
                        l10 = ve.p.l(strArr[i10], this.f3999c[0], true);
                        if (l10) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                    if (z10) {
                        d10 = this.f4000d;
                    } else {
                        d10 = fe.m0.d();
                    }
                }
            } else {
                d10 = fe.m0.d();
            }
            if (!d10.isEmpty()) {
                this.f3997a.c(d10);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        private final o f4001b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<c> f4002c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o oVar, c cVar) {
            super(cVar.a());
            qe.k.f(oVar, "tracker");
            qe.k.f(cVar, "delegate");
            this.f4001b = oVar;
            this.f4002c = new WeakReference<>(cVar);
        }

        @Override // androidx.room.o.c
        public void c(Set<String> set) {
            qe.k.f(set, "tables");
            c cVar = this.f4002c.get();
            if (cVar == null) {
                this.f4001b.o(this);
            } else {
                cVar.c(set);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class f implements Runnable {
        f() {
        }

        private final Set<Integer> a() {
            Set b10;
            Set<Integer> a10;
            o oVar = o.this;
            b10 = fe.l0.b();
            Cursor query$default = k0.query$default(oVar.g(), new z0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            if (Build.VERSION.SDK_INT > 15) {
                while (query$default.moveToNext()) {
                    try {
                        b10.add(Integer.valueOf(query$default.getInt(0)));
                    } finally {
                    }
                }
                ee.u uVar = ee.u.f29813a;
                ne.a.a(query$default, null);
            } else {
                while (query$default.moveToNext()) {
                    try {
                        b10.add(Integer.valueOf(query$default.getInt(0)));
                    } finally {
                        query$default.close();
                    }
                }
                ee.u uVar2 = ee.u.f29813a;
            }
            a10 = fe.l0.a(b10);
            if (!a10.isEmpty()) {
                if (o.this.f() != null) {
                    z0.k f10 = o.this.f();
                    if (f10 != null) {
                        f10.v();
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return a10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
            if ((!r3.isEmpty()) == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
            r0 = r5.f4003a.h();
            r1 = r5.f4003a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
            r1 = r1.h().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
            if (r1.hasNext() == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
            ((androidx.room.o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
            r1 = ee.u.f29813a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.o.f.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(k0 k0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        String str;
        qe.k.f(k0Var, "database");
        qe.k.f(map, "shadowTablesMap");
        qe.k.f(map2, "viewTables");
        qe.k.f(strArr, "tableNames");
        this.f3976a = k0Var;
        this.f3977b = map;
        this.f3978c = map2;
        this.f3982g = new AtomicBoolean(false);
        this.f3985j = new b(strArr.length);
        this.f3986k = new m(k0Var);
        this.f3987l = new l.b<>();
        this.f3989n = new Object();
        this.f3990o = new Object();
        this.f3979d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            qe.k.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            qe.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f3979d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f3977b.get(strArr[i10]);
            if (str3 != null) {
                qe.k.e(locale, "US");
                str = str3.toLowerCase(locale);
                qe.k.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f3980e = strArr2;
        for (Map.Entry<String, String> entry : this.f3977b.entrySet()) {
            Locale locale2 = Locale.US;
            qe.k.e(locale2, "US");
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            qe.k.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f3979d.containsKey(lowerCase2)) {
                qe.k.e(locale2, "US");
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                qe.k.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map3 = this.f3979d;
                map3.put(lowerCase3, fe.e0.h(map3, lowerCase2));
            }
        }
        this.f3991p = new f();
    }

    private final String[] p(String[] strArr) {
        Set b10;
        Set a10;
        b10 = fe.l0.b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f3978c;
            Locale locale = Locale.US;
            qe.k.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            qe.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f3978c;
                qe.k.e(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                qe.k.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                qe.k.c(set);
                b10.addAll(set);
            } else {
                b10.add(str);
            }
        }
        a10 = fe.l0.a(b10);
        Object[] array = a10.toArray(new String[0]);
        qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void s(z0.g gVar, int i10) {
        gVar.s("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f3980e[i10];
        for (String str2 : f3975r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f3974q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            qe.k.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.s(str3);
        }
    }

    private final void u(z0.g gVar, int i10) {
        String[] strArr;
        String str = this.f3980e[i10];
        for (String str2 : f3975r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f3974q.b(str, str2);
            qe.k.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.s(str3);
        }
    }

    private final String[] x(String[] strArr) {
        String[] p10 = p(strArr);
        for (String str : p10) {
            Map<String, Integer> map = this.f3979d;
            Locale locale = Locale.US;
            qe.k.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            qe.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return p10;
    }

    @SuppressLint({"RestrictedApi"})
    public void b(c cVar) {
        int[] M;
        d j10;
        qe.k.f(cVar, "observer");
        String[] p10 = p(cVar.a());
        ArrayList arrayList = new ArrayList(p10.length);
        for (String str : p10) {
            Map<String, Integer> map = this.f3979d;
            Locale locale = Locale.US;
            qe.k.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            qe.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        M = fe.x.M(arrayList);
        d dVar = new d(cVar, M, p10);
        synchronized (this.f3987l) {
            j10 = this.f3987l.j(cVar, dVar);
        }
        if (j10 == null && this.f3985j.b(Arrays.copyOf(M, M.length))) {
            v();
        }
    }

    public void c(c cVar) {
        qe.k.f(cVar, "observer");
        b(new e(this, cVar));
    }

    public <T> LiveData<T> d(String[] strArr, boolean z10, Callable<T> callable) {
        qe.k.f(strArr, "tableNames");
        qe.k.f(callable, "computeFunction");
        return this.f3986k.a(x(strArr), z10, callable);
    }

    public final boolean e() {
        if (this.f3976a.isOpen()) {
            if (!this.f3983h) {
                this.f3976a.getOpenHelper().F0();
            }
            if (this.f3983h) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    public final z0.k f() {
        return this.f3984i;
    }

    public final k0 g() {
        return this.f3976a;
    }

    public final l.b<c, d> h() {
        return this.f3987l;
    }

    public final AtomicBoolean i() {
        return this.f3982g;
    }

    public final Map<String, Integer> j() {
        return this.f3979d;
    }

    public final void k(z0.g gVar) {
        qe.k.f(gVar, "database");
        synchronized (this.f3990o) {
            if (this.f3983h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.s("PRAGMA temp_store = MEMORY;");
            gVar.s("PRAGMA recursive_triggers='ON';");
            gVar.s("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            w(gVar);
            this.f3984i = gVar.t0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f3983h = true;
            ee.u uVar = ee.u.f29813a;
        }
    }

    public final void l(String... strArr) {
        qe.k.f(strArr, "tables");
        synchronized (this.f3987l) {
            Iterator<Map.Entry<K, V>> it = this.f3987l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                qe.k.e(entry, "(observer, wrapper)");
                d dVar = (d) entry.getValue();
                if (!((c) entry.getKey()).b()) {
                    dVar.c(strArr);
                }
            }
            ee.u uVar = ee.u.f29813a;
        }
    }

    public final void m() {
        synchronized (this.f3990o) {
            this.f3983h = false;
            this.f3985j.d();
            ee.u uVar = ee.u.f29813a;
        }
    }

    public void n() {
        if (this.f3982g.compareAndSet(false, true)) {
            androidx.room.c cVar = this.f3981f;
            if (cVar != null) {
                cVar.j();
            }
            this.f3976a.getQueryExecutor().execute(this.f3991p);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void o(c cVar) {
        d k10;
        qe.k.f(cVar, "observer");
        synchronized (this.f3987l) {
            k10 = this.f3987l.k(cVar);
        }
        if (k10 != null) {
            b bVar = this.f3985j;
            int[] a10 = k10.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                v();
            }
        }
    }

    public final void q(androidx.room.c cVar) {
        qe.k.f(cVar, "autoCloser");
        this.f3981f = cVar;
        cVar.m(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                o.this.m();
            }
        });
    }

    public final void r(Context context, String str, Intent intent) {
        qe.k.f(context, "context");
        qe.k.f(str, "name");
        qe.k.f(intent, "serviceIntent");
        this.f3988m = new r(context, str, intent, this, this.f3976a.getQueryExecutor());
    }

    public final void t() {
        r rVar = this.f3988m;
        if (rVar != null) {
            rVar.o();
        }
        this.f3988m = null;
    }

    public final void v() {
        if (this.f3976a.isOpen()) {
            w(this.f3976a.getOpenHelper().F0());
        }
    }

    public final void w(z0.g gVar) {
        qe.k.f(gVar, "database");
        if (gVar.S0()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f3976a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            synchronized (this.f3989n) {
                int[] a10 = this.f3985j.a();
                if (a10 == null) {
                    closeLock$room_runtime_release.unlock();
                    return;
                }
                f3974q.a(gVar);
                int length = a10.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = a10[i10];
                    int i13 = i11 + 1;
                    if (i12 == 1) {
                        s(gVar, i11);
                    } else if (i12 == 2) {
                        u(gVar, i11);
                    }
                    i10++;
                    i11 = i13;
                }
                gVar.H();
                gVar.Q();
                ee.u uVar = ee.u.f29813a;
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
