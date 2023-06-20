package x2;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import n3.a;

/* compiled from: VideoFileManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f38686a = new ConcurrentHashMap<>();

    public static synchronized void a(Context context, l3.c cVar, a.InterfaceC0454a interfaceC0454a) {
        synchronized (c.class) {
            if (cVar == null) {
                o3.c.d(" url、dir and hash is must property   in VideoInfoModel");
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ConcurrentHashMap<String, b> concurrentHashMap = f38686a;
                b bVar = concurrentHashMap.get(cVar.A());
                if (bVar == null) {
                    bVar = new b(context, cVar);
                    concurrentHashMap.put(cVar.A(), bVar);
                    o3.c.j("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.h()), cVar.A());
                }
                bVar.f(interfaceC0454a);
            }
            o3.c.j("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.h()), cVar.A());
        }
    }

    public static synchronized void b(l3.c cVar) {
        synchronized (c.class) {
            if (Build.VERSION.SDK_INT >= 23) {
                b remove = f38686a.remove(cVar.A());
                if (remove != null) {
                    remove.j(true);
                }
                o3.c.j("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(cVar.h()), cVar.A());
            }
        }
    }
}
