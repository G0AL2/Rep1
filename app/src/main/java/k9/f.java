package k9;

import android.net.Uri;
import da.e0;
import da.l0;
import j8.p1;
import java.util.List;
import java.util.Map;

/* compiled from: Chunk.java */
/* loaded from: classes2.dex */
public abstract class f implements e0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f33385a = i9.n.a();

    /* renamed from: b  reason: collision with root package name */
    public final da.p f33386b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33387c;

    /* renamed from: d  reason: collision with root package name */
    public final p1 f33388d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33389e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f33390f;

    /* renamed from: g  reason: collision with root package name */
    public final long f33391g;

    /* renamed from: h  reason: collision with root package name */
    public final long f33392h;

    /* renamed from: i  reason: collision with root package name */
    protected final l0 f33393i;

    public f(da.l lVar, da.p pVar, int i10, p1 p1Var, int i11, Object obj, long j10, long j11) {
        this.f33393i = new l0(lVar);
        this.f33386b = (da.p) ea.a.e(pVar);
        this.f33387c = i10;
        this.f33388d = p1Var;
        this.f33389e = i11;
        this.f33390f = obj;
        this.f33391g = j10;
        this.f33392h = j11;
    }

    public final long a() {
        return this.f33393i.q();
    }

    public final long c() {
        return this.f33392h - this.f33391g;
    }

    public final Map<String, List<String>> d() {
        return this.f33393i.s();
    }

    public final Uri e() {
        return this.f33393i.r();
    }
}
