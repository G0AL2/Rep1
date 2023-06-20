package yb;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsFileMarker.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f39469a;

    /* renamed from: b  reason: collision with root package name */
    private final dc.f f39470b;

    public m(String str, dc.f fVar) {
        this.f39469a = str;
        this.f39470b = fVar;
    }

    private File b() {
        return this.f39470b.d(this.f39469a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            vb.f f10 = vb.f.f();
            f10.e("Error creating marker: " + this.f39469a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
