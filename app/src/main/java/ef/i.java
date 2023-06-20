package ef;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;
import ye.b0;
import ye.u;

/* compiled from: RequestLine.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f29834a = new i();

    private i() {
    }

    private final boolean b(b0 b0Var, Proxy.Type type) {
        return !b0Var.g() && type == Proxy.Type.HTTP;
    }

    public final String a(b0 b0Var, Proxy.Type type) {
        qe.k.f(b0Var, "request");
        qe.k.f(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b0Var.h());
        sb2.append(' ');
        i iVar = f29834a;
        if (iVar.b(b0Var, type)) {
            sb2.append(b0Var.l());
        } else {
            sb2.append(iVar.c(b0Var.l()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String c(u uVar) {
        qe.k.f(uVar, ImagesContract.URL);
        String d10 = uVar.d();
        String f10 = uVar.f();
        if (f10 != null) {
            return d10 + '?' + f10;
        }
        return d10;
    }
}
