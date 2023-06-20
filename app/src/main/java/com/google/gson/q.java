package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f23895a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f23896b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ q[] f23897c;

    /* compiled from: LongSerializationPolicy.java */
    /* loaded from: classes3.dex */
    enum a extends q {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f23895a = aVar;
        q qVar = new q("STRING", 1) { // from class: com.google.gson.q.b
        };
        f23896b = qVar;
        f23897c = new q[]{aVar, qVar};
    }

    private q(String str, int i10) {
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f23897c.clone();
    }

    /* synthetic */ q(String str, int i10, a aVar) {
        this(str, i10);
    }
}
