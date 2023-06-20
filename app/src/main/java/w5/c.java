package w5;

import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: CloseableImage.java */
/* loaded from: classes.dex */
public abstract class c implements Closeable, h {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f38201b = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"));

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f38202a = new HashMap();

    public j a() {
        return i.f38227d;
    }

    public abstract int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean d() {
        return false;
    }

    public void e(String str, Object obj) {
        if (f38201b.contains(str)) {
            this.f38202a.put(str, obj);
        }
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        z3.a.I("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // w5.g
    public Map<String, Object> getExtras() {
        return this.f38202a;
    }

    public void h(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f38201b) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f38202a.put(str, obj);
            }
        }
    }

    public abstract boolean isClosed();
}
