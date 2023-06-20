package j1;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebkitToCompatConverter.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f32179a;

    public h(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f32179a = webkitToCompatConverterBoundaryInterface;
    }

    public c a(WebSettings webSettings) {
        return new c((WebSettingsBoundaryInterface) of.a.a(WebSettingsBoundaryInterface.class, this.f32179a.convertSettings(webSettings)));
    }
}
