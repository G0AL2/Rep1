package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes2.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public volatile q0 f19851a;

    /* renamed from: b  reason: collision with root package name */
    public volatile i f19852b;

    static {
        q.a();
    }

    public i a() {
        if (this.f19852b != null) {
            return this.f19852b;
        }
        synchronized (this) {
            if (this.f19852b != null) {
                return this.f19852b;
            }
            if (this.f19851a == null) {
                this.f19852b = i.f19881b;
            } else {
                this.f19852b = this.f19851a.toByteString();
            }
            return this.f19852b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            q0 q0Var = this.f19851a;
            q0 q0Var2 = d0Var.f19851a;
            if (q0Var == null && q0Var2 == null) {
                return a().equals(d0Var.a());
            }
            if (q0Var == null || q0Var2 == null) {
                if (q0Var != null) {
                    return q0Var.equals(d0Var.a(q0Var.getDefaultInstanceForType()));
                }
                return a(q0Var2.getDefaultInstanceForType()).equals(q0Var2);
            }
            return q0Var.equals(q0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public q0 a(q0 q0Var) {
        if (this.f19851a == null) {
            synchronized (this) {
                if (this.f19851a == null) {
                    try {
                        this.f19851a = q0Var;
                        this.f19852b = i.f19881b;
                    } catch (a0 unused) {
                        this.f19851a = q0Var;
                        this.f19852b = i.f19881b;
                    }
                }
            }
        }
        return this.f19851a;
    }
}
