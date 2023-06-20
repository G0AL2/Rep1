package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final n0.b f2948a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f2949b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2950c = new a(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f2951d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f2952a;

        /* renamed from: b  reason: collision with root package name */
        private f f2953b;

        private a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray<a> sparseArray = this.f2952a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final f b() {
            return this.f2953b;
        }

        void c(f fVar, int i10, int i11) {
            a a10 = a(fVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f2952a.put(fVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(fVar, i10 + 1, i11);
            } else {
                a10.f2953b = fVar;
            }
        }

        a(int i10) {
            this.f2952a = new SparseArray<>(i10);
        }
    }

    private l(Typeface typeface, n0.b bVar) {
        this.f2951d = typeface;
        this.f2948a = bVar;
        this.f2949b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(n0.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            f fVar = new f(this, i10);
            Character.toChars(fVar.f(), this.f2949b, i10 * 2);
            h(fVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            e0.j.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            e0.j.b();
        }
    }

    public char[] c() {
        return this.f2949b;
    }

    public n0.b d() {
        return this.f2948a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f2948a.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a f() {
        return this.f2950c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface g() {
        return this.f2951d;
    }

    void h(f fVar) {
        h0.g.g(fVar, "emoji metadata cannot be null");
        h0.g.a(fVar.c() > 0, "invalid metadata codepoint length");
        this.f2950c.c(fVar, 0, fVar.c() - 1);
    }
}
