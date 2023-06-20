package androidx.room;

import android.database.Cursor;
import android.os.Build;
import java.util.List;
import z0.h;

/* compiled from: RoomOpenHelper.kt */
/* loaded from: classes.dex */
public class m0 extends h.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3956f = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private f f3957b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3958c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3959d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3960e;

    /* compiled from: RoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (r5.getInt(0) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r5.getInt(0) == 0) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(z0.g r5) {
            /*
                r4 = this;
                java.lang.String r0 = "db"
                qe.k.f(r5, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r5 = r5.I0(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 1
                r2 = 0
                r3 = 15
                if (r0 <= r3) goto L2d
                r0 = 0
                boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L26
                if (r3 == 0) goto L21
                int r3 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L26
                if (r3 != 0) goto L21
                goto L22
            L21:
                r1 = 0
            L22:
                ne.a.a(r5, r0)
                return r1
            L26:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L28
            L28:
                r1 = move-exception
                ne.a.a(r5, r0)
                throw r1
            L2d:
                boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L3f
                if (r0 == 0) goto L3a
                int r0 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L3f
                if (r0 != 0) goto L3a
                goto L3b
            L3a:
                r1 = 0
            L3b:
                r5.close()
                return r1
            L3f:
                r0 = move-exception
                r5.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.m0.a.a(z0.g):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (r5.getInt(0) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r5.getInt(0) != 0) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(z0.g r5) {
            /*
                r4 = this;
                java.lang.String r0 = "db"
                qe.k.f(r5, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r5 = r5.I0(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 1
                r2 = 0
                r3 = 15
                if (r0 <= r3) goto L2d
                r0 = 0
                boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L26
                if (r3 == 0) goto L21
                int r3 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L26
                if (r3 == 0) goto L21
                goto L22
            L21:
                r1 = 0
            L22:
                ne.a.a(r5, r0)
                return r1
            L26:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L28
            L28:
                r1 = move-exception
                ne.a.a(r5, r0)
                throw r1
            L2d:
                boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L3f
                if (r0 == 0) goto L3a
                int r0 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L3f
                if (r0 == 0) goto L3a
                goto L3b
            L3a:
                r1 = 0
            L3b:
                r5.close()
                return r1
            L3f:
                r0 = move-exception
                r5.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.m0.a.b(z0.g):boolean");
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static abstract class b {
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(z0.g gVar);

        public abstract void dropAllTables(z0.g gVar);

        public abstract void onCreate(z0.g gVar);

        public abstract void onOpen(z0.g gVar);

        public abstract void onPostMigrate(z0.g gVar);

        public abstract void onPreMigrate(z0.g gVar);

        public abstract c onValidateSchema(z0.g gVar);

        protected void validateMigration(z0.g gVar) {
            qe.k.f(gVar, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3961a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3962b;

        public c(boolean z10, String str) {
            this.f3961a = z10;
            this.f3962b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f fVar, b bVar, String str, String str2) {
        super(bVar.version);
        qe.k.f(fVar, "configuration");
        qe.k.f(bVar, "delegate");
        qe.k.f(str, "identityHash");
        qe.k.f(str2, "legacyHash");
        this.f3957b = fVar;
        this.f3958c = bVar;
        this.f3959d = str;
        this.f3960e = str2;
    }

    private final void h(z0.g gVar) {
        String string;
        if (f3956f.b(gVar)) {
            Cursor x10 = gVar.x(new z0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            if (Build.VERSION.SDK_INT > 15) {
                try {
                    string = x10.moveToFirst() ? x10.getString(0) : null;
                    ne.a.a(x10, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ne.a.a(x10, th);
                        throw th2;
                    }
                }
            } else {
                try {
                    String string2 = x10.moveToFirst() ? x10.getString(0) : null;
                    x10.close();
                    string = string2;
                } catch (Throwable th3) {
                    x10.close();
                    throw th3;
                }
            }
            if (qe.k.a(this.f3959d, string) || qe.k.a(this.f3960e, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f3959d + ", found: " + string);
        }
        c onValidateSchema = this.f3958c.onValidateSchema(gVar);
        if (onValidateSchema.f3961a) {
            this.f3958c.onPostMigrate(gVar);
            j(gVar);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f3962b);
    }

    private final void i(z0.g gVar) {
        gVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(z0.g gVar) {
        i(gVar);
        gVar.s(l0.a(this.f3959d));
    }

    @Override // z0.h.a
    public void b(z0.g gVar) {
        qe.k.f(gVar, "db");
        super.b(gVar);
    }

    @Override // z0.h.a
    public void d(z0.g gVar) {
        qe.k.f(gVar, "db");
        boolean a10 = f3956f.a(gVar);
        this.f3958c.createAllTables(gVar);
        if (!a10) {
            c onValidateSchema = this.f3958c.onValidateSchema(gVar);
            if (!onValidateSchema.f3961a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f3962b);
            }
        }
        j(gVar);
        this.f3958c.onCreate(gVar);
    }

    @Override // z0.h.a
    public void e(z0.g gVar, int i10, int i11) {
        qe.k.f(gVar, "db");
        g(gVar, i10, i11);
    }

    @Override // z0.h.a
    public void f(z0.g gVar) {
        qe.k.f(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f3958c.onOpen(gVar);
        this.f3957b = null;
    }

    @Override // z0.h.a
    public void g(z0.g gVar, int i10, int i11) {
        List<x0.b> d10;
        qe.k.f(gVar, "db");
        f fVar = this.f3957b;
        boolean z10 = false;
        if (fVar != null && (d10 = fVar.f3894d.d(i10, i11)) != null) {
            this.f3958c.onPreMigrate(gVar);
            for (x0.b bVar : d10) {
                bVar.migrate(gVar);
            }
            c onValidateSchema = this.f3958c.onValidateSchema(gVar);
            if (onValidateSchema.f3961a) {
                this.f3958c.onPostMigrate(gVar);
                j(gVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f3962b);
            }
        }
        if (z10) {
            return;
        }
        f fVar2 = this.f3957b;
        if (fVar2 != null && !fVar2.a(i10, i11)) {
            this.f3958c.dropAllTables(gVar);
            this.f3958c.createAllTables(gVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
