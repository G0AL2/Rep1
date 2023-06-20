package z0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import ve.p;

/* compiled from: SupportSQLiteOpenHelper.kt */
/* loaded from: classes.dex */
public interface h extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f39883a;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        /* renamed from: z0.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0559a {
            private C0559a() {
            }

            public /* synthetic */ C0559a(qe.g gVar) {
                this();
            }
        }

        static {
            new C0559a(null);
        }

        public a(int i10) {
            this.f39883a = i10;
        }

        private final void a(String str) {
            boolean l10;
            l10 = p.l(str, ":memory:", true);
            if (l10) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = qe.k.h(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    z0.b.a(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e10) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e10);
                    }
                }
            } catch (Exception e11) {
                Log.w("SupportSQLite", "delete failed: ", e11);
            }
        }

        public void b(g gVar) {
            qe.k.f(gVar, "db");
        }

        public void c(g gVar) {
            qe.k.f(gVar, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar + ".path");
            if (!gVar.isOpen()) {
                String path = gVar.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = gVar.o();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            qe.k.e(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String path2 = gVar.getPath();
                        if (path2 != null) {
                            a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                gVar.close();
            } catch (IOException unused2) {
            }
            if (list != null) {
                return;
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g gVar) {
            qe.k.f(gVar, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final C0560b f39884f = new C0560b(null);

        /* renamed from: a  reason: collision with root package name */
        public final Context f39885a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39886b;

        /* renamed from: c  reason: collision with root package name */
        public final a f39887c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f39888d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f39889e;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private final Context f39890a;

            /* renamed from: b  reason: collision with root package name */
            private String f39891b;

            /* renamed from: c  reason: collision with root package name */
            private a f39892c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f39893d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f39894e;

            public a(Context context) {
                qe.k.f(context, "context");
                this.f39890a = context;
            }

            public a a(boolean z10) {
                this.f39894e = z10;
                return this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
                if ((r0 == null || r0.length() == 0) == false) goto L18;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public z0.h.b b() {
                /*
                    r7 = this;
                    z0.h$a r3 = r7.f39892c
                    if (r3 == 0) goto L38
                    boolean r0 = r7.f39893d
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L1a
                    java.lang.String r0 = r7.f39891b
                    if (r0 == 0) goto L17
                    int r0 = r0.length()
                    if (r0 != 0) goto L15
                    goto L17
                L15:
                    r0 = 0
                    goto L18
                L17:
                    r0 = 1
                L18:
                    if (r0 != 0) goto L1b
                L1a:
                    r1 = 1
                L1b:
                    if (r1 == 0) goto L2c
                    z0.h$b r6 = new z0.h$b
                    android.content.Context r1 = r7.f39890a
                    java.lang.String r2 = r7.f39891b
                    boolean r4 = r7.f39893d
                    boolean r5 = r7.f39894e
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
                L2c:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a non-null database name to a configuration that uses the no backup directory."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L38:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a callback to create the configuration."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: z0.h.b.a.b():z0.h$b");
            }

            public a c(a aVar) {
                qe.k.f(aVar, "callback");
                this.f39892c = aVar;
                return this;
            }

            public a d(String str) {
                this.f39891b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f39893d = z10;
                return this;
            }
        }

        /* compiled from: SupportSQLiteOpenHelper.kt */
        /* renamed from: z0.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0560b {
            private C0560b() {
            }

            public /* synthetic */ C0560b(qe.g gVar) {
                this();
            }

            public final a a(Context context) {
                qe.k.f(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            qe.k.f(context, "context");
            qe.k.f(aVar, "callback");
            this.f39885a = context;
            this.f39886b = str;
            this.f39887c = aVar;
            this.f39888d = z10;
            this.f39889e = z11;
        }

        public static final a a(Context context) {
            return f39884f.a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public interface c {
        h a(b bVar);
    }

    g F0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
