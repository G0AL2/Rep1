package bb;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f5201a = new HashMap();

    public final synchronized void a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && this.f5201a.get(str) == null) {
                this.f5201a.put(str, obj);
            }
        }
    }

    public final synchronized boolean b() {
        Object obj = this.f5201a.get("usingExtractorStream");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }
}
