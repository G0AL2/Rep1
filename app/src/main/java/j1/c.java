package j1;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: WebSettingsAdapter.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private WebSettingsBoundaryInterface f32148a;

    public c(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f32148a = webSettingsBoundaryInterface;
    }

    public void a(int i10) {
        this.f32148a.setForceDark(i10);
    }

    public void b(int i10) {
        this.f32148a.setForceDarkBehavior(i10);
    }
}
