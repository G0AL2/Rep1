package f8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes2.dex */
public final class t0 extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String f30178c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    static int f30179d = 5;

    /* renamed from: e */
    private static final a f30180e;

    /* renamed from: f */
    private static final a f30181f;

    /* renamed from: g */
    private static final a f30182g;

    /* renamed from: h */
    private static final a f30183h;

    /* renamed from: i */
    private static final a f30184i;

    /* renamed from: j */
    private static final List<a> f30185j;

    /* renamed from: a */
    private final int f30186a;

    /* renamed from: b */
    private boolean f30187b;

    /* compiled from: SchemaManager.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        r0 r0Var = new a() { // from class: f8.r0
            @Override // f8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.e(sQLiteDatabase);
            }
        };
        f30180e = r0Var;
        o0 o0Var = new a() { // from class: f8.o0
            @Override // f8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.a(sQLiteDatabase);
            }
        };
        f30181f = o0Var;
        p0 p0Var = new a() { // from class: f8.p0
            @Override // f8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.b(sQLiteDatabase);
            }
        };
        f30182g = p0Var;
        q0 q0Var = new a() { // from class: f8.q0
            @Override // f8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.d(sQLiteDatabase);
            }
        };
        f30183h = q0Var;
        s0 s0Var = new a() { // from class: f8.s0
            @Override // f8.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.h(sQLiteDatabase);
            }
        };
        f30184i = s0Var;
        f30185j = Arrays.asList(r0Var, o0Var, p0Var, q0Var, s0Var);
    }

    public t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f30187b = false;
        this.f30186a = i10;
    }

    public static /* synthetic */ void A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f30178c);
    }

    private void C(SQLiteDatabase sQLiteDatabase, int i10) {
        l(sQLiteDatabase);
        L(sQLiteDatabase, 0, i10);
    }

    private void L(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f30185j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f30185j.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        w(sQLiteDatabase);
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        z(sQLiteDatabase);
    }

    public static /* synthetic */ void e(SQLiteDatabase sQLiteDatabase) {
        q(sQLiteDatabase);
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) {
        A(sQLiteDatabase);
    }

    private void l(SQLiteDatabase sQLiteDatabase) {
        if (this.f30187b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public static /* synthetic */ void q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f30187b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C(sQLiteDatabase, this.f30186a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        C(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l(sQLiteDatabase);
        L(sQLiteDatabase, i10, i11);
    }
}
