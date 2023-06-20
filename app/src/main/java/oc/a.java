package oc;

import java.lang.annotation.Annotation;
import oc.d;

/* compiled from: AtProtobuf.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f35208a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f35209b = d.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: oc.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0468a implements d {

        /* renamed from: b  reason: collision with root package name */
        private final int f35210b;

        /* renamed from: c  reason: collision with root package name */
        private final d.a f35211c;

        C0468a(int i10, d.a aVar) {
            this.f35210b = i10;
            this.f35211c = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f35210b == dVar.tag() && this.f35211c.equals(dVar.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f35210b ^ 14552422) + (this.f35211c.hashCode() ^ 2041407134);
        }

        @Override // oc.d
        public d.a intEncoding() {
            return this.f35211c;
        }

        @Override // oc.d
        public int tag() {
            return this.f35210b;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f35210b + "intEncoding=" + this.f35211c + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0468a(this.f35208a, this.f35209b);
    }

    public a c(int i10) {
        this.f35208a = i10;
        return this;
    }
}
