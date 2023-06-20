package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final v f20057c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f20058d;

    /* renamed from: e  reason: collision with root package name */
    public static final v[] f20059e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ v[] f20060f;

    /* renamed from: a  reason: collision with root package name */
    public final int f20061a;

    /* renamed from: b  reason: collision with root package name */
    public final a f20062b;
    /* JADX INFO: Fake field, exist only in values array */
    v EF6;

    /* loaded from: classes2.dex */
    public enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a  reason: collision with root package name */
        public final boolean f20068a;

        a(boolean z10) {
            this.f20068a = z10;
        }
    }

    static {
        a aVar = a.SCALAR;
        b0 b0Var = b0.f19831g;
        v vVar = new v("DOUBLE", 0, 0, aVar, b0Var);
        b0 b0Var2 = b0.f19830f;
        v vVar2 = new v("FLOAT", 1, 1, aVar, b0Var2);
        b0 b0Var3 = b0.f19829e;
        v vVar3 = new v("INT64", 2, 2, aVar, b0Var3);
        v vVar4 = new v("UINT64", 3, 3, aVar, b0Var3);
        b0 b0Var4 = b0.f19828d;
        v vVar5 = new v("INT32", 4, 4, aVar, b0Var4);
        v vVar6 = new v("FIXED64", 5, 5, aVar, b0Var3);
        v vVar7 = new v("FIXED32", 6, 6, aVar, b0Var4);
        b0 b0Var5 = b0.f19832h;
        v vVar8 = new v("BOOL", 7, 7, aVar, b0Var5);
        b0 b0Var6 = b0.f19833i;
        v vVar9 = new v("STRING", 8, 8, aVar, b0Var6);
        b0 b0Var7 = b0.f19836l;
        v vVar10 = new v("MESSAGE", 9, 9, aVar, b0Var7);
        b0 b0Var8 = b0.f19834j;
        v vVar11 = new v("BYTES", 10, 10, aVar, b0Var8);
        v vVar12 = new v("UINT32", 11, 11, aVar, b0Var4);
        b0 b0Var9 = b0.f19835k;
        v vVar13 = new v("ENUM", 12, 12, aVar, b0Var9);
        v vVar14 = new v("SFIXED32", 13, 13, aVar, b0Var4);
        v vVar15 = new v("SFIXED64", 14, 14, aVar, b0Var3);
        v vVar16 = new v("SINT32", 15, 15, aVar, b0Var4);
        v vVar17 = new v("SINT64", 16, 16, aVar, b0Var3);
        v vVar18 = new v("GROUP", 17, 17, aVar, b0Var7);
        a aVar2 = a.VECTOR;
        v vVar19 = new v("DOUBLE_LIST", 18, 18, aVar2, b0Var);
        v vVar20 = new v("FLOAT_LIST", 19, 19, aVar2, b0Var2);
        v vVar21 = new v("INT64_LIST", 20, 20, aVar2, b0Var3);
        v vVar22 = new v("UINT64_LIST", 21, 21, aVar2, b0Var3);
        v vVar23 = new v("INT32_LIST", 22, 22, aVar2, b0Var4);
        v vVar24 = new v("FIXED64_LIST", 23, 23, aVar2, b0Var3);
        v vVar25 = new v("FIXED32_LIST", 24, 24, aVar2, b0Var4);
        v vVar26 = new v("BOOL_LIST", 25, 25, aVar2, b0Var5);
        v vVar27 = new v("STRING_LIST", 26, 26, aVar2, b0Var6);
        v vVar28 = new v("MESSAGE_LIST", 27, 27, aVar2, b0Var7);
        v vVar29 = new v("BYTES_LIST", 28, 28, aVar2, b0Var8);
        v vVar30 = new v("UINT32_LIST", 29, 29, aVar2, b0Var4);
        v vVar31 = new v("ENUM_LIST", 30, 30, aVar2, b0Var9);
        v vVar32 = new v("SFIXED32_LIST", 31, 31, aVar2, b0Var4);
        v vVar33 = new v("SFIXED64_LIST", 32, 32, aVar2, b0Var3);
        v vVar34 = new v("SINT32_LIST", 33, 33, aVar2, b0Var4);
        v vVar35 = new v("SINT64_LIST", 34, 34, aVar2, b0Var3);
        a aVar3 = a.PACKED_VECTOR;
        v vVar36 = new v("DOUBLE_LIST_PACKED", 35, 35, aVar3, b0Var);
        f20057c = vVar36;
        v vVar37 = new v("FLOAT_LIST_PACKED", 36, 36, aVar3, b0Var2);
        v vVar38 = new v("INT64_LIST_PACKED", 37, 37, aVar3, b0Var3);
        v vVar39 = new v("UINT64_LIST_PACKED", 38, 38, aVar3, b0Var3);
        v vVar40 = new v("INT32_LIST_PACKED", 39, 39, aVar3, b0Var4);
        v vVar41 = new v("FIXED64_LIST_PACKED", 40, 40, aVar3, b0Var3);
        v vVar42 = new v("FIXED32_LIST_PACKED", 41, 41, aVar3, b0Var4);
        v vVar43 = new v("BOOL_LIST_PACKED", 42, 42, aVar3, b0Var5);
        v vVar44 = new v("UINT32_LIST_PACKED", 43, 43, aVar3, b0Var4);
        v vVar45 = new v("ENUM_LIST_PACKED", 44, 44, aVar3, b0Var9);
        v vVar46 = new v("SFIXED32_LIST_PACKED", 45, 45, aVar3, b0Var4);
        v vVar47 = new v("SFIXED64_LIST_PACKED", 46, 46, aVar3, b0Var3);
        v vVar48 = new v("SINT32_LIST_PACKED", 47, 47, aVar3, b0Var4);
        v vVar49 = new v("SINT64_LIST_PACKED", 48, 48, aVar3, b0Var3);
        f20058d = vVar49;
        f20060f = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, vVar26, vVar27, vVar28, vVar29, vVar30, vVar31, vVar32, vVar33, vVar34, vVar35, vVar36, vVar37, vVar38, vVar39, vVar40, vVar41, vVar42, vVar43, vVar44, vVar45, vVar46, vVar47, vVar48, vVar49, new v("GROUP_LIST", 49, 49, aVar2, b0Var7), new v("MAP", 50, 50, a.MAP, b0.f19827c)};
        v[] values = values();
        f20059e = new v[values.length];
        for (v vVar50 : values) {
            f20059e[vVar50.f20061a] = vVar50;
        }
    }

    public v(String str, int i10, int i11, a aVar, b0 b0Var) {
        this.f20061a = i11;
        this.f20062b = aVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            b0Var.getClass();
        } else if (ordinal == 3) {
            b0Var.getClass();
        }
        if (aVar == a.SCALAR) {
            b0Var.ordinal();
        }
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f20060f.clone();
    }
}
