package gf;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* compiled from: StreamResetException.kt */
/* loaded from: classes3.dex */
public final class n extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final b f31047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super("stream was reset: " + bVar);
        qe.k.f(bVar, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f31047a = bVar;
    }
}
