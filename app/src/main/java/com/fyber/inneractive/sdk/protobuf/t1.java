package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f20010a = a(1, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final int f20011b = a(1, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final int f20012c = a(2, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f20013d = a(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f20014c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f20015d;

        /* renamed from: e  reason: collision with root package name */
        public static final b f20016e;

        /* renamed from: f  reason: collision with root package name */
        public static final b f20017f;

        /* renamed from: g  reason: collision with root package name */
        public static final b f20018g;

        /* renamed from: h  reason: collision with root package name */
        public static final b f20019h;

        /* renamed from: i  reason: collision with root package name */
        public static final b f20020i;

        /* renamed from: j  reason: collision with root package name */
        public static final b f20021j;

        /* renamed from: k  reason: collision with root package name */
        public static final b f20022k;

        /* renamed from: l  reason: collision with root package name */
        public static final b f20023l;

        /* renamed from: m  reason: collision with root package name */
        public static final b f20024m;

        /* renamed from: n  reason: collision with root package name */
        public static final b f20025n;

        /* renamed from: o  reason: collision with root package name */
        public static final b f20026o;

        /* renamed from: p  reason: collision with root package name */
        public static final b f20027p;

        /* renamed from: q  reason: collision with root package name */
        public static final b f20028q;

        /* renamed from: r  reason: collision with root package name */
        public static final b f20029r;

        /* renamed from: s  reason: collision with root package name */
        public static final b f20030s;

        /* renamed from: t  reason: collision with root package name */
        public static final b f20031t;

        /* renamed from: u  reason: collision with root package name */
        public static final /* synthetic */ b[] f20032u;

        /* renamed from: a  reason: collision with root package name */
        public final c f20033a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20034b;

        /* loaded from: classes2.dex */
        public enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum C0268b extends b {
            public C0268b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.t1.b
            public boolean f() {
                return false;
            }
        }

        /* loaded from: classes2.dex */
        public enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.t1.b
            public boolean f() {
                return false;
            }
        }

        /* loaded from: classes2.dex */
        public enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.t1.b
            public boolean f() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f20014c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f20015d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f20016e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f20017f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f20018g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f20019h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f20020i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f20021j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f20022k = aVar;
            c cVar3 = c.MESSAGE;
            C0268b c0268b = new C0268b("GROUP", 9, cVar3, 3);
            f20023l = c0268b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f20024m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f20025n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f20026o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f20027p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f20028q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f20029r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f20030s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f20031t = bVar14;
            f20032u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0268b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f20032u.clone();
        }

        public boolean f() {
            return !(this instanceof a);
        }

        public b(String str, int i10, c cVar, int i11) {
            this.f20033a = cVar;
            this.f20034b = i11;
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.f19881b),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: a  reason: collision with root package name */
        public final Object f20045a;

        c(Object obj) {
            this.f20045a = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20046a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f20047b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ d[] f20048c;

        /* loaded from: classes2.dex */
        public enum a extends d {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.t1.d
            public Object a(j jVar) throws IOException {
                return jVar.r();
            }
        }

        /* loaded from: classes2.dex */
        public enum b extends d {
            public b(String str, int i10) {
                super(str, i10);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.t1.d
            public Object a(j jVar) throws IOException {
                return jVar.s();
            }
        }

        /* loaded from: classes2.dex */
        public enum c extends d {
            public c(String str, int i10) {
                super(str, i10);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.t1.d
            public Object a(j jVar) throws IOException {
                return jVar.e();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            f20046a = aVar;
            b bVar = new b("STRICT", 1);
            f20047b = bVar;
            f20048c = new d[]{aVar, bVar, new c("LAZY", 2)};
        }

        public d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f20048c.clone();
        }

        public abstract Object a(j jVar) throws IOException;
    }

    public static int a(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static Object a(j jVar, b bVar, d dVar) throws IOException {
        switch (bVar.ordinal()) {
            case 0:
                return Double.valueOf(jVar.f());
            case 1:
                return Float.valueOf(jVar.j());
            case 2:
                return Long.valueOf(jVar.l());
            case 3:
                return Long.valueOf(jVar.v());
            case 4:
                return Integer.valueOf(jVar.k());
            case 5:
                return Long.valueOf(jVar.i());
            case 6:
                return Integer.valueOf(jVar.h());
            case 7:
                return Boolean.valueOf(jVar.d());
            case 8:
                return dVar.a(jVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return jVar.e();
            case 12:
                return Integer.valueOf(jVar.u());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(jVar.n());
            case 15:
                return Long.valueOf(jVar.o());
            case 16:
                return Integer.valueOf(jVar.p());
            case 17:
                return Long.valueOf(jVar.q());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
