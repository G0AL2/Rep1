package e9;

import c9.d;
import c9.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import ea.a0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {
    @Override // c9.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new a0(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage c(a0 a0Var) {
        return new EventMessage((String) ea.a.e(a0Var.x()), (String) ea.a.e(a0Var.x()), a0Var.w(), a0Var.w(), Arrays.copyOfRange(a0Var.d(), a0Var.e(), a0Var.f()));
    }
}
