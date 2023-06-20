package ad;

import com.google.firebase.messaging.i0;
import oc.d;

/* compiled from: MessagingClientEventExtension.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ad.a f602a;

    /* compiled from: MessagingClientEventExtension.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private ad.a f603a = null;

        a() {
        }

        public b a() {
            return new b(this.f603a);
        }

        public a b(ad.a aVar) {
            this.f603a = aVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    b(ad.a aVar) {
        this.f602a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public ad.a a() {
        return this.f602a;
    }

    public byte[] c() {
        return i0.a(this);
    }
}
