package j1;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: IncompatibleApkWebViewProviderFactory.java */
/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f32147a = new String[0];

    @Override // j1.f
    public String[] a() {
        return f32147a;
    }

    @Override // j1.f
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
