package j8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes2.dex */
final class s2 extends a {

    /* renamed from: e  reason: collision with root package name */
    private final int f32795e;

    /* renamed from: f  reason: collision with root package name */
    private final int f32796f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f32797g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f32798h;

    /* renamed from: i  reason: collision with root package name */
    private final j3[] f32799i;

    /* renamed from: j  reason: collision with root package name */
    private final Object[] f32800j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<Object, Integer> f32801k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(Collection<? extends g2> collection, i9.q0 q0Var) {
        super(false, q0Var);
        int i10 = 0;
        int size = collection.size();
        this.f32797g = new int[size];
        this.f32798h = new int[size];
        this.f32799i = new j3[size];
        this.f32800j = new Object[size];
        this.f32801k = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (g2 g2Var : collection) {
            this.f32799i[i12] = g2Var.a();
            this.f32798h[i12] = i10;
            this.f32797g[i12] = i11;
            i10 += this.f32799i[i12].p();
            i11 += this.f32799i[i12].i();
            this.f32800j[i12] = g2Var.e();
            this.f32801k.put(this.f32800j[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f32795e = i10;
        this.f32796f = i11;
    }

    @Override // j8.a
    protected int A(int i10) {
        return this.f32798h[i10];
    }

    @Override // j8.a
    protected j3 D(int i10) {
        return this.f32799i[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<j3> E() {
        return Arrays.asList(this.f32799i);
    }

    @Override // j8.j3
    public int i() {
        return this.f32796f;
    }

    @Override // j8.j3
    public int p() {
        return this.f32795e;
    }

    @Override // j8.a
    protected int s(Object obj) {
        Integer num = this.f32801k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // j8.a
    protected int t(int i10) {
        return ea.n0.h(this.f32797g, i10 + 1, false, false);
    }

    @Override // j8.a
    protected int u(int i10) {
        return ea.n0.h(this.f32798h, i10 + 1, false, false);
    }

    @Override // j8.a
    protected Object x(int i10) {
        return this.f32800j[i10];
    }

    @Override // j8.a
    protected int z(int i10) {
        return this.f32797g[i10];
    }
}
