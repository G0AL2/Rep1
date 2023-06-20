package r9;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes2.dex */
public abstract class e extends m8.j<j, k, h> implements g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleSubtitleDecoder.java */
    /* loaded from: classes2.dex */
    public class a extends k {
        a() {
        }

        @Override // m8.h
        public void o() {
            e.this.r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(String str) {
        super(new j[2], new k[2]);
        u(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m8.j
    /* renamed from: A */
    public final h j(j jVar, k kVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ea.a.e(jVar.f34290c);
            kVar.p(jVar.f34292e, z(byteBuffer.array(), byteBuffer.limit(), z10), jVar.f36527i);
            kVar.h(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override // r9.g
    public void a(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m8.j
    /* renamed from: w */
    public final j g() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m8.j
    /* renamed from: x */
    public final k h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m8.j
    /* renamed from: y */
    public final h i(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    protected abstract f z(byte[] bArr, int i10, boolean z10) throws h;
}
