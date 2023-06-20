package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f19977a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f19978b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f19979c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f19980d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f19981e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f19982f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f19983g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f19984h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f19985i;

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f19986j;

    /* loaded from: classes2.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f19987a;

        public d(Unsafe unsafe) {
            this.f19987a = unsafe;
        }

        public abstract byte a(long j10);

        public abstract void a(long j10, byte[] bArr, long j11, long j12);

        public abstract void a(Object obj, long j10, byte b10);

        public abstract void a(Object obj, long j10, double d10);

        public abstract void a(Object obj, long j10, float f10);

        public abstract void a(Object obj, long j10, boolean z10);

        public boolean a() {
            Unsafe unsafe = this.f19987a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                r1.a(th);
                return false;
            }
        }

        public abstract boolean a(Object obj, long j10);

        public abstract byte b(Object obj, long j10);

        public abstract boolean b();

        public abstract double c(Object obj, long j10);

        public abstract float d(Object obj, long j10);
    }

    static {
        Unsafe unsafe;
        d dVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f19977a = unsafe;
        f19978b = com.fyber.inneractive.sdk.protobuf.d.f19849a;
        boolean c10 = c(Long.TYPE);
        f19979c = c10;
        boolean c11 = c(Integer.TYPE);
        f19980d = c11;
        if (unsafe != null) {
            if (!com.fyber.inneractive.sdk.protobuf.d.a()) {
                dVar = new c(unsafe);
            } else if (c10) {
                dVar = new b(unsafe);
            } else if (c11) {
                dVar = new a(unsafe);
            }
        }
        f19981e = dVar;
        f19982f = dVar == null ? false : dVar.b();
        f19983g = dVar == null ? false : dVar.a();
        f19984h = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field a10 = a();
        f19985i = (a10 == null || dVar == null) ? -1L : dVar.f19987a.objectFieldOffset(a10);
        f19986j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class<?> cls) {
        if (f19983g) {
            return f19981e.f19987a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int b(Class<?> cls) {
        if (f19983g) {
            return f19981e.f19987a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static boolean c(Class<?> cls) {
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            try {
                Class<?> cls2 = f19978b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static byte d(Object obj, long j10) {
        return (byte) ((e(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int e(Object obj, long j10) {
        return f19981e.f19987a.getInt(obj, j10);
    }

    public static long f(Object obj, long j10) {
        return f19981e.f19987a.getLong(obj, j10);
    }

    public static Object g(Object obj, long j10) {
        return f19981e.f19987a.getObject(obj, j10);
    }

    /* loaded from: classes2.dex */
    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, byte b10) {
            if (r1.f19986j) {
                r1.a(obj, j10, b10);
            } else {
                r1.b(obj, j10, b10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public byte b(Object obj, long j10) {
            if (r1.f19986j) {
                return r1.c(obj, j10);
            }
            return r1.d(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public double c(Object obj, long j10) {
            return Double.longBitsToDouble(this.f19987a.getLong(obj, j10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public float d(Object obj, long j10) {
            return Float.intBitsToFloat(this.f19987a.getInt(obj, j10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public boolean a(Object obj, long j10) {
            if (r1.f19986j) {
                return r1.a(obj, j10);
            }
            return r1.b(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, boolean z10) {
            if (r1.f19986j) {
                r1.a(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                r1.b(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, float f10) {
            this.f19987a.putInt(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, double d10) {
            this.f19987a.putLong(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public byte a(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, byte b10) {
            if (r1.f19986j) {
                r1.a(obj, j10, b10);
            } else {
                r1.b(obj, j10, b10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public byte b(Object obj, long j10) {
            if (r1.f19986j) {
                return r1.c(obj, j10);
            }
            return r1.d(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public double c(Object obj, long j10) {
            return Double.longBitsToDouble(this.f19987a.getLong(obj, j10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public float d(Object obj, long j10) {
            return Float.intBitsToFloat(this.f19987a.getInt(obj, j10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public boolean a(Object obj, long j10) {
            if (r1.f19986j) {
                return r1.a(obj, j10);
            }
            return r1.b(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, boolean z10) {
            if (r1.f19986j) {
                r1.a(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                r1.b(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, float f10) {
            this.f19987a.putInt(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, double d10) {
            this.f19987a.putLong(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public byte a(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }
    }

    public static void a(Object obj, long j10, int i10) {
        f19981e.f19987a.putInt(obj, j10, i10);
    }

    public static void b(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (e(obj, j11) & (~(255 << i10))));
    }

    public static void a(Object obj, long j10, long j11) {
        f19981e.f19987a.putLong(obj, j10, j11);
    }

    public static boolean b(Object obj, long j10) {
        return d(obj, j10) != 0;
    }

    public static void a(Object obj, long j10, boolean z10) {
        f19981e.a(obj, j10, z10);
    }

    public static void a(Object obj, long j10, float f10) {
        f19981e.a(obj, j10, f10);
    }

    public static void a(Object obj, long j10, double d10) {
        f19981e.a(obj, j10, d10);
    }

    public static void a(Object obj, long j10, Object obj2) {
        f19981e.f19987a.putObject(obj, j10, obj2);
    }

    /* loaded from: classes2.dex */
    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public boolean a() {
            if (super.a()) {
                try {
                    Class<?> cls = this.f19987a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    r1.a(th);
                    return false;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                sun.misc.Unsafe r2 = r11.f19987a
                java.lang.String r3 = "getLong"
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto Le
                goto L2e
            Le:
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L32
                java.lang.String r7 = "objectFieldOffset"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
                r8[r6] = r9     // Catch: java.lang.Throwable -> L32
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L32
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L32
                r7[r6] = r1     // Catch: java.lang.Throwable -> L32
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
                r7[r5] = r8     // Catch: java.lang.Throwable -> L32
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L32
                java.lang.reflect.Field r2 = com.fyber.inneractive.sdk.protobuf.r1.a()     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L30
            L2e:
                r2 = 0
                goto L37
            L30:
                r2 = 1
                goto L37
            L32:
                r2 = move-exception
                com.fyber.inneractive.sdk.protobuf.r1.a(r2)
                goto L2e
            L37:
                if (r2 != 0) goto L3a
                return r6
            L3a:
                sun.misc.Unsafe r2 = r11.f19987a     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "getByte"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "putByte"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r10 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "getInt"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r7 = "putInt"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r8[r6] = r9     // Catch: java.lang.Throwable -> L9e
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9e
                r8[r5] = r10     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r3 = "putLong"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L9e
                r3 = 3
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r4] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9e
                r7 = 5
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L9e
                r7[r6] = r1     // Catch: java.lang.Throwable -> L9e
                r7[r5] = r9     // Catch: java.lang.Throwable -> L9e
                r7[r4] = r1     // Catch: java.lang.Throwable -> L9e
                r7[r3] = r9     // Catch: java.lang.Throwable -> L9e
                r1 = 4
                r7[r1] = r9     // Catch: java.lang.Throwable -> L9e
                r2.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L9e
                return r5
            L9e:
                r0 = move-exception
                com.fyber.inneractive.sdk.protobuf.r1.a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r1.c.b():boolean");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public double c(Object obj, long j10) {
            return this.f19987a.getDouble(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public float d(Object obj, long j10) {
            return this.f19987a.getFloat(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, byte b10) {
            this.f19987a.putByte(obj, j10, b10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public boolean a(Object obj, long j10) {
            return this.f19987a.getBoolean(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, boolean z10) {
            this.f19987a.putBoolean(obj, j10, z10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, float f10) {
            this.f19987a.putFloat(obj, j10, f10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(Object obj, long j10, double d10) {
            this.f19987a.putDouble(obj, j10, d10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public byte a(long j10) {
            return this.f19987a.getByte(j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public byte b(Object obj, long j10) {
            return this.f19987a.getByte(obj, j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.r1.d
        public void a(long j10, byte[] bArr, long j11, long j12) {
            this.f19987a.copyMemory((Object) null, j10, bArr, r1.f19984h + j11, j12);
        }
    }

    public static byte c(Object obj, long j10) {
        return (byte) ((e(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte a(byte[] bArr, long j10) {
        return f19981e.b(bArr, f19984h + j10);
    }

    public static void a(byte[] bArr, long j10, byte b10) {
        f19981e.a((Object) bArr, f19984h + j10, b10);
    }

    public static long a(ByteBuffer byteBuffer) {
        d dVar = f19981e;
        return dVar.f19987a.getLong(byteBuffer, f19985i);
    }

    public static Field a() {
        Field field;
        Field field2;
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void a(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int e10 = e(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (e10 & (~(255 << i10))));
    }

    public static boolean a(Object obj, long j10) {
        return c(obj, j10) != 0;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(r1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
