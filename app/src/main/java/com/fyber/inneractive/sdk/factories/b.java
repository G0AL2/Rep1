package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<com.fyber.inneractive.sdk.response.a, InterfaceC0234b> f17183a = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f17184a = new b();
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0234b {
        com.fyber.inneractive.sdk.interfaces.a a();

        com.fyber.inneractive.sdk.response.b b();
    }

    public com.fyber.inneractive.sdk.response.b a(com.fyber.inneractive.sdk.response.a aVar) {
        InterfaceC0234b interfaceC0234b = this.f17183a.get(aVar);
        if (interfaceC0234b != null) {
            return interfaceC0234b.b();
        }
        return null;
    }

    public void a(com.fyber.inneractive.sdk.response.a aVar, InterfaceC0234b interfaceC0234b) {
        if (this.f17183a.containsKey(aVar)) {
            IAlog.e("Handler already exists for ad type %s! : %s", aVar, this.f17183a.get(aVar));
        } else {
            this.f17183a.put(aVar, interfaceC0234b);
        }
    }
}
