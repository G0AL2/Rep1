package a1;

import a1.d;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import ee.j;
import java.io.File;
import java.util.UUID;
import qe.k;
import qe.l;
import z0.h;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
/* loaded from: classes.dex */
public final class d implements z0.h {

    /* renamed from: a */
    private final Context f10a;

    /* renamed from: b */
    private final String f11b;

    /* renamed from: c */
    private final h.a f12c;

    /* renamed from: d */
    private final boolean f13d;

    /* renamed from: e */
    private final boolean f14e;

    /* renamed from: f */
    private final ee.h<c> f15f;

    /* renamed from: g */
    private boolean f16g;

    /* renamed from: h */
    private final ee.h f17h;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private a1.c f18a;

        public b(a1.c cVar) {
            this.f18a = cVar;
        }

        public final a1.c a() {
            return this.f18a;
        }

        public final void b(a1.c cVar) {
            this.f18a = cVar;
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: h */
        public static final C0002c f19h = new C0002c(null);

        /* renamed from: a */
        private final Context f20a;

        /* renamed from: b */
        private final b f21b;

        /* renamed from: c */
        private final h.a f22c;

        /* renamed from: d */
        private final boolean f23d;

        /* renamed from: e */
        private boolean f24e;

        /* renamed from: f */
        private final b1.a f25f;

        /* renamed from: g */
        private boolean f26g;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        /* loaded from: classes.dex */
        public static final class a extends RuntimeException {

            /* renamed from: a */
            private final b f27a;

            /* renamed from: b */
            private final Throwable f28b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th) {
                super(th);
                k.f(bVar, "callbackName");
                k.f(th, "cause");
                this.f27a = bVar;
                this.f28b = th;
            }

            public final b a() {
                return this.f27a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f28b;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        /* loaded from: classes.dex */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        /* renamed from: a1.d$c$c */
        /* loaded from: classes.dex */
        public static final class C0002c {
            private C0002c() {
            }

            public /* synthetic */ C0002c(qe.g gVar) {
                this();
            }

            public final a1.c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                k.f(bVar, "refHolder");
                k.f(sQLiteDatabase, "sqLiteDatabase");
                a1.c a10 = bVar.a();
                if (a10 == null || !a10.d(sQLiteDatabase)) {
                    a1.c cVar = new a1.c(sQLiteDatabase);
                    bVar.b(cVar);
                    return cVar;
                }
                return a10;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        /* renamed from: a1.d$c$d */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0003d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35a;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.ON_CONFIGURE.ordinal()] = 1;
                iArr[b.ON_CREATE.ordinal()] = 2;
                iArr[b.ON_UPGRADE.ordinal()] = 3;
                iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                iArr[b.ON_OPEN.ordinal()] = 5;
                f35a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b bVar, final h.a aVar, boolean z10) {
            super(context, str, null, aVar.f39883a, new DatabaseErrorHandler() { // from class: a1.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.a(h.a.this, bVar, sQLiteDatabase);
                }
            });
            k.f(context, "context");
            k.f(bVar, "dbRef");
            k.f(aVar, "callback");
            this.f20a = context;
            this.f21b = bVar;
            this.f22c = aVar;
            this.f23d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                k.e(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            k.e(cacheDir, "context.cacheDir");
            this.f25f = new b1.a(str, cacheDir, false);
        }

        public static /* synthetic */ void a(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            b(aVar, bVar, sQLiteDatabase);
        }

        public static final void b(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            k.f(aVar, "$callback");
            k.f(bVar, "$dbRef");
            C0002c c0002c = f19h;
            k.e(sQLiteDatabase, "dbObj");
            aVar.c(c0002c.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase h(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                k.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            k.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase l(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f20a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return h(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return h(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i10 = C0003d.f35a[aVar.a().ordinal()];
                        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                            if (!(cause instanceof SQLiteException)) {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else if (th instanceof SQLiteException) {
                        if (databaseName == null || !this.f23d) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.f20a.deleteDatabase(databaseName);
                    try {
                        return h(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                b1.a.c(this.f25f, false, 1, null);
                super.close();
                this.f21b.b(null);
                this.f26g = false;
            } finally {
                this.f25f.d();
            }
        }

        public final z0.g d(boolean z10) {
            try {
                this.f25f.b((this.f26g || getDatabaseName() == null) ? false : true);
                this.f24e = false;
                SQLiteDatabase l10 = l(z10);
                if (this.f24e) {
                    close();
                    return d(z10);
                }
                return e(l10);
            } finally {
                this.f25f.d();
            }
        }

        public final a1.c e(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "sqLiteDatabase");
            return f19h.a(this.f21b, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "db");
            try {
                this.f22c.b(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f22c.d(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            k.f(sQLiteDatabase, "db");
            this.f24e = true;
            try {
                this.f22c.e(e(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "db");
            if (!this.f24e) {
                try {
                    this.f22c.f(e(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f26g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            k.f(sQLiteDatabase, "sqLiteDatabase");
            this.f24e = true;
            try {
                this.f22c.g(e(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* renamed from: a1.d$d */
    /* loaded from: classes.dex */
    public static final class C0004d extends l implements pe.a<c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0004d() {
            super(0);
            d.this = r1;
        }

        @Override // pe.a
        /* renamed from: a */
        public final c invoke() {
            c cVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && d.this.f11b != null && d.this.f13d) {
                cVar = new c(d.this.f10a, new File(z0.d.a(d.this.f10a), d.this.f11b).getAbsolutePath(), new b(null), d.this.f12c, d.this.f14e);
            } else {
                cVar = new c(d.this.f10a, d.this.f11b, new b(null), d.this.f12c, d.this.f14e);
            }
            if (i10 >= 16) {
                z0.b.d(cVar, d.this.f16g);
            }
            return cVar;
        }
    }

    static {
        new a(null);
    }

    public d(Context context, String str, h.a aVar, boolean z10, boolean z11) {
        ee.h<c> a10;
        k.f(context, "context");
        k.f(aVar, "callback");
        this.f10a = context;
        this.f11b = str;
        this.f12c = aVar;
        this.f13d = z10;
        this.f14e = z11;
        a10 = j.a(new C0004d());
        this.f15f = a10;
        this.f17h = a10;
    }

    private final c q() {
        return (c) this.f17h.getValue();
    }

    @Override // z0.h
    public z0.g F0() {
        return q().d(true);
    }

    @Override // z0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15f.isInitialized()) {
            q().close();
        }
    }

    @Override // z0.h
    public String getDatabaseName() {
        return this.f11b;
    }

    @Override // z0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f15f.isInitialized()) {
            z0.b.d(q(), z10);
        }
        this.f16g = z10;
    }
}
