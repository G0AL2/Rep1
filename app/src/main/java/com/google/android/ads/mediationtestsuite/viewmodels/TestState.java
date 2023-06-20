package com.google.android.ads.mediationtestsuite.viewmodels;

import com.google.android.ads.mediationtestsuite.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum g uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class TestState {

    /* renamed from: f  reason: collision with root package name */
    public static final TestState f20944f = new TestState("ERROR", 0, 0, com.google.android.ads.mediationtestsuite.c.f20792e, com.google.android.ads.mediationtestsuite.b.f20780d, com.google.android.ads.mediationtestsuite.b.f20781e, g.f20858g0);

    /* renamed from: g  reason: collision with root package name */
    public static final TestState f20945g;

    /* renamed from: h  reason: collision with root package name */
    public static final TestState f20946h;

    /* renamed from: i  reason: collision with root package name */
    public static final TestState f20947i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ TestState[] f20948j;

    /* renamed from: a  reason: collision with root package name */
    private final int f20949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20950b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20951c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20952d;

    /* renamed from: e  reason: collision with root package name */
    private final int f20953e;

    static {
        int i10 = com.google.android.ads.mediationtestsuite.c.f20799l;
        int i11 = com.google.android.ads.mediationtestsuite.b.f20786j;
        int i12 = com.google.android.ads.mediationtestsuite.b.f20787k;
        int i13 = g.J;
        f20945g = new TestState("WARNING", 1, 1, i10, i11, i12, i13);
        f20946h = new TestState("OK", 2, 2, com.google.android.ads.mediationtestsuite.c.f20790c, com.google.android.ads.mediationtestsuite.b.f20783g, com.google.android.ads.mediationtestsuite.b.f20784h, i13);
        f20947i = new TestState("INFO", 3, 3, com.google.android.ads.mediationtestsuite.c.f20793f, com.google.android.ads.mediationtestsuite.b.f20782f, com.google.android.ads.mediationtestsuite.b.f20785i, i13);
        f20948j = f();
    }

    private TestState(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f20949a = i12;
        this.f20951c = i13;
        this.f20950b = i14;
        this.f20952d = i11;
        this.f20953e = i15;
    }

    private static /* synthetic */ TestState[] f() {
        return new TestState[]{f20944f, f20945g, f20946h, f20947i};
    }

    public static TestState valueOf(String str) {
        return (TestState) Enum.valueOf(TestState.class, str);
    }

    public static TestState[] values() {
        return (TestState[]) f20948j.clone();
    }

    public int g() {
        return this.f20950b;
    }

    public int h() {
        return this.f20949a;
    }

    public int i() {
        return this.f20953e;
    }

    public int j() {
        return this.f20951c;
    }

    public int k() {
        return this.f20952d;
    }
}
