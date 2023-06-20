package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum d uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f19827c;

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f19828d;

    /* renamed from: e  reason: collision with root package name */
    public static final b0 f19829e;

    /* renamed from: f  reason: collision with root package name */
    public static final b0 f19830f;

    /* renamed from: g  reason: collision with root package name */
    public static final b0 f19831g;

    /* renamed from: h  reason: collision with root package name */
    public static final b0 f19832h;

    /* renamed from: i  reason: collision with root package name */
    public static final b0 f19833i;

    /* renamed from: j  reason: collision with root package name */
    public static final b0 f19834j;

    /* renamed from: k  reason: collision with root package name */
    public static final b0 f19835k;

    /* renamed from: l  reason: collision with root package name */
    public static final b0 f19836l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ b0[] f19837m;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f19838a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f19839b;

    static {
        b0 b0Var = new b0("VOID", 0, Void.class, Void.class, null);
        f19827c = b0Var;
        Class cls = Integer.TYPE;
        b0 b0Var2 = new b0("INT", 1, cls, Integer.class, 0);
        f19828d = b0Var2;
        b0 b0Var3 = new b0("LONG", 2, Long.TYPE, Long.class, 0L);
        f19829e = b0Var3;
        b0 b0Var4 = new b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19830f = b0Var4;
        b0 b0Var5 = new b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19831g = b0Var5;
        b0 b0Var6 = new b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19832h = b0Var6;
        b0 b0Var7 = new b0("STRING", 6, String.class, String.class, "");
        f19833i = b0Var7;
        b0 b0Var8 = new b0("BYTE_STRING", 7, i.class, i.class, i.f19881b);
        f19834j = b0Var8;
        b0 b0Var9 = new b0("ENUM", 8, cls, Integer.class, null);
        f19835k = b0Var9;
        b0 b0Var10 = new b0("MESSAGE", 9, Object.class, Object.class, null);
        f19836l = b0Var10;
        f19837m = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10};
    }

    public b0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f19838a = cls2;
        this.f19839b = obj;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f19837m.clone();
    }
}
