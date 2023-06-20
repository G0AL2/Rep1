package nf;

import java.security.MessageDigest;
import qe.k;

/* compiled from: HashFunction.kt */
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: HashFunction.kt */
    /* loaded from: classes3.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final MessageDigest f34817a;

        a(String str) {
            this.f34817a = MessageDigest.getInstance(str);
        }

        @Override // nf.c
        public byte[] a() {
            return this.f34817a.digest();
        }

        @Override // nf.c
        public void b(byte[] bArr, int i10, int i11) {
            k.f(bArr, "input");
            this.f34817a.update(bArr, i10, i11);
        }
    }

    public static final c a(String str) {
        k.f(str, "algorithm");
        return new a(str);
    }
}
