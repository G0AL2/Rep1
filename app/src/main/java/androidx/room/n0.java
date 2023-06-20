package androidx.room;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.kt */
/* loaded from: classes.dex */
public final class n0 implements z0.j, z0.i {

    /* renamed from: i  reason: collision with root package name */
    public static final a f3964i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final TreeMap<Integer, n0> f3965j = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f3966a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f3967b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f3968c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f3969d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f3970e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[][] f3971f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f3972g;

    /* renamed from: h  reason: collision with root package name */
    private int f3973h;

    /* compiled from: RoomSQLiteQuery.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        public final n0 a(String str, int i10) {
            qe.k.f(str, "query");
            TreeMap<Integer, n0> treeMap = n0.f3965j;
            synchronized (treeMap) {
                Map.Entry<Integer, n0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    n0 value = ceilingEntry.getValue();
                    value.h(str, i10);
                    qe.k.e(value, "sqliteQuery");
                    return value;
                }
                ee.u uVar = ee.u.f29813a;
                n0 n0Var = new n0(i10, null);
                n0Var.h(str, i10);
                return n0Var;
            }
        }

        public final void b() {
            TreeMap<Integer, n0> treeMap = n0.f3965j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            qe.k.e(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }
    }

    private n0(int i10) {
        this.f3966a = i10;
        int i11 = i10 + 1;
        this.f3972g = new int[i11];
        this.f3968c = new long[i11];
        this.f3969d = new double[i11];
        this.f3970e = new String[i11];
        this.f3971f = new byte[i11];
    }

    public /* synthetic */ n0(int i10, qe.g gVar) {
        this(i10);
    }

    public static final n0 d(String str, int i10) {
        return f3964i.a(str, i10);
    }

    @Override // z0.i
    public void A0(int i10, long j10) {
        this.f3972g[i10] = 2;
        this.f3968c[i10] = j10;
    }

    @Override // z0.i
    public void D0(int i10, byte[] bArr) {
        qe.k.f(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f3972g[i10] = 5;
        this.f3971f[i10] = bArr;
    }

    @Override // z0.i
    public void P0(int i10) {
        this.f3972g[i10] = 1;
    }

    @Override // z0.j
    public void a(z0.i iVar) {
        qe.k.f(iVar, "statement");
        int e10 = e();
        if (1 > e10) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f3972g[i10];
            if (i11 == 1) {
                iVar.P0(i10);
            } else if (i11 == 2) {
                iVar.A0(i10, this.f3968c[i10]);
            } else if (i11 == 3) {
                iVar.g(i10, this.f3969d[i10]);
            } else if (i11 == 4) {
                String str = this.f3970e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iVar.p0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f3971f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iVar.D0(i10, bArr);
            }
            if (i10 == e10) {
                return;
            }
            i10++;
        }
    }

    @Override // z0.j
    public String b() {
        String str = this.f3967b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public int e() {
        return this.f3973h;
    }

    @Override // z0.i
    public void g(int i10, double d10) {
        this.f3972g[i10] = 3;
        this.f3969d[i10] = d10;
    }

    public final void h(String str, int i10) {
        qe.k.f(str, "query");
        this.f3967b = str;
        this.f3973h = i10;
    }

    @Override // z0.i
    public void p0(int i10, String str) {
        qe.k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f3972g[i10] = 4;
        this.f3970e[i10] = str;
    }

    public final void release() {
        TreeMap<Integer, n0> treeMap = f3965j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f3966a), this);
            f3964i.b();
            ee.u uVar = ee.u.f29813a;
        }
    }
}
