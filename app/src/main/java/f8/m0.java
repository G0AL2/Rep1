package f8;

import a8.a;
import a8.c;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import g8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import w7.i;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes2.dex */
public class m0 implements f8.d, g8.b, f8.c {

    /* renamed from: f */
    private static final u7.b f30147f = u7.b.b("proto");

    /* renamed from: a */
    private final t0 f30148a;

    /* renamed from: b */
    private final h8.a f30149b;

    /* renamed from: c */
    private final h8.a f30150c;

    /* renamed from: d */
    private final e f30151d;

    /* renamed from: e */
    private final y7.a<String> f30152e;

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        final String f30153a;

        /* renamed from: b */
        final String f30154b;

        private c(String str, String str2) {
            this.f30153a = str;
            this.f30154b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    public interface d<T> {
        T a();
    }

    public m0(h8.a aVar, h8.a aVar2, e eVar, t0 t0Var, y7.a<String> aVar3) {
        this.f30148a = t0Var;
        this.f30149b = aVar;
        this.f30150c = aVar2;
        this.f30151d = eVar;
        this.f30152e = aVar3;
    }

    public static /* synthetic */ byte[] A(Cursor cursor) {
        return D1(cursor);
    }

    public /* synthetic */ Object A1(List list, w7.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = w7.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new w7.h(Q1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new w7.h(Q1(cursor.getString(4)), O1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    public static /* synthetic */ Object B1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public static /* synthetic */ List C(Cursor cursor) {
        return w1(cursor);
    }

    public static /* synthetic */ Object C0(m0 m0Var, Cursor cursor) {
        return m0Var.E1(cursor);
    }

    public /* synthetic */ Long C1(w7.i iVar, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (j1()) {
            a(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long T0 = T0(sQLiteDatabase, oVar);
        int e10 = this.f30151d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(T0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put(Analytics.Param.CODE, iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ byte[] D1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Integer E0(m0 m0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        return m0Var.m1(j10, sQLiteDatabase);
    }

    public /* synthetic */ Object E1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            a(i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public /* synthetic */ Object F1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        S1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: f8.g0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.C0(m0.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean G1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ List H0(SQLiteDatabase sQLiteDatabase) {
        return v1(sQLiteDatabase);
    }

    public static /* synthetic */ Object H1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) S1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.f())}), new b() { // from class: f8.x
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.K0((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(IronSourceConstants.EVENTS_ERROR_REASON, Integer.valueOf(bVar.f()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.f())});
        }
        return null;
    }

    public static /* synthetic */ Object I1(long j10, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(i8.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(i8.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ Object J1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f30149b.a()).execute();
        return null;
    }

    public static /* synthetic */ Boolean K0(Cursor cursor) {
        return G1(cursor);
    }

    private List<k> K1(SQLiteDatabase sQLiteDatabase, final w7.o oVar) {
        final ArrayList arrayList = new ArrayList();
        Long d12 = d1(sQLiteDatabase, oVar);
        if (d12 == null) {
            return arrayList;
        }
        S1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", Analytics.Param.CODE, "inline"}, "context_id = ?", new String[]{d12.toString()}, null, null, null, String.valueOf(this.f30151d.d())), new b() { // from class: f8.l0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.g0(m0.this, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ Object L(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        return H1(str, bVar, j10, sQLiteDatabase);
    }

    private Map<Long, Set<c>> L1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        S1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb2.toString(), null, null, null, null), new b() { // from class: f8.r
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.s0(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    private static byte[] M1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private c.b N0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.f()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.f()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.f()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.f()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.f()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.f()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.f()) {
            return bVar7;
        }
        b8.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void N1(a.C0006a c0006a, Map<String, List<a8.c>> map) {
        for (Map.Entry<String, List<a8.c>> entry : map.entrySet()) {
            c0006a.a(a8.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    public static /* synthetic */ Object O(m0 m0Var, Cursor cursor) {
        return m0Var.l1(cursor);
    }

    private byte[] O1(long j10) {
        return (byte[]) S1(X0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: f8.s
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.A((Cursor) obj);
            }
        });
    }

    private <T> T P1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f30150c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f30150c.a() >= this.f30151d.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private void Q0(final SQLiteDatabase sQLiteDatabase) {
        P1(new d() { // from class: f8.c0
            @Override // f8.m0.d
            public final Object a() {
                return m0.y(sQLiteDatabase);
            }
        }, new b() { // from class: f8.b0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.l((Throwable) obj);
            }
        });
    }

    private static u7.b Q1(String str) {
        if (str == null) {
            return f30147f;
        }
        return u7.b.b(str);
    }

    private static String R1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T S1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Boolean T(m0 m0Var, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        return m0Var.u1(oVar, sQLiteDatabase);
    }

    private long T0(SQLiteDatabase sQLiteDatabase, w7.o oVar) {
        Long d12 = d1(sQLiteDatabase, oVar);
        if (d12 != null) {
            return d12.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(i8.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ a8.f U(long j10, SQLiteDatabase sQLiteDatabase) {
        return s1(j10, sQLiteDatabase);
    }

    private a8.b Y0() {
        return a8.b.b().b(a8.e.c().b(U0()).c(e.f30121a.f()).a()).a();
    }

    public static /* synthetic */ Long Z(Cursor cursor) {
        return q1(cursor);
    }

    private long Z0() {
        return X0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long b1() {
        return X0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private a8.f c1() {
        final long a10 = this.f30149b.a();
        return (a8.f) i1(new b() { // from class: f8.w
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.U(a10, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ a8.a d0(m0 m0Var, String str, Map map, a.C0006a c0006a, SQLiteDatabase sQLiteDatabase) {
        return m0Var.z1(str, map, c0006a, sQLiteDatabase);
    }

    private Long d1(SQLiteDatabase sQLiteDatabase, w7.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(i8.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) S1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: f8.v
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.m0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object g0(m0 m0Var, List list, w7.o oVar, Cursor cursor) {
        return m0Var.A1(list, oVar, cursor);
    }

    public static /* synthetic */ SQLiteDatabase h(Throwable th) {
        return p1(th);
    }

    public static /* synthetic */ Object h0(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        return m0Var.J1(sQLiteDatabase);
    }

    private boolean j1() {
        return Z0() * b1() >= this.f30151d.f();
    }

    private List<k> k1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f30153a, cVar.f30154b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Object l(Throwable th) {
        return o1(th);
    }

    public /* synthetic */ Object l1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            a(i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Long m0(Cursor cursor) {
        return t1(cursor);
    }

    public /* synthetic */ Integer m1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        S1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: f8.f0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.O(m0.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object n1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object o1(Throwable th) {
        throw new g8.a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase p1(Throwable th) {
        throw new g8.a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ a8.f q(long j10, Cursor cursor) {
        return r1(j10, cursor);
    }

    public static /* synthetic */ Object q0(m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        return m0Var.F1(str, str2, sQLiteDatabase);
    }

    public static /* synthetic */ Long q1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Long r0(m0 m0Var, w7.i iVar, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        return m0Var.C1(iVar, oVar, sQLiteDatabase);
    }

    public static /* synthetic */ a8.f r1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return a8.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ Object s0(Map map, Cursor cursor) {
        return B1(map, cursor);
    }

    public static /* synthetic */ a8.f s1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (a8.f) S1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: f8.l
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.q(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long t1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public /* synthetic */ Boolean u1(w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long d12 = d1(sQLiteDatabase, oVar);
        if (d12 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) S1(X0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d12.toString()}), new b() { // from class: f8.y
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ List v1(SQLiteDatabase sQLiteDatabase) {
        return (List) S1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: f8.t
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.C((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List w(m0 m0Var, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        return m0Var.x1(oVar, sQLiteDatabase);
    }

    public static /* synthetic */ List w1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(w7.o.a().b(cursor.getString(1)).d(i8.a.b(cursor.getInt(2))).c(M1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public /* synthetic */ List x1(w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> K1 = K1(sQLiteDatabase, oVar);
        return k1(K1, L1(sQLiteDatabase, K1));
    }

    public static /* synthetic */ Object y(SQLiteDatabase sQLiteDatabase) {
        return n1(sQLiteDatabase);
    }

    public /* synthetic */ a8.a y1(Map map, a.C0006a c0006a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b N0 = N0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(a8.c.c().c(N0).b(j10).a());
        }
        N1(c0006a, map);
        c0006a.e(c1());
        c0006a.d(Y0());
        c0006a.c(this.f30152e.get());
        return c0006a.b();
    }

    public static /* synthetic */ Object z(long j10, w7.o oVar, SQLiteDatabase sQLiteDatabase) {
        return I1(j10, oVar, sQLiteDatabase);
    }

    public static /* synthetic */ a8.a z0(m0 m0Var, Map map, a.C0006a c0006a, Cursor cursor) {
        return m0Var.y1(map, c0006a, cursor);
    }

    public /* synthetic */ a8.a z1(String str, final Map map, final a.C0006a c0006a, SQLiteDatabase sQLiteDatabase) {
        return (a8.a) S1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: f8.m
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.z0(m0.this, map, c0006a, (Cursor) obj);
            }
        });
    }

    @Override // f8.d
    public Iterable<w7.o> B() {
        return (Iterable) i1(new b() { // from class: f8.z
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.H0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // f8.d
    public k R0(final w7.o oVar, final w7.i iVar) {
        b8.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) i1(new b() { // from class: f8.n
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.r0(m0.this, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    long U0() {
        return Z0() * b1();
    }

    @Override // f8.d
    public long V0(w7.o oVar) {
        return ((Long) S1(X0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(i8.a.a(oVar.d()))}), new b() { // from class: f8.u
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.Z((Cursor) obj);
            }
        })).longValue();
    }

    SQLiteDatabase X0() {
        final t0 t0Var = this.f30148a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) P1(new d() { // from class: f8.d0
            @Override // f8.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: f8.a0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.h((Throwable) obj);
            }
        });
    }

    @Override // f8.c
    public void a(final long j10, final c.b bVar, final String str) {
        i1(new b() { // from class: f8.q
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.L(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f8.c
    public void b() {
        i1(new b() { // from class: f8.h0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.h0(m0.this, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30148a.close();
    }

    @Override // f8.c
    public a8.a d() {
        final a.C0006a e10 = a8.a.e();
        final HashMap hashMap = new HashMap();
        return (a8.a) i1(new b() { // from class: f8.k0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.d0(m0.this, r2, hashMap, e10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g8.b
    public <T> T e(b.a<T> aVar) {
        SQLiteDatabase X0 = X0();
        Q0(X0);
        try {
            T h10 = aVar.h();
            X0.setTransactionSuccessful();
            return h10;
        } finally {
            X0.endTransaction();
        }
    }

    @Override // f8.d
    public boolean g1(final w7.o oVar) {
        return ((Boolean) i1(new b() { // from class: f8.p
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.T(m0.this, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // f8.d
    public int i() {
        final long a10 = this.f30149b.a() - this.f30151d.c();
        return ((Integer) i1(new b() { // from class: f8.i0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.E0(m0.this, a10, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // f8.d
    public void i0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + R1(iterable);
            i1(new b() { // from class: f8.j0
                @Override // f8.m0.b
                public final Object apply(Object obj) {
                    return m0.q0(m0.this, str, r3, (SQLiteDatabase) obj);
                }
            });
        }
    }

    <T> T i1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase X0 = X0();
        X0.beginTransaction();
        try {
            T apply = bVar.apply(X0);
            X0.setTransactionSuccessful();
            return apply;
        } finally {
            X0.endTransaction();
        }
    }

    @Override // f8.d
    public void n(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            X0().compileStatement("DELETE FROM events WHERE _id in " + R1(iterable)).execute();
        }
    }

    @Override // f8.d
    public void r(final w7.o oVar, final long j10) {
        i1(new b() { // from class: f8.e0
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.z(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f8.d
    public Iterable<k> v0(final w7.o oVar) {
        return (Iterable) i1(new b() { // from class: f8.o
            @Override // f8.m0.b
            public final Object apply(Object obj) {
                return m0.w(m0.this, oVar, (SQLiteDatabase) obj);
            }
        });
    }
}
