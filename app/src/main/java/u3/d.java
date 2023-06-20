package u3;

import java.io.IOException;
import java.util.Collection;

/* compiled from: DiskStorage.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: DiskStorage.java */
    /* loaded from: classes.dex */
    public interface a {
        long a();

        String getId();

        long getSize();
    }

    /* compiled from: DiskStorage.java */
    /* loaded from: classes.dex */
    public interface b {
        com.facebook.binaryresource.a a(Object obj) throws IOException;

        void b(t3.j jVar, Object obj) throws IOException;

        boolean i();
    }

    void a();

    boolean b(String str, Object obj) throws IOException;

    boolean c();

    void clearAll() throws IOException;

    b d(String str, Object obj) throws IOException;

    boolean e(String str, Object obj) throws IOException;

    com.facebook.binaryresource.a f(String str, Object obj) throws IOException;

    Collection<a> g() throws IOException;

    long h(a aVar) throws IOException;

    long remove(String str) throws IOException;
}
