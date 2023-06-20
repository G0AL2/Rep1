package z0;

import android.annotation.SuppressLint;

/* compiled from: SimpleSQLiteQuery.kt */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final C0558a f39880c = new C0558a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f39881a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f39882b;

    /* compiled from: SimpleSQLiteQuery.kt */
    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0558a {
        private C0558a() {
        }

        public /* synthetic */ C0558a(qe.g gVar) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.P0(i10);
            } else if (obj instanceof byte[]) {
                iVar.D0(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                iVar.g(i10, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                iVar.g(i10, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                iVar.A0(i10, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                iVar.A0(i10, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                iVar.A0(i10, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                iVar.A0(i10, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                iVar.p0(i10, (String) obj);
            } else if (obj instanceof Boolean) {
                iVar.A0(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(i iVar, Object[] objArr) {
            qe.k.f(iVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(iVar, i10, obj);
            }
        }
    }

    public a(String str, Object[] objArr) {
        qe.k.f(str, "query");
        this.f39881a = str;
        this.f39882b = objArr;
    }

    @Override // z0.j
    public void a(i iVar) {
        qe.k.f(iVar, "statement");
        f39880c.b(iVar, this.f39882b);
    }

    @Override // z0.j
    public String b() {
        return this.f39881a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, null);
        qe.k.f(str, "query");
    }
}
