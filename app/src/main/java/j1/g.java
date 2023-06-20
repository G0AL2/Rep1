package j1;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebViewProviderFactoryAdapter.java */
/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f32178a;

    public g(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f32178a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // j1.f
    public String[] a() {
        return this.f32178a.getSupportedFeatures();
    }

    @Override // j1.f
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) of.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f32178a.getWebkitToCompatConverter());
    }
}
