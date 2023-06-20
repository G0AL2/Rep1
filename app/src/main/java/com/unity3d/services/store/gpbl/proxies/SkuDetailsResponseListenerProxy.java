package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.listeners.ISkuDetailsResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o2.i;

/* loaded from: classes3.dex */
public class SkuDetailsResponseListenerProxy extends GenericListenerProxy {
    private static final String onSkuDetailsResponseMethodName = "onSkuDetailsResponse";
    private ISkuDetailsResponseListener _skuDetailsResponseListener;

    public SkuDetailsResponseListenerProxy(ISkuDetailsResponseListener iSkuDetailsResponseListener) {
        this._skuDetailsResponseListener = iSkuDetailsResponseListener;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return i.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(onSkuDetailsResponseMethodName)) {
            onSkuDetailsResponse(objArr[0], (List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    public void onSkuDetailsResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                arrayList.add(new SkuDetailsBridge(obj2));
            }
        } else {
            arrayList = null;
        }
        ISkuDetailsResponseListener iSkuDetailsResponseListener = this._skuDetailsResponseListener;
        if (iSkuDetailsResponseListener != null) {
            iSkuDetailsResponseListener.onBillingResponse(new BillingResultBridge(obj), arrayList);
        }
    }
}
