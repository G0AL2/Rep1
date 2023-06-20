package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AutoClosingRoomOpenHelper.kt */
/* loaded from: classes.dex */
public final class d implements z0.h, g {

    /* renamed from: a  reason: collision with root package name */
    private final z0.h f3857a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.room.c f3858b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3859c;

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class a implements z0.g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.room.c f3860a;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0071a extends qe.l implements pe.l<z0.g, List<? extends Pair<String, String>>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0071a f3861a = new C0071a();

            C0071a() {
                super(1);
            }

            @Override // pe.l
            /* renamed from: a */
            public final List<Pair<String, String>> b(z0.g gVar) {
                qe.k.f(gVar, "obj");
                return gVar.o();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class b extends qe.l implements pe.l<z0.g, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f3862a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f3862a = str;
            }

            @Override // pe.l
            /* renamed from: a */
            public final Object b(z0.g gVar) {
                qe.k.f(gVar, "db");
                gVar.s(this.f3862a);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class c extends qe.l implements pe.l<z0.g, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f3863a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object[] f3864b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f3863a = str;
                this.f3864b = objArr;
            }

            @Override // pe.l
            /* renamed from: a */
            public final Object b(z0.g gVar) {
                qe.k.f(gVar, "db");
                gVar.I(this.f3863a, this.f3864b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* renamed from: androidx.room.d$a$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        /* synthetic */ class C0072d extends qe.j implements pe.l<z0.g, Boolean> {

            /* renamed from: j  reason: collision with root package name */
            public static final C0072d f3865j = new C0072d();

            C0072d() {
                super(1, z0.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // pe.l
            /* renamed from: k */
            public final Boolean b(z0.g gVar) {
                qe.k.f(gVar, "p0");
                return Boolean.valueOf(gVar.S0());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class e extends qe.l implements pe.l<z0.g, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f3866a = new e();

            e() {
                super(1);
            }

            @Override // pe.l
            /* renamed from: a */
            public final Boolean b(z0.g gVar) {
                qe.k.f(gVar, "db");
                if (Build.VERSION.SDK_INT >= 16) {
                    return Boolean.valueOf(gVar.a1());
                }
                return Boolean.FALSE;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class f extends qe.l implements pe.l<z0.g, String> {

            /* renamed from: a  reason: collision with root package name */
            public static final f f3867a = new f();

            f() {
                super(1);
            }

            @Override // pe.l
            /* renamed from: a */
            public final String b(z0.g gVar) {
                qe.k.f(gVar, "obj");
                return gVar.getPath();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        public static final class g extends qe.l implements pe.l<z0.g, Object> {

            /* renamed from: a  reason: collision with root package name */
            public static final g f3868a = new g();

            g() {
                super(1);
            }

            @Override // pe.l
            /* renamed from: a */
            public final Object b(z0.g gVar) {
                qe.k.f(gVar, "it");
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class h extends qe.l implements pe.l<z0.g, Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f3869a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f3870b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ContentValues f3871c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f3872d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object[] f3873e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f3869a = str;
                this.f3870b = i10;
                this.f3871c = contentValues;
                this.f3872d = str2;
                this.f3873e = objArr;
            }

            @Override // pe.l
            /* renamed from: a */
            public final Integer b(z0.g gVar) {
                qe.k.f(gVar, "db");
                return Integer.valueOf(gVar.B0(this.f3869a, this.f3870b, this.f3871c, this.f3872d, this.f3873e));
            }
        }

        public a(androidx.room.c cVar) {
            qe.k.f(cVar, "autoCloser");
            this.f3860a = cVar;
        }

        @Override // z0.g
        public int B0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
            qe.k.f(str, "table");
            qe.k.f(contentValues, "values");
            return ((Number) this.f3860a.g(new h(str, i10, contentValues, str2, objArr))).intValue();
        }

        @Override // z0.g
        public Cursor E(z0.j jVar, CancellationSignal cancellationSignal) {
            qe.k.f(jVar, "query");
            try {
                return new c(this.f3860a.j().E(jVar, cancellationSignal), this.f3860a);
            } catch (Throwable th) {
                this.f3860a.e();
                throw th;
            }
        }

        @Override // z0.g
        public void H() {
            ee.u uVar;
            z0.g h10 = this.f3860a.h();
            if (h10 != null) {
                h10.H();
                uVar = ee.u.f29813a;
            } else {
                uVar = null;
            }
            if (uVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // z0.g
        public void I(String str, Object[] objArr) throws SQLException {
            qe.k.f(str, "sql");
            qe.k.f(objArr, "bindArgs");
            this.f3860a.g(new c(str, objArr));
        }

        @Override // z0.g
        public Cursor I0(String str) {
            qe.k.f(str, "query");
            try {
                return new c(this.f3860a.j().I0(str), this.f3860a);
            } catch (Throwable th) {
                this.f3860a.e();
                throw th;
            }
        }

        @Override // z0.g
        public void J() {
            try {
                this.f3860a.j().J();
            } catch (Throwable th) {
                this.f3860a.e();
                throw th;
            }
        }

        @Override // z0.g
        public void Q() {
            if (this.f3860a.h() != null) {
                try {
                    z0.g h10 = this.f3860a.h();
                    qe.k.c(h10);
                    h10.Q();
                    return;
                } finally {
                    this.f3860a.e();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null".toString());
        }

        @Override // z0.g
        public boolean S0() {
            if (this.f3860a.h() == null) {
                return false;
            }
            return ((Boolean) this.f3860a.g(C0072d.f3865j)).booleanValue();
        }

        public final void a() {
            this.f3860a.g(g.f3868a);
        }

        @Override // z0.g
        public boolean a1() {
            return ((Boolean) this.f3860a.g(e.f3866a)).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f3860a.d();
        }

        @Override // z0.g
        public String getPath() {
            return (String) this.f3860a.g(f.f3867a);
        }

        @Override // z0.g
        public boolean isOpen() {
            z0.g h10 = this.f3860a.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        @Override // z0.g
        public void m() {
            try {
                this.f3860a.j().m();
            } catch (Throwable th) {
                this.f3860a.e();
                throw th;
            }
        }

        @Override // z0.g
        public List<Pair<String, String>> o() {
            return (List) this.f3860a.g(C0071a.f3861a);
        }

        @Override // z0.g
        public void s(String str) throws SQLException {
            qe.k.f(str, "sql");
            this.f3860a.g(new b(str));
        }

        @Override // z0.g
        public z0.k t0(String str) {
            qe.k.f(str, "sql");
            return new b(str, this.f3860a);
        }

        @Override // z0.g
        public Cursor x(z0.j jVar) {
            qe.k.f(jVar, "query");
            try {
                return new c(this.f3860a.j().x(jVar), this.f3860a);
            } catch (Throwable th) {
                this.f3860a.e();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class b implements z0.k {

        /* renamed from: a  reason: collision with root package name */
        private final String f3874a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.room.c f3875b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<Object> f3876c;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class a extends qe.l implements pe.l<z0.k, Long> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f3877a = new a();

            a() {
                super(1);
            }

            @Override // pe.l
            /* renamed from: a */
            public final Long b(z0.k kVar) {
                qe.k.f(kVar, "obj");
                return Long.valueOf(kVar.l0());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* renamed from: androidx.room.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0073b<T> extends qe.l implements pe.l<z0.g, T> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ pe.l<z0.k, T> f3879b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0073b(pe.l<? super z0.k, ? extends T> lVar) {
                super(1);
                this.f3879b = lVar;
            }

            @Override // pe.l
            /* renamed from: a */
            public final T b(z0.g gVar) {
                qe.k.f(gVar, "db");
                z0.k t02 = gVar.t0(b.this.f3874a);
                b.this.d(t02);
                return this.f3879b.b(t02);
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        /* loaded from: classes.dex */
        static final class c extends qe.l implements pe.l<z0.k, Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f3880a = new c();

            c() {
                super(1);
            }

            @Override // pe.l
            /* renamed from: a */
            public final Integer b(z0.k kVar) {
                qe.k.f(kVar, "obj");
                return Integer.valueOf(kVar.v());
            }
        }

        public b(String str, androidx.room.c cVar) {
            qe.k.f(str, "sql");
            qe.k.f(cVar, "autoCloser");
            this.f3874a = str;
            this.f3875b = cVar;
            this.f3876c = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(z0.k kVar) {
            Iterator<T> it = this.f3876c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    fe.p.o();
                }
                Object obj = this.f3876c.get(i10);
                if (obj == null) {
                    kVar.P0(i11);
                } else if (obj instanceof Long) {
                    kVar.A0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.g(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.p0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.D0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final <T> T e(pe.l<? super z0.k, ? extends T> lVar) {
            return (T) this.f3875b.g(new C0073b(lVar));
        }

        private final void h(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f3876c.size() && (size = this.f3876c.size()) <= i11) {
                while (true) {
                    this.f3876c.add(null);
                    if (size == i11) {
                        break;
                    }
                    size++;
                }
            }
            this.f3876c.set(i11, obj);
        }

        @Override // z0.i
        public void A0(int i10, long j10) {
            h(i10, Long.valueOf(j10));
        }

        @Override // z0.i
        public void D0(int i10, byte[] bArr) {
            qe.k.f(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            h(i10, bArr);
        }

        @Override // z0.i
        public void P0(int i10) {
            h(i10, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // z0.i
        public void g(int i10, double d10) {
            h(i10, Double.valueOf(d10));
        }

        @Override // z0.k
        public long l0() {
            return ((Number) e(a.f3877a)).longValue();
        }

        @Override // z0.i
        public void p0(int i10, String str) {
            qe.k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            h(i10, str);
        }

        @Override // z0.k
        public int v() {
            return ((Number) e(c.f3880a)).intValue();
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    /* loaded from: classes.dex */
    private static final class c implements Cursor {

        /* renamed from: a  reason: collision with root package name */
        private final Cursor f3881a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.room.c f3882b;

        public c(Cursor cursor, androidx.room.c cVar) {
            qe.k.f(cursor, "delegate");
            qe.k.f(cVar, "autoCloser");
            this.f3881a = cursor;
            this.f3882b = cVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3881a.close();
            this.f3882b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f3881a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f3881a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f3881a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f3881a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f3881a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f3881a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f3881a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f3881a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f3881a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f3881a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f3881a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f3881a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f3881a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f3881a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return z0.c.a(this.f3881a);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return z0.f.a(this.f3881a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f3881a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f3881a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f3881a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f3881a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f3881a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f3881a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f3881a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f3881a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f3881a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f3881a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f3881a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f3881a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f3881a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f3881a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f3881a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f3881a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f3881a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f3881a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3881a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f3881a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f3881a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            qe.k.f(bundle, "extras");
            z0.e.a(this.f3881a, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f3881a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<? extends Uri> list) {
            qe.k.f(contentResolver, "cr");
            qe.k.f(list, "uris");
            z0.f.b(this.f3881a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f3881a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3881a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(z0.h hVar, androidx.room.c cVar) {
        qe.k.f(hVar, "delegate");
        qe.k.f(cVar, "autoCloser");
        this.f3857a = hVar;
        this.f3858b = cVar;
        cVar.k(a());
        this.f3859c = new a(cVar);
    }

    @Override // z0.h
    public z0.g F0() {
        this.f3859c.a();
        return this.f3859c;
    }

    @Override // androidx.room.g
    public z0.h a() {
        return this.f3857a;
    }

    @Override // z0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3859c.close();
    }

    @Override // z0.h
    public String getDatabaseName() {
        return this.f3857a.getDatabaseName();
    }

    @Override // z0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f3857a.setWriteAheadLoggingEnabled(z10);
    }
}
