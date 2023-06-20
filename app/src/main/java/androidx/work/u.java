package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4733a;

    /* renamed from: b  reason: collision with root package name */
    private a f4734b;

    /* renamed from: c  reason: collision with root package name */
    private e f4735c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f4736d;

    /* renamed from: e  reason: collision with root package name */
    private e f4737e;

    /* renamed from: f  reason: collision with root package name */
    private int f4738f;

    /* compiled from: WorkInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean f() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public u(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i10, int i11) {
        this.f4733a = uuid;
        this.f4734b = aVar;
        this.f4735c = eVar;
        this.f4736d = new HashSet(list);
        this.f4737e = eVar2;
        this.f4738f = i10;
    }

    public UUID a() {
        return this.f4733a;
    }

    public e b() {
        return this.f4737e;
    }

    public a c() {
        return this.f4734b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f4738f == uVar.f4738f && this.f4733a.equals(uVar.f4733a) && this.f4734b == uVar.f4734b && this.f4735c.equals(uVar.f4735c) && this.f4736d.equals(uVar.f4736d)) {
            return this.f4737e.equals(uVar.f4737e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f4733a.hashCode() * 31) + this.f4734b.hashCode()) * 31) + this.f4735c.hashCode()) * 31) + this.f4736d.hashCode()) * 31) + this.f4737e.hashCode()) * 31) + this.f4738f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f4733a + "', mState=" + this.f4734b + ", mOutputData=" + this.f4735c + ", mTags=" + this.f4736d + ", mProgress=" + this.f4737e + '}';
    }
}
