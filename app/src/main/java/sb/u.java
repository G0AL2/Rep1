package sb;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class u implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f36967a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar) {
        this.f36967a = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        boolean f10;
        k kVar;
        if (z10) {
            this.f36967a.f36970c = true;
            this.f36967a.c();
            return;
        }
        this.f36967a.f36970c = false;
        f10 = this.f36967a.f();
        if (f10) {
            kVar = this.f36967a.f36969b;
            kVar.c();
        }
    }
}
