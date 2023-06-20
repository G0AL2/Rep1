package c9;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* compiled from: SimpleMetadataDecoder.java */
/* loaded from: classes2.dex */
public abstract class f implements b {
    @Override // c9.b
    public final Metadata a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ea.a.e(dVar.f34290c);
        ea.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.k()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    protected abstract Metadata b(d dVar, ByteBuffer byteBuffer);
}
