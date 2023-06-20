package y1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<u> f39002a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(u uVar) {
        this.f39002a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f39002a.size() - 1; size >= 0; size--) {
            i2.h.b(path, this.f39002a.get(size));
        }
    }
}
