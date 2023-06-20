package w7;

import java.util.Arrays;
import java.util.Objects;
import w7.o;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes2.dex */
final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f38275a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f38276b;

    /* renamed from: c  reason: collision with root package name */
    private final u7.d f38277c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes2.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private String f38278a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f38279b;

        /* renamed from: c  reason: collision with root package name */
        private u7.d f38280c;

        @Override // w7.o.a
        public o a() {
            String str = "";
            if (this.f38278a == null) {
                str = " backendName";
            }
            if (this.f38280c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f38278a, this.f38279b, this.f38280c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w7.o.a
        public o.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f38278a = str;
            return this;
        }

        @Override // w7.o.a
        public o.a c(byte[] bArr) {
            this.f38279b = bArr;
            return this;
        }

        @Override // w7.o.a
        public o.a d(u7.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f38280c = dVar;
            return this;
        }
    }

    @Override // w7.o
    public String b() {
        return this.f38275a;
    }

    @Override // w7.o
    public byte[] c() {
        return this.f38276b;
    }

    @Override // w7.o
    public u7.d d() {
        return this.f38277c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f38275a.equals(oVar.b())) {
                if (Arrays.equals(this.f38276b, oVar instanceof d ? ((d) oVar).f38276b : oVar.c()) && this.f38277c.equals(oVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f38275a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38276b)) * 1000003) ^ this.f38277c.hashCode();
    }

    private d(String str, byte[] bArr, u7.d dVar) {
        this.f38275a = str;
        this.f38276b = bArr;
        this.f38277c = dVar;
    }
}
