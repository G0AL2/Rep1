package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.migration.Migration;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z0.h;

/* compiled from: RoomDatabase.kt */
/* loaded from: classes.dex */
public abstract class k0 {
    public static final c Companion = new c(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private androidx.room.c autoCloser;
    private final Map<String, Object> backingFieldMap;
    private z0.h internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile z0.g mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final o invalidationTracker = createInvalidationTracker();
    private Map<Class<? extends x0.a>, x0.a> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static class a<T extends k0> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3918a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f3919b;

        /* renamed from: c  reason: collision with root package name */
        private final String f3920c;

        /* renamed from: d  reason: collision with root package name */
        private final List<b> f3921d;

        /* renamed from: e  reason: collision with root package name */
        private f f3922e;

        /* renamed from: f  reason: collision with root package name */
        private g f3923f;

        /* renamed from: g  reason: collision with root package name */
        private Executor f3924g;

        /* renamed from: h  reason: collision with root package name */
        private final List<Object> f3925h;

        /* renamed from: i  reason: collision with root package name */
        private List<x0.a> f3926i;

        /* renamed from: j  reason: collision with root package name */
        private Executor f3927j;

        /* renamed from: k  reason: collision with root package name */
        private Executor f3928k;

        /* renamed from: l  reason: collision with root package name */
        private h.c f3929l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f3930m;

        /* renamed from: n  reason: collision with root package name */
        private d f3931n;

        /* renamed from: o  reason: collision with root package name */
        private Intent f3932o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f3933p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f3934q;

        /* renamed from: r  reason: collision with root package name */
        private long f3935r;

        /* renamed from: s  reason: collision with root package name */
        private TimeUnit f3936s;

        /* renamed from: t  reason: collision with root package name */
        private final e f3937t;

        /* renamed from: u  reason: collision with root package name */
        private Set<Integer> f3938u;

        /* renamed from: v  reason: collision with root package name */
        private Set<Integer> f3939v;

        /* renamed from: w  reason: collision with root package name */
        private String f3940w;

        /* renamed from: x  reason: collision with root package name */
        private File f3941x;

        /* renamed from: y  reason: collision with root package name */
        private Callable<InputStream> f3942y;

        public a(Context context, Class<T> cls, String str) {
            qe.k.f(context, "context");
            qe.k.f(cls, "klass");
            this.f3918a = context;
            this.f3919b = cls;
            this.f3920c = str;
            this.f3921d = new ArrayList();
            this.f3925h = new ArrayList();
            this.f3926i = new ArrayList();
            this.f3931n = d.AUTOMATIC;
            this.f3933p = true;
            this.f3935r = -1L;
            this.f3937t = new e();
            this.f3938u = new LinkedHashSet();
        }

        public a<T> a(b bVar) {
            qe.k.f(bVar, "callback");
            this.f3921d.add(bVar);
            return this;
        }

        public a<T> b(Migration... migrationArr) {
            qe.k.f(migrationArr, "migrations");
            if (this.f3939v == null) {
                this.f3939v = new HashSet();
            }
            for (Migration migration : migrationArr) {
                Set<Integer> set = this.f3939v;
                qe.k.c(set);
                set.add(Integer.valueOf(migration.startVersion));
                Set<Integer> set2 = this.f3939v;
                qe.k.c(set2);
                set2.add(Integer.valueOf(migration.endVersion));
            }
            this.f3937t.b((x0.b[]) Arrays.copyOf(migrationArr, migrationArr.length));
            return this;
        }

        public a<T> c() {
            this.f3930m = true;
            return this;
        }

        public T d() {
            s0 s0Var;
            Executor executor = this.f3927j;
            if (executor == null && this.f3928k == null) {
                Executor e10 = k.a.e();
                this.f3928k = e10;
                this.f3927j = e10;
            } else if (executor != null && this.f3928k == null) {
                this.f3928k = executor;
            } else if (executor == null) {
                this.f3927j = this.f3928k;
            }
            Set<Integer> set = this.f3939v;
            if (set != null) {
                qe.k.c(set);
                for (Integer num : set) {
                    int intValue = num.intValue();
                    if (!(!this.f3938u.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            androidx.room.e eVar = this.f3929l;
            if (eVar == null) {
                eVar = new a1.f();
            }
            if (eVar != null) {
                if (this.f3935r > 0) {
                    if (this.f3920c != null) {
                        long j10 = this.f3935r;
                        TimeUnit timeUnit = this.f3936s;
                        if (timeUnit != null) {
                            Executor executor2 = this.f3927j;
                            if (executor2 != null) {
                                eVar = new androidx.room.e(eVar, new androidx.room.c(j10, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.f3940w;
                if (str != null || this.f3941x != null || this.f3942y != null) {
                    if (this.f3920c != null) {
                        int i10 = str == null ? 0 : 1;
                        File file = this.f3941x;
                        int i11 = file == null ? 0 : 1;
                        Callable<InputStream> callable = this.f3942y;
                        if ((i10 + i11) + (callable == null ? 0 : 1) == 1) {
                            eVar = new s0(str, file, callable, eVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                eVar = null;
            }
            if (eVar != null) {
                g gVar = this.f3923f;
                if (gVar != null) {
                    Executor executor3 = this.f3924g;
                    if (executor3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    if (gVar != null) {
                        s0Var = new e0(eVar, executor3, gVar);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    s0Var = eVar;
                }
                Context context = this.f3918a;
                String str2 = this.f3920c;
                e eVar2 = this.f3937t;
                List<b> list = this.f3921d;
                boolean z10 = this.f3930m;
                d h10 = this.f3931n.h(context);
                Executor executor4 = this.f3927j;
                if (executor4 != null) {
                    Executor executor5 = this.f3928k;
                    if (executor5 != null) {
                        androidx.room.f fVar = new androidx.room.f(context, str2, s0Var, eVar2, list, z10, h10, executor4, executor5, this.f3932o, this.f3933p, this.f3934q, this.f3938u, this.f3940w, this.f3941x, this.f3942y, this.f3922e, this.f3925h, this.f3926i);
                        T t10 = (T) j0.b(this.f3919b, "_Impl");
                        t10.init(fVar);
                        return t10;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public a<T> e() {
            this.f3933p = false;
            this.f3934q = true;
            return this;
        }

        public a<T> f(h.c cVar) {
            this.f3929l = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            qe.k.f(executor, "executor");
            this.f3927j = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(z0.g gVar) {
            qe.k.f(gVar, "db");
        }

        public void b(z0.g gVar) {
            qe.k.f(gVar, "db");
        }

        public void c(z0.g gVar) {
            qe.k.f(gVar, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qe.g gVar) {
            this();
        }
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean g(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return z0.c.b(activityManager);
            }
            return false;
        }

        public final d h(Context context) {
            qe.k.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                Object systemService = context.getSystemService("activity");
                qe.k.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                if (!g((ActivityManager) systemService)) {
                    return WRITE_AHEAD_LOGGING;
                }
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Integer, TreeMap<Integer, x0.b>> f3947a = new LinkedHashMap();

        private final void a(x0.b bVar) {
            int i10 = bVar.startVersion;
            int i11 = bVar.endVersion;
            Map<Integer, TreeMap<Integer, x0.b>> map = this.f3947a;
            Integer valueOf = Integer.valueOf(i10);
            TreeMap<Integer, x0.b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, x0.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + bVar);
            }
            treeMap2.put(Integer.valueOf(i11), bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
            if (r6 <= r12) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
            if (r6 < r11) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0059, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<x0.b> e(java.util.List<x0.b> r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L0:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L7
                if (r11 >= r12) goto Lb
                goto L9
            L7:
                if (r11 <= r12) goto Lb
            L9:
                r2 = 1
                goto Lc
            Lb:
                r2 = 0
            Lc:
                if (r2 == 0) goto L6e
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, x0.b>> r2 = r8.f3947a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L1e
                return r3
            L1e:
                if (r10 == 0) goto L25
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L29
            L25:
                java.util.Set r4 = r2.keySet()
            L29:
                java.util.Iterator r4 = r4.iterator()
            L2d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L6a
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L4b
                int r7 = r11 + 1
                qe.k.e(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L58
                if (r6 > r12) goto L58
                goto L56
            L4b:
                qe.k.e(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L58
                if (r6 >= r11) goto L58
            L56:
                r6 = 1
                goto L59
            L58:
                r6 = 0
            L59:
                if (r6 == 0) goto L2d
                java.lang.Object r11 = r2.get(r5)
                qe.k.c(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L6b
            L6a:
                r0 = 0
            L6b:
                if (r0 != 0) goto L0
                return r3
            L6e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.k0.e.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(x0.b... bVarArr) {
            qe.k.f(bVarArr, "migrations");
            for (x0.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public final boolean c(int i10, int i11) {
            Map<Integer, Map<Integer, x0.b>> f10 = f();
            if (f10.containsKey(Integer.valueOf(i10))) {
                Map<Integer, x0.b> map = f10.get(Integer.valueOf(i10));
                if (map == null) {
                    map = fe.h0.g();
                }
                return map.containsKey(Integer.valueOf(i11));
            }
            return false;
        }

        public List<x0.b> d(int i10, int i11) {
            List<x0.b> h10;
            if (i10 == i11) {
                h10 = fe.p.h();
                return h10;
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map<Integer, Map<Integer, x0.b>> f() {
            return this.f3947a;
        }
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static abstract class f {
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public interface g {
        void a(String str, List<? extends Object> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static final class h extends qe.l implements pe.l<z0.g, Object> {
        h() {
            super(1);
        }

        @Override // pe.l
        /* renamed from: a */
        public final Object b(z0.g gVar) {
            qe.k.f(gVar, "it");
            k0.this.internalBeginTransaction();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static final class i extends qe.l implements pe.l<z0.g, Object> {
        i() {
            super(1);
        }

        @Override // pe.l
        /* renamed from: a */
        public final Object b(z0.g gVar) {
            qe.k.f(gVar, "it");
            k0.this.internalEndTransaction();
            return null;
        }
    }

    public k0() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        qe.k.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        z0.g F0 = getOpenHelper().F0();
        getInvalidationTracker().w(F0);
        if (Build.VERSION.SDK_INT >= 16 && F0.a1()) {
            F0.J();
        } else {
            F0.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().F0().Q();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().n();
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ Cursor query$default(k0 k0Var, z0.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                cancellationSignal = null;
            }
            return k0Var.query(jVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> cls, z0.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof androidx.room.g) {
            return (T) unwrapOpenHelper(cls, ((androidx.room.g) hVar).a());
        }
        return null;
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!(inTransaction() || this.suspendingTransactionId.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.c cVar = this.autoCloser;
        if (cVar == null) {
            internalBeginTransaction();
        } else {
            cVar.g(new h());
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            qe.k.e(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().t();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public z0.k compileStatement(String str) {
        qe.k.f(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().F0().t0(str);
    }

    protected abstract o createInvalidationTracker();

    protected abstract z0.h createOpenHelper(androidx.room.f fVar);

    public void endTransaction() {
        androidx.room.c cVar = this.autoCloser;
        if (cVar == null) {
            internalEndTransaction();
        } else {
            cVar.g(new i());
        }
    }

    protected final Map<Class<? extends x0.a>, x0.a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<x0.b> getAutoMigrations(Map<Class<? extends x0.a>, x0.a> map) {
        List<x0.b> h10;
        qe.k.f(map, "autoMigrationSpecs");
        h10 = fe.p.h();
        return h10;
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        qe.k.e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public z0.h getOpenHelper() {
        z0.h hVar = this.internalOpenHelper;
        if (hVar == null) {
            qe.k.s("internalOpenHelper");
            return null;
        }
        return hVar;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor == null) {
            qe.k.s("internalQueryExecutor");
            return null;
        }
        return executor;
    }

    public Set<Class<? extends x0.a>> getRequiredAutoMigrationSpecs() {
        Set<Class<? extends x0.a>> d10;
        d10 = fe.m0.d();
        return d10;
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        Map<Class<?>, List<Class<?>>> g10;
        g10 = fe.h0.g();
        return g10;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            qe.k.s("internalTransactionExecutor");
            return null;
        }
        return executor;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        qe.k.f(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return getOpenHelper().F0().S0();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2 A[LOOP:5: B:60:0x017a->B:75:0x01b2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(androidx.room.f r12) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.k0.init(androidx.room.f):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void internalInitInvalidationTracker(z0.g gVar) {
        qe.k.f(gVar, "db");
        getInvalidationTracker().k(gVar);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        androidx.room.c cVar = this.autoCloser;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            z0.g gVar = this.mDatabase;
            if (gVar == null) {
                bool = null;
                return qe.k.a(bool, Boolean.TRUE);
            }
            isOpen = gVar.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return qe.k.a(bool, Boolean.TRUE);
    }

    public Cursor query(String str, Object[] objArr) {
        qe.k.f(str, "query");
        return getOpenHelper().F0().x(new z0.a(str, objArr));
    }

    public final Cursor query(z0.j jVar) {
        qe.k.f(jVar, "query");
        return query$default(this, jVar, null, 2, null);
    }

    public void runInTransaction(Runnable runnable) {
        qe.k.f(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(Map<Class<? extends x0.a>, x0.a> map) {
        qe.k.f(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().F0().H();
    }

    public Cursor query(z0.j jVar, CancellationSignal cancellationSignal) {
        qe.k.f(jVar, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return getOpenHelper().F0().E(jVar, cancellationSignal);
        }
        return getOpenHelper().F0().x(jVar);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        qe.k.f(callable, "body");
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
