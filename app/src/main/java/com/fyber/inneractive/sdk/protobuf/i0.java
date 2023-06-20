package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes2.dex */
public final class i0 implements g1 {

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f19890b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final p0 f19891a;

    /* loaded from: classes2.dex */
    public class a implements p0 {
        @Override // com.fyber.inneractive.sdk.protobuf.p0
        public boolean a(Class<?> cls) {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p0
        public o0 b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public p0[] f19892a;

        public b(p0... p0VarArr) {
            this.f19892a = p0VarArr;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p0
        public boolean a(Class<?> cls) {
            for (p0 p0Var : this.f19892a) {
                if (p0Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p0
        public o0 b(Class<?> cls) {
            p0[] p0VarArr;
            for (p0 p0Var : this.f19892a) {
                if (p0Var.a(cls)) {
                    return p0Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public i0() {
        this(a());
    }

    public static p0 a() {
        p0 p0Var;
        p0[] p0VarArr = new p0[2];
        p0VarArr[0] = x.f20072a;
        try {
            p0Var = (p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f19890b;
        }
        p0VarArr[1] = p0Var;
        return new b(p0VarArr);
    }

    public i0(p0 p0Var) {
        this.f19891a = (p0) z.a(p0Var, "messageInfoFactory");
    }
}
